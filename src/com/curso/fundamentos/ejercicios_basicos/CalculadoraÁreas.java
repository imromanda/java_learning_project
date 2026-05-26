package com.curso.fundamentos.ejercicios_basicos;

import com.curso.fundamentos.utils.Entrada;

public class CalculadoraÁreas {
	
	/*
	 * Crearemos un menú de elección
	 * Con el siguiente aspecto:
	 * ============= CÁLCULO DE ÁREAS =============
	 * 1. Área de un cuadrado.
	 * 2. Área de un rectángulo.
	 * 3. Área de un triángulo.
	 * 4. Área de un círculo.
	 * 0. Salir
	 * 
	 * Necesitamos una variable para almacenar la opción elegida
	 * Crearemos un Método para cada cálculo, 
	 * que antes solicite los datos necesarios
	 * 
	 */

	
	
	
	public static void ejecutar() {
		
		int miOpcion;

		do {
			System.out.println(" ============= CÁLCULO DE ÁREAS =============\r\n"
							+ "	 * 1. Área de un cuadrado.\r\n"
							+ "	 * 2. Área de un rectángulo.\r\n"
							+ "	 * 3. Área de un triángulo.\r\n"
							+ "	 * 4. Área de un círculo.\r\n"
							+ "	 * 0. Salir");
			miOpcion = Entrada.entero("Escribe el número para elegir opción: ");
			
				switch(miOpcion) {
				case 1 -> calcularCuadrado();
				case 2 -> calcularRectangulo();
				case 3 -> calcularTriangulo();
				case 4 -> calcularCirculo();
		
				case 0 -> System.out.println("Cálculo terminado");
		
				default -> System.out.println("Inténtalo otra vez");
				}
				
				System.out.println(" ");
				System.out.println(" ");
				
		} while (miOpcion != 0);
		
	}
			
		public static void calcularCuadrado()  {
			
			double miLado = Entrada.doble("Medida del lado del cuadrado (cm): ");
			double areaCuadrado = (miLado * miLado);
			System.out.println(" ");
			System.out.println("El área de tu cuadrado es: " + areaCuadrado + "cm");
			
//			String continuar = Entrada.texto("¿Quieres volver a calcular? S/N");
//			switch continuar {
//			case S ->  ejecutar();
//			case N -> System.out.println("Cálculo terminado");
			
			}
			


			//Enteros
			//int miLado = Entrada.entero("Medida del lado del cuadrado (en cm): ");
			//int areaCuadrado = (miLado * miLado);
			//System.out.println("El área de tu cuadrado es: " + areaCuadrado);
		
		
		
		
		public static void calcularRectangulo() {
			
			double miBase = Entrada.doble("Medida de la base del rectángulo (cm): ");
			double miAltura	 = Entrada.doble("Medida de la altura del rectángulo (cm): ");
			double areaRectangulo = (miBase * miAltura);
			System.out.println(" ");
			System.out.println("El área de tu rectángulo es: " + areaRectangulo + "cm");
			
			}	
		
		
		public static void calcularTriangulo() {
			
			double miBase = Entrada.doble("Medida de la base del triángulo (cm): ");
			double miAltura	 = Entrada.doble("Medida de la altura del triángulo (cm): ");
			double areaTriangulo = ((miBase * miAltura)/2);
			System.out.println(" ");
			System.out.println("El área de tu triángulo es: " + areaTriangulo + "cm");
			
		}
		
		
		public static void calcularCirculo() {
			
			double miRadio = Entrada.doble("Medida del radio del círculo (cm): ");
			double areaCirculo = (Math.PI*(miRadio*miRadio));
			System.out.println(" ");
			System.out.println("El área de tu círculo es: " + areaCirculo + "cm");
			
		}
		
	
	
	
	
	
	public static void main(String[] args) {
		
		ejecutar();
	}
	
	
}
