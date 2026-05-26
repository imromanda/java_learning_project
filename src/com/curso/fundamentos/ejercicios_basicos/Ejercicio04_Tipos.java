package com.curso.fundamentos.ejercicios_basicos;

public class Ejercicio04_Tipos {
	public static void ejecutar() {
		//Definimos variables
		//SINTAXIS: Tipo nombre_variable = valor_de_variable
		
		int year = 2026;
		String greeting = "Hi there!";
		boolean andalusian = true;
		
		//float: Aprox 6 o 7 cifras decimales fiables
		float nroRealCorto = 10.123456789123456789123456789f;
		
		//double: aprox. 15-16 cifras decimales fiables
		double nroRealLargo = 10.123456789123456789123456789;
		
		System.out.println("El año es " + year);
		System.out.println("El saludo es " + greeting);
		System.out.println("La persona es andaluza:  " + andalusian);
		System.out.println("El número corto es " + nroRealCorto);
		System.out.println("El número largo es " + nroRealLargo);
	} 
	
	//Ejecutamos la función "ejecutar" con main
	
	public static void main(String[] args) {
		ejecutar();
	}
}