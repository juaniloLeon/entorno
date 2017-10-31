package datos;

import java.util.Scanner;

public class Ejercicio03 {

	// Escriba un programa que solicite números enteros hasta que el usuario
	// introduzca un -1. Para cada uno de los números indique cual es su valor
	// pariano, es decir, el valor resultante de la multiplicación del número por el
	// par inmediatamente anterior al número.
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("Nº: ");
			num = sc.nextInt();
			
			if (num != -1) {
				if (num%2==0) {
					System.out.println("El Pariano de " + num + " es: " + (num*(num-2)));
				} else {
					System.out.println("El Pariano de " + num + " es: " + (num*(num-1)));
				}
			}
			
		} while (num != -1);
		
		sc.close();
	}

}
