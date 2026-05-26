package com.curso.fundamentos.ejercicios_basicos;

import com.curso.fundamentos.utils.Entrada;

	/*
	 * Solicitamos la edad desde el teclado
	 * La solicitud se hará usando la uilidad Entrada.
	 * con un condicional comprobamos 
	 * 	si la persona es mayor o igual a 18  -> Mayor de edad
	 * 	Si no, -> Menor de edad
	 */

public class MayorDeEdad {
	
	public static void ejecutar() {
		
		int miEdad = Entrada.entero("Escribe tu edad: ");
		
	//	System.out.println(miEdad);	
	
//		if (miEdad >= 18)
//			System.out.println("Enhorabuena, si tienes " + miEdad + 
//					" años, puedes tomarte una cervecilla.");
//		else 
//			System.out.println("Si tienes " + miEdad + 
//					" años, tómate un zumito de naranja.");
		
		if (miEdad >= 0 & miEdad <2) 
			System.out.println("Enhorabuena, si tienes " + miEdad + " eres un bebé");
		else if (miEdad >= 2 & miEdad <12) 
			System.out.println("Enhorabuena, si tienes " + miEdad + " eres un niño");
		else if (miEdad >= 12 & miEdad <18) 
			System.out.println("Enhorabuena, si tienes " + miEdad + " eres un adolescente");
		else if (miEdad >= 18 & miEdad <65) 
			System.out.println("Enhorabuena, si tienes " + miEdad + " eres un adulto");
		else 
			System.out.println("Enhorabuena, si tienes " + miEdad + " eres un mayor");
	}
	

	public static void main(String[] args) {
		ejecutar();
	}
}