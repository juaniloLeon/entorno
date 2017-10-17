package es.altair.datos;

import java.util.Scanner;

public class Ejercicio03 {

	// Pida al usuario día, mes y año y compruebe que la fecha es correcta

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int anyo;
		do {
			System.out.println("Año: ");
			anyo = sc.nextInt();
		} while (anyo < 0);

		boolean esBisiesto = false;
		if ((anyo % 4 == 0) && (anyo % 100 != 0 || anyo % 400 == 0)) {
			esBisiesto = true;
		}
		
		int mes;
		do {
			System.out.println("Mes: ");
			mes = sc.nextInt();
		} while (mes < 1 || mes > 12);
		
		System.out.println("Día: ");
		int dia = sc.nextInt();
		
		// variable que me indique si la fecha es correcta
		boolean fechaCorrecta = false;
		
		switch (mes) {
		case 2:
			if (dia >= 1 && dia <=29 && esBisiesto)
				fechaCorrecta = true;
			else if(dia >=1 && dia <= 28 && !esBisiesto)
				fechaCorrecta = true;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			
			break;
		default:
			break;
		}
		
		
		
		sc.close();
	}
}
