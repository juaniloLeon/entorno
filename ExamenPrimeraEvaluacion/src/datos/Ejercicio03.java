package datos;

import java.util.Scanner;

public class Ejercicio03 {

	// Escriba un programa que solicite n�meros enteros hasta que el usuario
	// introduzca un -1. Para cada uno de los n�meros indique cual es su valor
	// pariano, es decir, el valor resultante de la multiplicaci�n del n�mero por el
	// par inmediatamente anterior al n�mero.
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("N�: ");
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
