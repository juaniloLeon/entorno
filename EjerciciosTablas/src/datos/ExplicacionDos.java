package datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExplicacionDos {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		// Unidimensionales
//		int[] m = new int[10];
//		int m1[];
//
//		// Multidimensinales
//		float[][] temperaturas = new float[6][3];
//
//		// Inicializar
//		int[] numeros = { 1, 2, 3, 4, 5 };
//		System.out.println(numeros.length);
//
//		// int [][] valores = new int[2][3];
//		int[][] valores = { { 1, 2, 3 }, { 4, 5, 6 } };
//		String[][] cadenas = { { "cad1", "cad2" }, { "cad3", "cad4" }, { "cad5", "cad6" } };
//
//		int tamanyo = 10;
//		int[] tabla = new int[tamanyo];
//
//		// Obtener un valor
//		System.out.println(cadenas[1][0]);
//		String cad = cadenas[1][0];
//		int num = numeros[2];
//		numeros[2]++;
//		numeros[2] = numeros[3] + numeros[4];
//
//		// Inicializar una tabla unidimensional
//		for (int i = 0; i < tabla.length; i++) {
//			System.out.println("Nº: ");
//			tabla[i] = sc.nextInt();
//		}
//		
//		// Inicializar una tabla multidimensional
//		for (int i = 0; i < temperaturas.length; i++) {
//			for (int j = 0; j < temperaturas[i].length; j++) {
//				temperaturas[i][j] = sc.nextFloat();
//			}
//		}
//		
//
//		// Buscar un número en la tabla
//		System.out.println("Número a buscar: ");
//		int buscado = sc.nextInt();
//		System.out.println("El número buscado está en las posiciones: " + buscandoPosiciones(tabla, buscado));
//		
//		
//		// Mostrar
//		mostrarTabla(tabla);
//		mostrarTablaMulti(temperaturas);
		
		
		
		// java.util.Arrays
		int tamanyo = 10;
		int[] tabla = new int[tamanyo];

//		// Inicializar una tabla unidimensional
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(100);
		}
		
		System.out.println(Arrays.toString(tabla)); // devuelve una cadena con los datos de la tabla
		Arrays.sort(tabla); // ordena de manera ascendente
		System.out.println(Arrays.toString(tabla));
		//Arrays.fill(tabla, 100); // Rellena la tabla con elvalor que indiques
		//System.out.println(Arrays.toString(tabla));
		System.out.println("El 50 está en la posición: " + Arrays.binarySearch(tabla, 50));
		//int [] auxiliar = Arrays.copyOf(tabla, 15);
		int [] auxiliar = Arrays.copyOfRange(tabla, 2, 17);
		System.out.println(Arrays.toString(auxiliar));
		
		System.out.println(tabla[20]);
		
	}

	private static void mostrarTablaMulti(float[][] temperaturas) {
		for (int i = 0; i < temperaturas.length; i++) {
			for (int j = 0; j < temperaturas[i].length; j++) {
				System.out.print(temperaturas[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void mostrarTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
	}

	private static String buscandoPosiciones(int[] tabla, int buscado) {
		String posiciones = "";
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == buscado)
				posiciones += i + ",";
		}
		
		return posiciones;
	}

}
