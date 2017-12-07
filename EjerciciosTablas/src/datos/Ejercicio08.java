package datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {

	// Cree una tabla de n elementos. Muestre la tabla ordenada

	private static Scanner sc = new Scanner(System.in);
	private static Random rnd = new Random();

	public static void main(String[] args) {

		System.out.print("Introduzca numero de elementos: ");
		int tam = sc.nextInt();
		int[] tabla = new int[tam];
		inicializarTabla(tabla);

		mostrarTabla(tabla);
		ordenaTabla(tabla);
		System.out.println("\nTabla ordenada:\n");
		mostrarTabla(tabla);
	}

	private static void ordenaTabla(int[] lista) {
		int cuentaintercambios=0;
        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<lista.length-1;i++){
                if (lista[i]>lista[i+1]){
                    int variableauxiliar=lista[i];
                    lista[i]=lista[i+1];
                    lista[i+1]=variableauxiliar;
                    cuentaintercambios++;
                }
            }
            if (cuentaintercambios==0){
                ordenado=true;
            }
            cuentaintercambios=0;
        }
    }
	

	private static void mostrarTabla(int[] numeros) {
		for (int i = 0; i < numeros.length; i++)
			System.out.println(i+") "+numeros[i]);
		
	}
	private static void inicializarTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rnd.nextInt(50);
		}
	}

}
