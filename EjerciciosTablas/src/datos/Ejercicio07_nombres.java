package datos;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Ejercicio07_nombres {

	// Se pretende desarrollar una aplicación que nos ayude a gestionar las notas de
	// un centro educativo.
	// Cada clase está compuesta por 10 alumnos.
	// Se pide leer las notas del primer, segundo y tercer trimestre almacenándolas
	// en una tabla. Debemos mostrar la nota media final de cada alumno y de cada
	// clase en cada trimestre. Por último, desarrolle un método que se le pase un
	// número de alumno y devuelve la media final de ese alumno

	private static Scanner sc = new Scanner(System.in);
	private static Random rnd = new Random();

	public static void main(String[] args) {

		System.out.println("¿numero de alumnos?: ");
		int num = sc.nextInt();
		double[][] clase = new double[num][3];
		String[] alumnos=new String[num];
		inicializaClase(alumnos);
		inicializaClase(clase);
		//imprimeAlumnos(alumnos);
		imprimeClase(clase, alumnos);
		imprimeMedia(clase);
		String alumno;
		
		do {System.out.println("\nAlumno a consultar [1..." + (clase.length ) + "]: ");
		alumno = sc.next();
			int id=encuentraAlumno(alumnos, alumno);
			if (id>=0)
			consulta(id, clase);
			else if (id==-1)
				System.out.println("*-Alumno no encontrado-*");
			
		} while (alumno != "nadie");
		System.out.println("Gracias por usar nuestro sistema");
	}

	private static void imprimeAlumnos(String[] alumnos) {
		for (int i = 0; i < alumnos.length; i++)
			System.out.println(alumnos[i]);
	}

	private static int encuentraAlumno(String[] alumnos, String alumno) {
		int id = -1;
		if (alumno == "nadie")
			return -2;
		else
			for (int i = 0; i < alumnos.length; i++)
				if (alumno.equals(alumnos[i]))
					id = i;
		return id;
	}

	private static void inicializaClase(String[] alumnos) {
		for (int i = 0; i < alumnos.length; i++)
			alumnos[i]=UUID.randomUUID().toString().substring(0, 5);
	}

	private static void consulta(int i, double[][] clase) {
		System.out.printf("La media del alumno es: %.2f", ((clase[i][0] + clase[i][1] + clase[i][2]) / clase[i].length));
	}
	
	

	private static void imprimeMedia(double[][] clase) {
		double e1 = 0, e2 = 0, e3 = 0;

		for (int i = 0; i < clase.length; i++) {
			e1 += clase[i][0];
			e2 += clase[i][1];
			e3 += clase[i][2];
		}
		System.out.printf("Media:  %.2f| %.2f| %.2f|", e1 / clase.length, e2 /  clase.length, e3 / clase.length);

	}

	private static void imprimeClase(double[][] clase) {
		System.out.println("ID)   E1 |  E2 |  E3 |");

		for (int i = 0; i < clase.length; i++) {

			System.out.printf("%2d) ",(i+1));
			for (int j = 0; j < (clase[i].length); j++)
				System.out.printf(" %.2f|", clase[i][j]);
			System.out.println();
		}

	}
	private static void imprimeClase(double[][] clase, String[] alumnos) {
		System.out.println("nombre   E1 |  E2 |  E3 |");

		for (int i = 0; i < clase.length; i++) {

			System.out.print(alumnos[i]+"\t");
			for (int j = 0; j < (clase[i].length); j++)
				System.out.printf(" %.2f|", clase[i][j]);
			System.out.println();
		}

	}

	private static void inicializaClase(double[][] clase) {
		for (int i = 0; i < clase.length; i++) {

			for (int j = 0; j < (clase[i].length); j++)
				clase[i][j] = (rnd.nextInt(1000) / 100.0);
		}
	}

}
