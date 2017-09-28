package es.altair.datos;

import java.util.Scanner;

public class EjercicioTres {

	// Escriba un programa para calcular el consumo medio de un autom�vil. Debe
	// solicitar informaci�n sobre las tres �ltimas veces que se reposta
	// combustible. De la primera solicitar� el precio por litro de combustible, el
	// total pagado en llenar el dep�sito y el n�mero de kil�metros que marcaba el
	// cuentakil�metros. De la segunda vez s�lo solicitar� el precio del litro de
	// combustible y el total pagado en rellenar el dep�sito. De la tercera ve
	// solicitar� el valor que indica el cuentakil�metros. Debe calcular el consumo
	// por cada 100 km y el coste por kil�metro

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 1� VEZ
		System.out.println("Precio Combustible 1� Vez: ");
		double precioLitroUno = sc.nextDouble();
		
		System.out.println("Precio llenar dep�sito 1� Vez: ");
		double precioTotalUno = sc.nextDouble();
		
		System.out.println("Kil�metros contador 1� Vez: ");
		double kilometrosUno = sc.nextDouble();
		
		// 2� VEZ
		System.out.println("Precio Combustible 2� Vez: ");
		double precioLitroDos = sc.nextDouble();
		
		System.out.println("Precio llenar dep�sito 2� Vez: ");
		double precioTotalDos = sc.nextDouble();
		
		// 3� VEZ
		System.out.println("Kil�metros contador 3� Vez: ");
		double kilometrosTres = sc.nextDouble();
		
		double numeroDeKilometros = kilometrosTres - kilometrosUno;
		
		double litrosPrimera = precioTotalUno / precioLitroUno;
		double litrosSegunda = precioTotalDos / precioLitroDos;
		
		double precioKilometro = (litrosPrimera + litrosSegunda) / numeroDeKilometros;
		
		System.out.println("Consumo a los 100 kms: " + (precioKilometro * 100));
		
		sc.close();
	}

}
