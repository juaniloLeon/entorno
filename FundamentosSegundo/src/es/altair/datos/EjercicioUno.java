package es.altair.datos;

import java.util.Scanner;

public class EjercicioUno {

	// Haga un programa que realice la conversión de grados Fahrenheit a Celsius.
	// Los grados Celsius debe pedírselos al usuario

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca Grados Celsius: ");
		double grados_celsius = sc.nextDouble();
		double fahrenheit = (grados_celsius * 1.8) + 32;
		System.out.println(grados_celsius + " grados celsius son " + fahrenheit + " grados fahrenheit");

		sc.close();
	}

}
