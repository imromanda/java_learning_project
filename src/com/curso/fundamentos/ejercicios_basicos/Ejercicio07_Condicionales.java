package com.curso.fundamentos.ejercicios_basicos;
import com.curso.fundamentos.utils.Entrada;


public class Ejercicio07_Condicionales {
	
	public static void ejecutar() {
		
				int num;
				do {
					 num = Entrada.entero("Introduce un número: ");
					
					/*CONDICIONAL IF. SINTAXIS:
					 *  		if (condición)
					 *  			Acción si es verdadero
					 *  		else
					 *  			Acción si es falso
					 */
					if (num >= 0)
						System.out.println("El número " + num + " es positivo");
					else 
						System.out.println("El número " + num + " es negativo");
		} while (num != 0); //Distinto de cero
		
	}
	public static void main(String[] args) {
		ejecutar();
	}
}
