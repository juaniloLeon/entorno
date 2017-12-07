package datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	// Declarar 2 tablas unidimensionales de n elementos. Almacena en la primera los
	// nombres y en la segunda las notas de los alumnos. Inicializa autom�ticamente
	// los valores de las dos tablas (utiliza random y randomuuid). Cree un m�todo
	// que muestre los nombres de los alumnos y sus nota. Cree otro m�todo que
	// almacene en otra tabla los alumnos que hayan aprobado. Muestre el resultado.
	// Cree otro m�todo que modifique la nota de un alumno solicitado al usuario.
	// Cree otro m�todo que devuelva una tabla con los alumnos que hayan sacado m�s
	// nota que la nota que una solicitada al usuario

	private static Scanner sc = new Scanner(System.in);
	private static Random rnd = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introduzca numero de elementos: ");
		int tam = sc.nextInt();
		double[] notas = new double[tam];
		String[] alumnos = new String[tam];

		inicializarTabla(notas);
		inicializaAlumnos(alumnos);
		
		muestraNotas(alumnos, notas);
		
		System.out.println("\n\n Los alumnos aprobados son: ");
		
		String[] aprobados = alumnosMasNota(alumnos, notas,5);
		mostrarTabla(aprobados);
		
		System.out.print("\n\n Alumno a cambiar: ");
		int id = sc.nextInt();
		System.out.print("\n\n Nueva nota: ");
		double nota = sc.nextInt();
		alteraNota(notas, (id-1), nota);
		
		
		System.out.print("\n\n Nota a consultar: ");
		nota = sc.nextDouble();
		String[] nuevos = alumnosMasNota(alumnos, notas,nota);
		mostrarTabla(nuevos);

	}

	private static void alteraNota(double[] notas, int i, double nota) {
		notas[i]=nota;
		
	}

	private static String[] alumnosMasNota(String[] alumnos, double[] notas, double nota) {
				
		int contador=0;
		for(int i=0;i<alumnos.length;i++)		
			if(notas[i]>=nota)
				contador++;

		String[] aprobados=new String[contador];
		contador=0;
		for(int i=0;i<alumnos.length;i++)		
			if(notas[i]>=nota){
				aprobados[contador]=alumnos[i];
				contador++;
			}
		
			return aprobados;
	}

	private static void muestraNotas(String[] alumnos, double[] notas) {
		for(int i=0;i<alumnos.length;i++)
			System.out.println((i+1)+") "+alumnos[i]+": "+notas[i]);
			
	}

	private static void inicializaAlumnos(String[] alumnos) {
		String[] tApellidos={"S�nchez","Elegante","Arenas","Mata","Garc�a","Sol�s","Rodr�guez","V�zquez","Hurtado","Miranda","Pinto","Mirinda","Barrios","Garrobo","M�rquez","Salazar","Medina","G�mez","Alonso","P�rez","L�pez","Mora","Gonz�lez","Chaparro","Ferrer","Jim�nez","Morales","Moncayo","Fern�ndez","Perea","Blanco","Rold�n","Navarro","Romero","Aguilar","Rubio","Baena","Fern�ndez","Barco","Ram�rez","Delgado","Rodr�guez","Duque","Mart�nez"};
		String[] tNombres = { "�lvaro", "Daniel Luis", "Juan Manuel", "Agust�n", "Fco. Javier", "Jos� Manuel", "Tom�s",
				"Carlos", "Jose Carlos", "Juan Luis", "Daniel", "Angel", "Jacobo", "Alejandro", "Francisco", "Alfredo",
				"Francisco", "Antonio", "Constantino", "Roberto", "Rafael", "Antonio" };
		
		for(int i=0;i<alumnos.length;i++) 
			alumnos[i]=(tApellidos[rnd.nextInt(40)]+" "+tApellidos[rnd.nextInt(40)]+", "+tNombres[rnd.nextInt(20)]);
	
		
	}

	private static void mostrarTabla(int[] numeros) {
		for (int i = 0; i < numeros.length; i++)
			System.out.println(i + ") " + numeros[i]);

	}
	private static void mostrarTabla(String[] tabla) {
		for (int i = 0; i < tabla.length; i++)
			System.out.println((i+1) + ") " + tabla[i]);

	}

	private static void inicializarTabla(double[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rnd.nextInt(100) / 10.0;
		}
	}
}