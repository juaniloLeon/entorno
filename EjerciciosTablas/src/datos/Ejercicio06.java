package datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {

	// Crear una tabla de n elementos. Pedir al usuario un valor entre 0 y n-1.
	// Eliminar el valor de esa posición y desplazar todos los elementos para no
	// dejar el hueco vacío
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] elementos;

	public static void main(String[] args) {
		int nelementos = 0;
		do {
			System.out.println("Nº Elementos: ");
			nelementos = sc.nextInt();
		} while (nelementos <= 0);
		
		elementos = new int[nelementos];
		
		int posicion = 0;
		do {
			System.out.println("Posición: ");
			posicion = sc.nextInt();
		} while (posicion < 0 || posicion >= nelementos);
		
		rellenarTabla();
		
		mostrarTabla();
		
		eliminarPosicionYDesplazar(posicion);
		
		mostrarTabla();
		
		sc.close();
	}

	private static void eliminarPosicionYDesplazar(int posicion) {
		for (int i = posicion; i < elementos.length - 1; i++) {
			elementos[i] = elementos[i+1];
		}
		elementos[elementos.length - 1] = 0;
	}

	private static void mostrarTabla() {
		System.out.println(Arrays.toString(elementos));
	}

	private static void rellenarTabla() {
		for (int i = 0; i < elementos.length; i++) {
			elementos[i] = new Random().nextInt(50) + 1;
		}
	}

}
