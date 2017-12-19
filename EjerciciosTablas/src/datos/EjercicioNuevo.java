package datos;

import java.util.Random;
import java.util.Scanner;

/*
 * 
 * Rellena una tabla de 15 números. Muestra la tabla. 
 * 		Muestra el mayor, el menor y las posiciones en las que se encuentran.
 *	
 *	Rellene dos tabla de 10 números.
 *	La salida del método principal debe indicar el número que más
 *	se repite entre las dos tablas.
 * */

public class EjercicioNuevo {

	private static Scanner sc = new Scanner(System.in);
	private static Random rnd = new Random();

	public static void main(String[] args) {
		int[] tabla = rellenaTabla(15);
		muestraTabla(tabla);

	}

	private static void muestraTabla(int[] tabla) {
		int max = tabla[0], min = tabla[0];
		for (int i = 1; i < tabla.length; i++) {
			System.out.println(tabla[i]);
			if (tabla[i] > max)
				max = tabla[i];
			else if (tabla[i] < min)
				min = tabla[i];
		}

		System.out.println("El valor mayor es: " + max);
		Busca(tabla, max);
		System.out.println("El valor menor es: " + min);
		Busca(tabla, min);

	}

	private static void Busca(int[] tabla, int num) {
		System.out.print("\tSe encuentra en: ");
		for (int i = 1; i < tabla.length; i++)
			if (num == tabla[i])
				System.out.print(i+ " ");
		System.out.println();
	}

	private static int[] rellenaTabla(int tam) {
		int[] tabla = new int[tam];
		for (int i = 0; i < tabla.length; i++)
			tabla[i] = rnd.nextInt(51);

		return tabla;
	}

}
