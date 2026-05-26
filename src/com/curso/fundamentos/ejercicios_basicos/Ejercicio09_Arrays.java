package com.curso.fundamentos.ejercicios_basicos;

public class Ejercicio09_Arrays {

	public static void main(String[] args) {
		String[] colors = {"Rojo","Verde","Azul","Amarillo"};
		
		System.out.println("El color seleccionado es: " + colors[2]);
		System.out.println("El color seleccionado es: " + colors[0]);

		//Iteración de arrays + bucles
		String[] cities = {"Almería","Jaén","Granada","Huelva"};
		double[] temp = {25.7, 32.3, 19.6, 14.7};
		
		for(int i = 0; i < 4; i++) {
			
			System.out.println("La temperatura actual en " + cities[i] +
					" es de " + temp[i] + "ºC" );
		}
	

	}
	
	
}
