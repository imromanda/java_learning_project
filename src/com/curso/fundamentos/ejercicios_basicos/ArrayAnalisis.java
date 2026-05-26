package com.curso.fundamentos.ejercicios_basicos;

public class ArrayAnalisis {

	
	
	/*
	 * 1. Crear un Array de 5 elementos de tipo entero
	 * 2. Calcularemos la media de los items (elementos del array)
	 * 3. Recuperaremos el valor más alto (el mayor)
	 * 
	 */
	
	public static void main(String[] args) {
		int[] numeros = {
			23, -63, 69, 21, 82
		};
		
		//2. Calcularemos la media de los items
		
		int suma = 0; 
		double media = 0;
		
		for (int numero:numeros) {
			suma = suma + numero;
			System.out.println("Paso a paso " + suma);
		} 
		
		System.out.println("Suma total " + suma);
		
		media = (suma/numeros.length);
		System.out.println("Media " + media);

//		for (int i = 0; i < numeros.length; i++);
		
		
		
	}
	
}

