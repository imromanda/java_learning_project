package com.curso.fundamentos.ejercicios_basicos;




/*Creamos un ARRAY con varias capitales de paises:
 * Madrid, París, Roma, Berlín, Lisboa, Londres
 * Iteraremos el array para mostrar una lista de capitales 
 */

public class CapitalesArray {
	
	public static void main(String[] args) {
		
		//Iteración de arrays + bucles
		String[] capitales = {"Madrid","París","Roma", "Berlín", "Lisboa", "Londres"};
		String[] paises = {"España", "Francia", "Italia"};
				
		for(int i = 0; i < 6; i++) {
			
			System.out.println(capitales[i]);
		}
		for(String capital:capitales) {
			System.out.println("Position for each -> " + capital);	
			}
		iterar(capitales);
		iterar(paises);
	}
	
	public static void iterar(String[] array) {
		for (int i = 0; i < array.length ; i++) {
			System.out.println("Posicion [" + i + "] desde iterar -> " + array[i]);
		}
		
	}
	

}
