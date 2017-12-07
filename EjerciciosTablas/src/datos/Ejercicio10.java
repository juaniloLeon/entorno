package datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	// Declarar 2 tablas unidimensionales de n elementos. Almacena en la primera los
	// nombres y en la segunda las notas de los alumnos. Inicializa automáticamente
	// los valores de las dos tablas (utiliza random y randomuuid). Cree un método
	// que muestre los nombres de los alumnos y sus nota. Cree otro método que
	// almacene en otra tabla los alumnos que hayan aprobado. Muestre el resultado.
	// Cree otro método que modifique la nota de un alumno solicitado al usuario.
	// Cree otro método que devuelva una tabla con los alumnos que hayan sacado más
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
		String[] tApellidos={"Sánchez","Elegante","Arenas","Mata","García","Solís","Rodríguez","Vázquez","Hurtado","Miranda","Pinto","Mirinda","Barrios","Garrobo","Márquez","Salazar","Medina","Gómez","Alonso","Pérez","López","Mora","González","Chaparro","Ferrer","Jiménez","Morales","Moncayo","Fernández","Perea","Blanco","Roldán","Navarro","Romero","Aguilar","Rubio","Baena","Fernández","Barco","Ramírez","Delgado","Rodríguez","Duque","Martínez"};
		String[] tNombres = { "Álvaro", "Daniel Luis", "Juan Manuel", "Agustín", "Fco. Javier", "José Manuel", "Tomás",
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