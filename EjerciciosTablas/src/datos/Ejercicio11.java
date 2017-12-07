package datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

	// Tabla de n elementos. Escriba un programa que calcule cuantos números
	// distintos hay en la tabla
	private static Scanner sc = new Scanner(System.in);
	private static Random rnd = new Random();

	public static void main(String[] args) {
		System.out.print("Introduzca numero de elementos: ");
		int tam = sc.nextInt();
		int[] tabla = new int[tam];

		inicializarTabla(tabla);
		mostrarTabla(tabla);

		System.out.println("hay " + numerosDistintos(tabla) + " numeros distintos");

	}

	private static int numerosDistintos(int[] tabla) {
		int contador = 0;
		int aux;
		boolean encontrado;

		for (int i = 0; i < tabla.length; i++) {
			aux = -1;
			encontrado = false;
			for (int j = (i + 1); j < tabla.length; j++)
				if (j != tabla.length)
					if (tabla[i] == tabla[j]) {
						contador++;
						aux++;
					}
			if (aux > 0)
				contador -= aux;
		}

		return (tabla.length - contador);

	}

	private static void mostrarTabla(int[] numeros) {
		for (int i = 0; i < numeros.length; i++)
			System.out.println(i + ") " + numeros[i]);

	}

	private static void inicializarTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rnd.nextInt(50);
		}
	}

}