package datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	// Crear una tabla de n n�meros y desplazarla una posici�n hacia abajo, es
	// decir, el primero pasa a ser el segundo, el segundo pasa a ser el tercero y
	// as� sucesivamente. El �ltimo pasa a ser el primero

	private static Scanner sc = new Scanner(System.in);
	
	private static int numeros [];
	
	public static void main(String[] args) {
		int tamanyo;
		do {
			System.out.println("N� de Elementos: ");
			tamanyo = sc.nextInt();
		} while (tamanyo <= 0);
		
		numeros = new int[tamanyo];
		
		iniciar();
		
		mostrar();
		
		desplazar();
		
		mostrar();
		
		sc.close();
	}

	private static void desplazar() {
		int primero = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			numeros[i-1] = numeros[i];
		}
		numeros[numeros.length -1] = primero;
	}

	private static void mostrar() {
		System.out.println("N�MEROS: " + Arrays.toString(numeros));
	}

	private static void iniciar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50);
		}
	}

}
