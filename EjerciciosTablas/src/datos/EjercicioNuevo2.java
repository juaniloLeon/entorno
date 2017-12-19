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

public class EjercicioNuevo2 {

	private static Scanner sc = new Scanner(System.in);
	private static Random rnd = new Random();

	public static void main(String[] args) {
		int[] tabla1 = rellenaTabla(10);
		int[] tabla2 = rellenaTabla(10);

		muestraTabla(tabla1, tabla2);
		masRepe(tabla1, tabla2);

	}

	private static void masRepe(int[] tabla1, int[] tabla2) {
		int repMax = 0, rep = 0, num = 0;
		for (int i = 0; i < tabla1.length; i++) {
			rep = Busca(tabla1, tabla1[i]) + Busca(tabla2, tabla1[i]);
			if (rep > repMax) {
				repMax = rep;
				num = tabla1[i];
			}
			rep = Busca(tabla1, tabla2[i]) + Busca(tabla2, tabla2[i]);
			if (rep > repMax) {
				repMax = rep;
				num = tabla2[i];
			}
		}

		if (repMax == 1)
			System.out.println("Nigún número está repetido");
		System.out.println("el numero más repetido es " + num + " con " + repMax + " repeticiones.");
	}

	private static void muestraTabla(int[] tabla1, int[] tabla2) {
		for (int i = 0; i < tabla1.length; i++) {
			System.out.println(tabla1[i] + "\t\t" + tabla2[i]);

		}
	}

	private static int Busca(int[] tabla, int num) {
		int cont = 0;
		for (int i = 1; i < tabla.length; i++)
			if (num == tabla[i])
				cont++;
		return cont;
	}

	private static int[] rellenaTabla(int tam) {
		int[] tabla = new int[tam];
		for (int i = 0; i < tabla.length; i++)
			tabla[i] = rnd.nextInt(51);

		return tabla;
	}

}
