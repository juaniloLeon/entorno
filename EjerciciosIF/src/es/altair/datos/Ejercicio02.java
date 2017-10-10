package es.altair.datos;

import java.util.Scanner;

public class Ejercicio02 {

	// introduzca una nota de 0 a 10 y mostrarla de la forma: insuficiente,
	// suficiente, bien...
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nota: ");
		double nota = sc.nextDouble();
		
		
		
		sc.close();
	}
}
