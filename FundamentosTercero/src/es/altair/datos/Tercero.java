package es.altair.datos;

import java.util.Scanner;

public class Tercero {

	// Pedir el radio de una circunferencia y calcular su longitud L=2*PI*r
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Radio: ");
		double radio = sc.nextDouble();
		
		double longitud = 2 * Math.PI * radio;
		
		System.out.println("Longitud: " + longitud);
		
		sc.close();
	}

}
