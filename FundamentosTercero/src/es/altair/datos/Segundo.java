package es.altair.datos;

import java.util.Scanner;

public class Segundo {

	// Pedir el radio de un círculo y calcular su área (A=PI*r(elevado)2
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Radio: ");
		double radio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("Área: " + area);
		
		sc.close();
	}

}
