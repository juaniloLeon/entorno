package datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {

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

		inicializaClase(clase);
		imprimeClase(clase);
		imprimeMedia(clase);
		int alumno;
		
		do {System.out.println("\nAlumno a consultar [1..." + (clase.length ) + "]: ");
		alumno = sc.nextInt();
			if(alumno<=num && alumno>0)
			consulta(alumno-1, clase);
			else if(alumno!=0)
				System.out.println("*-Alumno no encontrado-*");
			
		} while (alumno != 0);
		System.out.println("Gracias por usar nuestro sistema");
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
		System.out.printf("M:  %.2f| %.2f| %.2f|", e1 / clase.length, e2 /  clase.length, e3 / clase.length);

	}

	private static void imprimeClase(double[][] clase) {
		System.out.println("ID)  E1 |  E2 |  E3 |");

		for (int i = 0; i < clase.length; i++) {

			System.out.print((i+1) + ") ");
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
