package com.curso.fundamentos.ejercicios_basicos;

public class Ejercicio05_Operadores {

		public static void ejecutar() {
			
			int dividendo = 25;
			int divisor = 4;
			
			int dividendo1 = 20;
			int divisor1 = 4;
			
			int cociente = dividendo / divisor;
			int resto = dividendo % divisor;
			
			int cociente1 = dividendo1 / divisor1;
			int resto1 = dividendo1 % divisor1;
			
			System.out.println("El dividendo es " + dividendo);
			System.out.println("El divisor es " + divisor);
			System.out.println("El cociente es " + cociente);
			System.out.println("El resto es " + resto);
			
			System.out.println("El dividendo es " + dividendo1);
			System.out.println("El divisor es " + divisor1);
			System.out.println("El cociente es " + cociente1);
			System.out.println("El resto es " + resto1);
		} 
		
		//Ejecutamos la función "ejecutar" con main
		
		public static void main(String[] args) {
			ejecutar();
		}
	}