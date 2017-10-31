package datos;

import java.util.Scanner;

public class Ejercicio02 {

	// Escribir un programa en Java que lea un número entero desde teclado y realiza
	// la suma de los 50 números pares siguientes y los 50 números impares
	// anteriores, mostrando el resultado en pantalla.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nº: ");
		int num = sc.nextInt();

		int inicial = num;

		int sumaPares = 0, sumaImpares = 0;

		if (inicial % 2 == 0) {
			// Es par
			inicial += 2;
		} else {
			// Es impar
			inicial += 1;
		}

		for (int i = 0; i < 50; i++) {
			sumaPares = sumaPares + inicial;
			inicial += 2;
		}

		inicial = num;
		if (inicial % 2 == 0)
			inicial--;
		else
			inicial -= 2;

		for (int i = 0; i < 50; i++) {
			sumaImpares = sumaImpares + inicial;
			inicial -= 2;
		}

		System.out.println("La suma de los 50 números pares siguiente a " + num + " es: " + sumaPares);
		System.out.println("La suma de los 50 números impares anteriores a " + num + " es: " + sumaImpares);

		sc.close();
	}

}
