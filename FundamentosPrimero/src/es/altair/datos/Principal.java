package es.altair.datos;

public class Principal {

	public static void main(String[] args) {
		// TIPOS DE VARIABLES
		
		// TIPOS PRIMITIVOS O SIMPLES
		// Enteros
		byte b; // -128 a +127 (8 bits)
		short sh; // -32768 a + 32767 (16 bits)
		int i; // -2.147.483.648 a + 2.147.483.647 (32 bits)
		long l; // -9223372036854775808 a +9223372036854775807 (64 bits)
		char c; // 0 a 65535 ASCII
		
		//char a = 'a';
		char a = 97;
		
		// Reales
		float f = 3.1416F; // precisión de 7 dígitos (32 bits)
		double d = 3.1416; // precisión de 16 digitos (64 bits)
		
		double pi = Math.PI;
		System.out.println(pi);
		
		// Lógicos
		boolean bol = false; // false o true
		
		// TIPOS COMPLEJOS
		Integer in;
		Double doo;
		Float fo;
		Boolean boll;
		Character cc;
		Byte by;
		Short sho;
		
		// TIPO CADENA
		String cadena = "hola";
		System.out.println(cadena);
	}

}
