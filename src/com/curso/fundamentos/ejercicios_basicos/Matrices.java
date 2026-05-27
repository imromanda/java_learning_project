package com.curso.fundamentos.ejercicios_basicos;

import com.curso.fundamentos.utils.Entrada;

public class Matrices {
	
	/*
	 * Declarar una matriz de 3x3
	 * Solicitar al usuario que introduzca los 9 valores
	 * Mostrar la matriz en un formato tabla
	 * Calcular y mostrar la suma de cada fila y columna
	 * Calcular la suma la diagonal
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		
		//Definir una matriz de 3x3
		
		int[][] miMatriz = new int [3][3] ; //El número de espacios, no de índices 
		System.out.println("\n ======Introduce los valores de la matriz======");
		
		//Rellenar matriz
//		for (int i = 0; i < 3; i++) { 			//bucle para columnas
//			for (int j = 0; j < 3; j++) { 		//bucle para filas
		
		for (int i = 0; i < miMatriz.length; i++) { 			//bucle para columnas
			for (int j = 0; j < miMatriz[i].length; j++) { 		//bucle para filas
				miMatriz[i][j] = Entrada.entero("Valor [" + i + "][" + j + "]: ");
			}
		}
		
		
		//Mostrar matriz
		System.out.println("\n ======Matriz introducida======");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) { 
				System.out.print(miMatriz[i][j] + "\t");
			}
				System.out.println(); //Línea en blanco
		}
		
		
		//SUMAR FILAS
		System.out.println("\n======SUMA DE FILAS======");
		for (int i = 0; i < miMatriz.length; i++) {
			int sumaFila = 0;
			for( int j = 0; j < miMatriz[i].length; j++) {
				sumaFila += miMatriz[i][j];
			}
			System.out.println("Suma de fila " + i + "= " + sumaFila);
		}//Fin de SUMAR FILAS
		
		
		//SUMAR COLUMNAS
		System.out.println("\n======SUMA DE COLUMNAS======");
		for (int j = 0; j < miMatriz.length; j++) {
			int sumaColumna = 0;
			for( int i = 0; i < miMatriz[j].length; i++) {
				sumaColumna += miMatriz[i][j];
			}
			System.out.println("Suma de columna " + j + "= " + sumaColumna);
		}//FIN DE SUMAR COLUMNAS
		
		
		
		//SUMAR DIAGONAL IZQ-DCH
		int sumaDiagonalIzq = 0;

		System.out.println("\n======SUMA DE DIAGONAL IZQUIERDA A DERECHA======");
		for (int i = 0; i < miMatriz.length; i++) {
			sumaDiagonalIzq += miMatriz[i][i];
			}
			System.out.println("Suma de diagonal izquierda a derecha = " + sumaDiagonalIzq);
		//Fin de SUMAR DIAGONAL
		

		//SUMAR DIAGONAL DCH-IZQ
		int sumaDiagonalDch = 0;
	
		System.out.println("\n======SUMA DE DIAGONAL DERECHA A IZQUIERDA======");
		for (int i = 0; i < miMatriz.length; i++) {
			 int j = miMatriz[i].length-1-i;
				sumaDiagonalDch += miMatriz[i][j];
			}
			System.out.println("Suma de diagonal derecha a izquierda = " + sumaDiagonalDch);
			
			
		//Fin de SUMAR DIAGONAL
			
			
		
//		//SUMAR DIAGONAL DCH-IZQ
//			int sumaDiagonalDch = 0;
//			int cont = miMatriz.length-1;
//			
//			System.out.println("\n======SUMA DE DIAGONAL DERECHA A IZQUIERDA======");
//			for (int i = 0; i < miMatriz.length; i++) {
//				System.out.println(miMatriz[cont][i]);
//				sumaDiagonalDch += miMatriz[cont][i];
//				cont--;
//			} 
//			System.out.println(sumaDiagonalDch);

	}//Fin de Main
	
	
}//Fin de Matrices
