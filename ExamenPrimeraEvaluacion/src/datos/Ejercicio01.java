package datos;

import java.util.Scanner;

public class Ejercicio01 {

	// Programa que solicita tres números y realiza las siguientes acciones:
	// - Muestra el valor central de los tres valores numéricos
	// - Muestra si alguno de los valores es múltiplo de otro de los valores
	// - Debe mostrar un mensaje diciendo si el valor central está mas cerca del
	// menor que del mayor. Por ejemplo, si los tres valores fueran 1,15,200 debería
	// decir que "El valor central 15 está más cerca del valor 1"
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nº 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Nº 2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Nº 3: ");
		int num3 = sc.nextInt();
		
		int central = 0, menor = 0, mayor = 0;
		
//		if (num1 > num2 && num1 > num3) {
//		mayor = num1;
//		if (num2 > num3) {
//			central = num2;
//			menor = num3;
//		} else {
//			central = num3;
//			menor = num2;
//		}
//			
//	}
		
		// Valor central
		if (num1 > num2 && num1 < num3) {
			central = num1;
			menor = num2;
			mayor = num3;
		} else if (num1 > num3 && num1 < num2) {
			central = num1;
			menor = num3;
			mayor = num2;
		} else if (num2 > num1 && num2 < num3) {
			central = num2;
			menor = num1;
			mayor = num3;
		} else if (num2 > num3 && num2 < num1) {
			central = num2;
			menor = num3;
			mayor = num1;
		} else if (num3 > num1 && num3 < num2) {
			central = num3;
			menor = num1;
			mayor = num2;
		} else if (num3 > num2 && num3 < num1) {
			central = num3;
			menor = num2;
			mayor = num1;
		} 
		System.out.println("Orden: " + menor + " < " + central + " < " + mayor);
		
		// Múltiplo
		if (num1%num2==0)
			System.out.println(num1 + " es múltiplo de " + num2);
		if (num1%num3==0)
			System.out.println(num1 + " es múltiplo de " + num3);
		if (num2%num1==0)
			System.out.println(num2 + " es múltiplo de " + num1);
		if (num2%num3==0)
			System.out.println(num2 + " es múltiplo de " + num3);
		if (num3%num1==0)
			System.out.println(num3 + " es múltiplo de " + num1);
		if (num3%num2==0)
			System.out.println(num3 + " es múltiplo de " + num2);
		
		// Cercano
		int diferencia1 = mayor - central;
		int diferencia2 = central - menor;
		if (diferencia1 < diferencia2)
			System.out.println(mayor + " está más cerca de " + central);
		else if (diferencia2 < diferencia1)
			System.out.println(menor + " está más cerca de " + central);
		else
			System.out.println(mayor + " y " + menor + " están a la misma distancia de " + central);
		
		sc.close();
	}

}
