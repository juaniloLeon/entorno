package datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {

	// Crear una tabla de n elementos. Pedir al usuario un valor entre 0 y n-1.
	// Eliminar el valor de esa posición y desplazar todos los elementos para no
	// dejar el hueco vacío

	private static Scanner sc = new Scanner(System.in);
	private static Random rnd =new Random();
	public static void main(String[] args) {

		System.out.print("Introduzca numero de elementos: ");
		int tam=sc.nextInt();
		int[] tabla = new int[tam];
		inicializarTabla(tabla);
		mostrarTabla(tabla);
		System.out.print("Introduzca elemento a eliminar [max:"+(tam-1)+"]: ");
		int elimina=sc.nextInt();
		eliminar(elimina, tabla);
		mostrarTabla(tabla);
		
	}
	
	private static void eliminar(int elimina, int[] tabla) {
		for (int i = elimina; i < tabla.length-1; i++) 			
			tabla[i]=tabla[i+1];
	
		tabla[tabla.length-1]=0;
	}

	private static void mostrarTabla(int[] numeros) {
		for (int i = 0; i < numeros.length; i++)
			System.out.println(i+") "+numeros[i]);
		
	}

	private static void inicializarTabla(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(50);
		}

	}

}
