package datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {

	// Leer dos series de n números. Almacenarlos en 2 tablas. Ordena las tablas.
	// Fusiona las 2 tablas en una tabla de 2*n elementos de forma que esta tabla
	// esté ordenada

	private static Scanner sc = new Scanner(System.in);
	private static Random rnd = new Random();
	public static void main(String[] args) {

		System.out.print("Introduzca numero de elementos: ");
		int tam = sc.nextInt();
		int[] tabla = new int[tam];
		int[] tabla2 = new int[tam];
		
		inicializarTabla(tabla);
		inicializarTabla(tabla2);
		
		int[] tablaDoble=fusionaTabla(tabla,tabla2);
		
		ordenaTabla(tablaDoble);
		System.out.println("\nTabla ordenada:\n");
		mostrarTabla(tablaDoble);
	}

	private static int[] fusionaTabla(int[] tabla, int[] tabla2) {
		int tabladoble[]=new int[2*tabla.length];
		for(int i=0;i<tabla.length;i++)
			tabladoble[i]=tabla[i];
		for(int i=0; i<tabla2.length; i++) {
			tabladoble[i+tabla.length]=tabla2[i];
		}
		
		
	return tabladoble;
	}

	private static void ordenaTabla(int[] lista) {
		int cuentaintercambios = 0;
		for (boolean ordenado = false; !ordenado;) {
			for (int i = 0; i < lista.length - 1; i++) {
				if (lista[i] > lista[i + 1]) {
					int variableauxiliar = lista[i];
					lista[i] = lista[i + 1];
					lista[i + 1] = variableauxiliar;
					cuentaintercambios++;
				}
			}
			if (cuentaintercambios == 0) {
				ordenado = true;
			}
			cuentaintercambios = 0;
		}
	}

	private static void mostrarTabla(int[] numeros) {
		for (int i = 0; i < numeros.length; i++)
			System.out.println(i + ") " + numeros[i]);

	}

	private static void inicializarTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rnd.nextInt(50);
		}
	}

}
