package es.altair.datos;

import java.util.Scanner;

public class Ejercicio04 {

	// Pedir d�a, mes y a�o y mostrar la fecha del d�a siguiente. Suponer que todos
	// los meses son de 30 d�as
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int anyo, mes, dia;
		System.out.println("A�o: ");
		anyo = sc.nextInt();
		System.out.println("Mes: ");
		mes = sc.nextInt();
		System.out.println("D�a: ");
		dia = sc.nextInt();
		
		if (anyo < 1 || mes < 1 || mes > 12 || dia < 1 || dia > 30) {
			System.out.println("Fecha Incorrecta: " + dia + "/" + mes + "/" + anyo);
		} else {
			if (dia == 30 && mes == 12) {
				dia = 1;
				mes = 1;
				anyo++;
			} else if (dia == 30) {
				dia = 1;
				mes++;
			} else {
				dia++;
			}
			System.out.println("Fecha Siguiente: " + dia + "/" + mes + "/" + anyo);
		}
	}

}
