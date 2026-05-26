package com.curso.fundamentos.ejercicios_basicos;

public class Ejercicio08_Bucles {

	//Números del 1 al 10
	public static void ejecutar() {
		//SINTAXIS: for (inicio; condición; incremento) {...}
		
		//Incremento
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			}
		
	//Separa los dos bucles con ****
	System.out.println("*****");

		//Decremento
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ejecutar();
	}
}
