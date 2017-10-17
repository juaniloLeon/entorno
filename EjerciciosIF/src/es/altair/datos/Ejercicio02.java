package es.altair.datos;

import java.util.Scanner;

public class Ejercicio02 {

	// introduzca una nota de 0 a 10 y mostrarla de la forma: insuficiente,
	// suficiente, bien...

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nota: ");
		double nota = sc.nextDouble();
		if (nota >= 9 && nota <= 10)
			System.out.println("Sobresaliente");
		else if (nota >= 7 && nota < 9)
			System.out.println("Notable");
		else if (nota > 5 && nota < 7)
			System.out.println("Bien");
		else if (nota == 5)
			System.out.println("Suficiente");
		else
			System.out.println("Insuficiente");

		sc.close();
	}
}
