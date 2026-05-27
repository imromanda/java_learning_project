package com.curso.fundamentos.ejercicios_basicos;

import com.curso.fundamentos.utils.Entrada;

/*
 * SOBRECARGA DE MÉTODOS (METHOD OVERLOADING)
 * Es cuando una clase tiene varios métodos con el mismo nombre
 * pero con diferentes parámetros (tipo, número, ambos)
 * 
 * Java elige cuál usar según la firma del método y 
 * el tipo de argumentos que recibe
 * 
 * 
 */


public class SobrecargaDeMetodos {
	
	public static void main(String[] args) {
		System.out.println("\n======MENÚ DE SOBRECARGA====="
				+ "\n1. Mostrar un integer"
				+ "\n2. Mostrar un double"
				+ "\n3. Mostrar un string"
				+ "\n4. Mostrar un array de enteros");
		int miOpcion = Entrada.enteroRango("Pulsa un número de 1 al 4 para continuar", 1, 4);
		switch (miOpcion) {
			case 1 -> {
				int entrada = Entrada.entero("Introduce un número entero: ");
				mostrar(entrada);
			}
			case 2 -> { 
				double entrada = Entrada.doble("Introduce un número decimal: ");
				mostrar(entrada);
			}
			case 3 -> { 
				String entrada = Entrada.texto("Introduce un número decimal: ");
				mostrar(entrada);
			}
			case 4 -> { 
				int[] numeros = new int[5];
				for (int i = 0; i < 5; i++) {
					numeros[i]= Entrada.entero("Introduce el entero de la casilla " + i + ": ");
					}
				mostrar(numeros);
			}
			
			
		}//Fin del switch
		
	
		
		
	}//Fin del main
	
	
	//SOBRECARGA DE MÉTODOS
		public static void mostrar (int n) {
			System.out.println("Has introducido el integer: " + n);
		}
		public static void mostrar (double n) {
			System.out.println("Has introducido el double: " + n);
		}
		public static void mostrar (String n) {
			System.out.println("Has introducido el string: " + n);
		}
		public static void mostrar (int[] array) {
			System.out.println("Has introducido el array de integers: " + array);
			for(int n:array) {
				System.out.print(n + ", ");
			}
		}
		
}//FIN DE FINALES
