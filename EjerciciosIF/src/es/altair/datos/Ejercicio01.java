package es.altair.datos;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Pedir dos numeros y decir si son iguales o no
		System.out.println("N� 1: ");
		int num1 = sc.nextInt();

		System.out.println("N� 2: ");
		int num2 = sc.nextInt();

		if (num1 == num2)
			System.out.println(num1 + " es igual a " + num2);
		else
			System.out.println(num1 + " no es igual a " + num2);
		
		boolean condicion;
		if (condicion = (num1 == num2)) 
			System.out.println(num1 + " es igual a " + num2);
		else
			System.out.println(num1 + " no es igual a " + num2);

		
		// Pedir un n�mero e indicar si es positivo o negativo
		System.out.println("Num: ");
		int num = sc.nextInt();
		
		if (num > 0)
			System.out.println("Es positivo");
		else if (num < 0)
			System.out.println("Es negativo");
		else
			System.out.println("Es cero");
		
		
		// Pedir dos n�meros y decir si uno es m�ltiplo del otro
		System.out.println("Num 1: ");
		int numA = sc.nextInt();
		
		System.out.println("Num 2: ");
		int numB = sc.nextInt();
		
		if (numA % numB == 0)
			System.out.println(numA + " es m�ltiplo de " + numB);
		else if (numB % numA == 0)
			System.out.println(numB + " es m�ltiplo de " + numA);
		else
			System.out.println("No son m�ltiplos");
		
		
		// Pedir dos n�meros e indicar cual es el mayor o si son iguales
		System.out.println("Num 1: ");
		int numX = sc.nextInt();
		
		System.out.println("Num 2: ");
		int numZ = sc.nextInt();
		
		if (numX > numZ)
			System.out.println(numX + " es mayor que " + numZ);
		else if (numZ > numX)
			System.out.println(numZ + " es mayor que " + numX);
		else
			System.out.println(numX + " es igual a " + numZ);
		
		// Pedir dos n�meros y mostrarlos ordenados de mayor a menor
		System.out.println("N�mero 1: ");
		int numero1 = sc.nextInt();
		
		System.out.println("N�mero 2: ");
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2)
			System.out.println("Orden: " + numero1 + ", " + numero2);
		else if (numero2 > numero1)
			System.out.println("Orden: " + numero2 + ", " + numero1);
		else
			System.out.println("Da igual el orden. Son Iguales");
		
		// Pedir tres n�meros y mostrarlos ordenados de mayor a menor
		System.out.println("N�mero 1: ");
		int n1 = sc.nextInt();
		
		System.out.println("N�mero 2: ");
		int n2 = sc.nextInt();
		
		System.out.println("N�mero 3: ");
		int n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			if (n2 > n3)
				System.out.println("Orden: " + n1 + ", " + n2 + ", " + n3);
			else
				System.out.println("Orden: " + n1 + ", " + n3 + ", " + n2);
		} else if (n2 > n1 && n2 > n3) {
			if (n1 > n3)
				System.out.println("Orden: " + n2 + ", " + n1 + ", " + n3);
			else
				System.out.println("Orden: " + n2 + ", " + n3 + ", " + n1);
		} else if (n3 > n1 && n3 > n2) {
			if (n1 > n2)
				System.out.println("Orden: " + n3 + ", " + n1 + ", " + n2);
			else
				System.out.println("Orden: " + n3 + ", " + n2 + ", " + n1);
		}
		
		sc.close();
	}
}
