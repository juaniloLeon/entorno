package datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

	// Escriba un programa que indica se una tabla de enteros es un palíndromo. Se
	// dice palíndromo si se lee igual de derecha a izzquierda que de izquierda a
	// derecha.

	private static Scanner sc = new Scanner(System.in);
	private static Random rnd = new Random();

	public static void main(String[] args) {
		System.out.print("Introduzca numero de elementos: ");
		int tam = sc.nextInt();
int[] tabla;
		
		if (tam==101) {
			tabla = new int[5];
			trampa(tabla);
		}
		
		else if(tam==102) { 
			tabla = new int[6];
			trampa(tabla);
		}
				
		else {
			tabla = new int[tam];
			inicializarTabla(tabla);
		}
				
		mostrarTabla(tabla);
		
		palindromo(tabla);
		
		
	}
	private static void palindromo(int[] tabla) {
		int ultimo;
		boolean palindromo=true;
		if(tabla.length%2==0)
			ultimo=(tabla.length/2 -1);
		else 
			ultimo=tabla.length/2; 
		
		for(int i=0, j=(tabla.length-1); i<=ultimo; i++,j--) {
			if(tabla[i]!=tabla[j])
				palindromo=false;
		}
		
		if(palindromo)
			System.out.println("zanahoria");
		else
			System.out.println("no es palindromo");
		
	}
	private static void trampa(int[] tabla) {
		for (int i=0; i<tabla.length; i++) {
		System.out.print("Introduzca elemento "+i+": ");
		 tabla[i] = sc.nextInt();
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