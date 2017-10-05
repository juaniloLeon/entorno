package es.altair.datos;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Pedir dos numeros y decir si son iguales o no
		System.out.println("Nº 1: ");
		int num1 = sc.nextInt();

		System.out.println("Nº 2: ");
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

		
		// Pedir un número e indicar si es positivo o negativo
		System.out.println("Num: ");
		int num = sc.nextInt();
		
		if (num > 0)
			System.out.println("Es positivo");
		else if (num < 0)
			System.out.println("Es negativo");
		else
			System.out.println("Es cero");
		
		
		// Pedir dos números y decir si uno es múltiplo del otro
		System.out.println("Num 1: ");
		int numA = sc.nextInt();
		
		System.out.println("Num 2: ");
		int numB = sc.nextInt();
		
		if (numA % numB == 0)
			System.out.println(numA + " es múltiplo de " + numB);
		else if (numB % numA == 0)
			System.out.println(numB + " es múltiplo de " + numA);
		else
			System.out.println("No son múltiplos");
		
		
		// Pedir dos números e indicar cual es el mayor o si son iguales
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
		
		sc.close();
	}
}
