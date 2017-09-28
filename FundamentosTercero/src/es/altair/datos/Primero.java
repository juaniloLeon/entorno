package es.altair.datos;

import java.util.Scanner;

public class Primero {

	// Escriba un programa que pida al usuario una hora expresada en segundos e
	// imprima la cantidad de horas, minutos, y segundos.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Segundos: ");
		int segundosTotales = sc.nextInt();

		int horas = segundosTotales / 3600;
		int minutos = (segundosTotales % 3600) / 60; 
		//int minutos = ((segundosTotales-horas*3600)/60);
		int segundos = (segundosTotales % 60);
		//int segundos = segundosTotales-(horas*3600+minutos*60);

		System.out.println(
				segundosTotales + ": " + horas + " horas, " + minutos + 
				" minutos y " + segundos + " segundos");

		sc.close();
	}

}
