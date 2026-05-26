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
		//3. Recuperar el número mayor del array
		
		int nroMayor = numeros[0];
		int nroMenor = numeros[0];
		
		for (int numero:numeros) {
			//suma = suma + numero;
			suma +=numero; //Contracción de suma = suma + numero en JAVA
			System.out.println("Paso a paso " + suma);
			if (numero > nroMayor) {
				nroMayor = numero;
			}
			
			if (numero < nroMenor) {
				nroMenor = numero;
			}
			
		} 
		
		System.out.println("La suma total es " + suma);
		
		media = (suma/numeros.length);
		System.out.println("La media es " + media);
		System.out.println("El número mayor es " + nroMayor);
		System.out.println("El número menor es " + nroMenor);


			//for (int i = 0; i < numeros.length; i++);
		
	}
	
}

