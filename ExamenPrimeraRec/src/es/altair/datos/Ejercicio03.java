package es.altair.datos;

import java.util.Scanner;

public class Ejercicio03 {

	// Pida n�meros al usuario hasta escribir -1. Despu�s de escribir -1 debes
	// mostrar cual ha sido el mayor, el menor y cuantos n�meros se han introducido.

	private static Scanner sc = new Scanner(System.in);

	private static int numero = 0, mayor = 0, menor = 0, contador = 0;

	private static String listaNumeros = "";

	public static void main(String[] args) {
		encontrarValores();

		mostrarResultados();

		sc.close();
	}

	private static void encontrarValores() {
		do {
			System.out.println("N�: ");
			numero = sc.nextInt();

			if (numero != -1) {
				if (contador == 0) {
					mayor = numero;
					menor = numero;
				} else {
					if (numero > mayor)
						mayor = numero;
					else if (numero < menor)
						menor = numero;
				}
				contador++;
				listaNumeros += " " + numero;
			}
		} while (numero != -1);
	}

	private static void mostrarResultados() {
		if (contador != 0) {
			System.out.println("Total N�meros: " + contador);
			System.out.println("Mayor: " + mayor);
			System.out.println("Menor: " + menor);
			System.out.println("N�meros: " + listaNumeros);
		}
	}

}
