package com.curso.fundamentos.ejercicios_basicos;

import com.curso.fundamentos.utils.Entrada;

public class MetodosConParametros {
/*
 * Crea un programa que pida dos números al usuario y permita:
 * - Calcular su suma
 * - Calcular su resta
 * - Calcular su multiplicación
 * - Calcular su división (solo si el divisor NO es cero)
 * 
 * Cada operación ha de realizarse en un método independiente
 * 
 * 
 */
	
	public static void main(String[] args) {
		
		double a = Entrada.doble("Introduce el primer número: ");
		double b = Entrada.doble("Introduce el segundo número: ");
		
		//MOSTRAR RESULTADOS
		System.out.println("===RESULTADOS===");
		System.out.println("Suma: " + sumar(a,b));
		System.out.println("Resta: " + restar(a,b));
		System.out.println("Multiplicación: " + multiplicar(a,b));
		System.out.println("División: " + dividir(a,b));

			
	
		
	}//Fin de Main
	

	public static double sumar(double x, double y) {
			return x + y;
		}

	public static double restar(double x, double y) {
			return x - y;
		}

	public static double multiplicar(double x, double y) {
			return x * y;
		}

	public static double dividir(double x, double  y) {
		if (y == 0)	{
			System.out.println("División por 0 no permitida, prueba otra vez");
			return Double.NaN;
		}
		else return (x / y);
		}

}
