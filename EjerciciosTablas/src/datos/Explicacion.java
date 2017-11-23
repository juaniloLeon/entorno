package datos;

import java.util.Random;

public class Explicacion {

	
	
	public static void main(String[] args) {
		
		int tabla [][] = new int [10][10];
		
		tabla[0][0] = 3;

		//System.out.println(tabla[0][0]);
		
		int tabla2 [] = {2,3,4};
		
		String cadena [] = {"hola", "que", "tal"};
		
		for (int i = 0; i < tabla2.length; i++) {
			System.out.println(tabla2[i]);
		}
		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i] = tabla2[i] * tabla2[i];
		}
		for (int i = 0; i < tabla2.length; i++) {
			System.out.println(tabla2[i]);
		}
		
		String frase = "";
		for (int i = 0; i < cadena.length; i++) {
			frase += cadena[i] + " ";
		}
		System.out.println(frase);
		
//		for (int i = 0; i < tabla.length; i++) {
//			for (int j = 0; j < tabla.length; j++) {
//				tabla[i][j] = new Random().nextInt(100);
//			}
//		}
//		
//		for (int i = 0; i < tabla.length; i++) {
//			for (int j = 0; j < tabla.length; j++) {
//				System.out.print(tabla[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		//System.out.println(tabla2.length);
		
		int nueva [][] = new int [6][3];
		for (int i = 0; i < nueva.length; i++) {
			for (int j = 0; j < nueva[i].length; j++) {
				tabla[i][j] = new Random().nextInt(100);
			}
		}
		
		for (int i = 0; i < nueva.length; i++) {
			for (int j = 0; j < nueva[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
	}

}
