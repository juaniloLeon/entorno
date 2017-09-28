package es.altair.datos;

import java.util.Scanner;

public class EjercicioTres {

	// Escriba un programa para calcular el consumo medio de un automóvil. Debe
	// solicitar información sobre las tres últimas veces que se reposta
	// combustible. De la primera solicitará el precio por litro de combustible, el
	// total pagado en llenar el depósito y el número de kilómetros que marcaba el
	// cuentakilómetros. De la segunda vez sólo solicitará el precio del litro de
	// combustible y el total pagado en rellenar el depósito. De la tercera ve
	// solicitará el valor que indica el cuentakilómetros. Debe calcular el consumo
	// por cada 100 km y el coste por kilómetro

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 1ª VEZ
		System.out.println("Precio Combustible 1ª Vez: ");
		double precioLitroUno = sc.nextDouble();
		
		System.out.println("Precio llenar depósito 1ª Vez: ");
		double precioTotalUno = sc.nextDouble();
		
		System.out.println("Kilómetros contador 1ª Vez: ");
		double kilometrosUno = sc.nextDouble();
		
		// 2ª VEZ
		System.out.println("Precio Combustible 2ª Vez: ");
		double precioLitroDos = sc.nextDouble();
		
		System.out.println("Precio llenar depósito 2ª Vez: ");
		double precioTotalDos = sc.nextDouble();
		
		// 3ª VEZ
		System.out.println("Kilómetros contador 3ª Vez: ");
		double kilometrosTres = sc.nextDouble();
		
		double numeroDeKilometros = kilometrosTres - kilometrosUno;
		
		double litrosPrimera = precioTotalUno / precioLitroUno;
		double litrosSegunda = precioTotalDos / precioLitroDos;
		
		double precioKilometro = (litrosPrimera + litrosSegunda) / numeroDeKilometros;
		
		System.out.println("Consumo a los 100 kms: " + (precioKilometro * 100));
		
		sc.close();
	}

}
