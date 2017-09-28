package es.altair.datos;

import java.util.Scanner;

public class EjercicioDos {

	// Escribir un programa que defina dos variables enteras para describir las
	// longitudes de los lados de un rectángulo. El programa debe calcular y
	// escribir en la pantalla las longitudes de los lados, el perímetro y el área
	// del rectángulo

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Alto: ");
		int alto = sc.nextInt();

		System.out.println("Ancho: ");
		int ancho = sc.nextInt();

		int perimetro = (2 * alto) + (2 * ancho);
		int area = alto * ancho;

		System.out.println("El rectángulo de alto igual a " + alto + " y ancho igual a " + ancho
				+ " tiene\n como perímetro el valor igual a " + perimetro + " y como \nárea el valor igual a " + area);
		
		sc.close();
	}

}
