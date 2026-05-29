package com.curso.fundamentos.ejercicios_basicos;

import com.curso.fundamentos.utils.Entrada;

/*
 * Clase abstracta vacía
 * Son las clases que la heredan las que la modifican 
 * para que tome distintos tipos
 */

/*
 * Crea una clase base "Figura" con un método 
 * - "calcularArea()" va a devolver double
 * 
 * Luego crea tres clases hijas:
 *  - Círculo(radio)
 *  - Rectángulo(alto, ancho)
 *  - Triángulo(base, altura)
 *  
 *  Cada clase sobreescribirá el método calcularArea() con su fórmula correspondiente
 *  
 *  EL PROGRAMA DEBE:
 *  
 *  1. Preguntar qué figura quiere crear
 *  2. Pedir los datos necesarios según la figura
 *  3. Crear un objeto de la clase correspondiente
 *  4. Guardarlo en una variable de tipo Figura
 *  5. 
 *  
 */


//=====================================

abstract class Figura {

	
//	//Estructura interna
//	public double area;
//	
//	//Constructor
//	public Figura (double area) {
//		this.area = area;
//	}
	
	//Método vacío
	public abstract double calcularArea(); //Fin calcularArea
	
	
} // Fin Figura

class Circulo extends Figura {
	
	double miRadio;
	//Constructor
	public Circulo(double radio) {
//		super(); //llama al constructor de la clase padre donde están this.nombre = nombre;
		this.miRadio=radio;
	}
	
	
	@Override
	
	public double calcularArea() {		
		double area = (Math.PI*(this.miRadio*this.miRadio));
		return area;
	}
	
}//Fin Circulo






public class Polimorfismo {
	
	public static void main(String[] args) {
	
		Figura figura = null;
		int miOpcion;

		do {
			System.out.println(" ============= CÁLCULO DE ÁREAS =============\r\n"
							+ "	 * 1. Área de un círculo.\r\n"
							+ "	 * 2. Área de un rectángulo.\r\n"
							+ "	 * 3. Área de un triángulo.\r\n"
							+ "	 * 0. Salir");
			miOpcion = Entrada.enteroRango("Escribe el número para elegir opción: ", 0, 4);
			
				switch(miOpcion) {
				case 1 -> {
					double miRadio = Entrada.doble("Medida del radio del círculo (cm): ");
					figura = new Circulo(miRadio);
					//figura.calcularArea();
					System.out.println("Area =" + figura.calcularArea());

				}
				
//				case 2 -> calcularRectangulo();
//				case 3 -> calcularTriangulo();
//				case 4 -> calcularCirculo();
//		
				case 0 -> System.out.println("Cálculo terminado");
		
				default -> System.out.println("Inténtalo otra vez");
				}
				
				System.out.println(" ");
				System.out.println(" ");
				
		} while (miOpcion != 0);
		
		
	}//Fin de main
	
	
	
	
	

}
