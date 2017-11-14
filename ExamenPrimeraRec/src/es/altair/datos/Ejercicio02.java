package es.altair.datos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio02 {

	// Introduzca una fecha y un número. Debe sumar a la fecha ese número de días y
	// mostrar la fecha resultante. Suponemos que todos los meses son de 30 días.

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero;
		
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		// Poner la fecha actual
		Calendar c = new GregorianCalendar();
		
		//c.add(Calendar.DAY_OF_YEAR, numero);
		
		int dia = c.get(Calendar.DAY_OF_MONTH);
		int mes = c.get(Calendar.MONTH) + 1;
		int anyo = c.get(Calendar.YEAR);
		
		System.out.println(dia + "/" + mes + "/" + anyo);
		
		if (numero + dia <= 30) {
			dia = numero + dia;
		} else {
			int meses = (numero + dia)/30;
			int dias_sueltos = (numero + dia)%30;
			if ((mes + meses) > 12) {
				int anyos = (mes + meses)/12;
				int meses_sueltos = (mes + meses)%12;
				
				dia = dias_sueltos;
				mes = meses_sueltos;
				anyo = anyo + anyos;
			} else {
				mes += meses;
				
				dia = dias_sueltos;
			}
		}
		System.out.println(dia + "/" + mes + "/" + anyo);
		
		sc.close();
	}

}
