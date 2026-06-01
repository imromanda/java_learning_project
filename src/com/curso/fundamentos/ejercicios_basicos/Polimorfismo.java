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
	//Porque se va a definir en las clases hijas
	
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

class Rectangulo extends Figura {
	
	double miBase;
	double miAltura;
	//Constructor
	public Rectangulo(double lado, double altura) {
		this.miBase = lado;
		this.miAltura = altura;
	}
	
	
	@Override
	
	public double calcularArea() {		
		double area = (miBase*miAltura);
		return area;
	}
	
}//Fin Rectángulo

class Triangulo extends Figura {
	
	double miBase;
	double miAltura;
	//Constructor
	public Triangulo(double base, double altura) {
		this.miBase = base;
		this.miAltura = altura;
	}
	
	@Override
	
	public double calcularArea() {		
		double area = ((miBase*miAltura)/2);
		return area;
	}
	
}//Fin Triángulo

class Cuadrado extends Figura {
	
	double miLado;
	//Constructor
	public Cuadrado(double lado) {
		this.miLado = lado;	}
	
	@Override
	
	public double calcularArea() {		
		double area = (miLado*miLado);
		return area;
	}
	
}//Fin Triángulo




public class Polimorfismo {
	
	public static void main(String[] args) {
	
		Figura figura = null;
		
		int miOpcion;

		do {
			System.out.println(" ============= CÁLCULO DE ÁREAS =============\r\n"
							+ "	 * 1. Área de un círculo.\r\n"
							+ "	 * 2. Área de un rectángulo.\r\n"
							+ "	 * 3. Área de un triángulo.\r\n"
							+ "	 * 4. Área de un cuadrado.\r\n"

							+ "	 * 0. Salir");
			miOpcion = Entrada.enteroRango("\nEscribe el número para elegir opción: ", 0, 4);
			
				switch(miOpcion) {
				case 1 -> {
					double miRadio = Entrada.doble("\nMedida del radio del círculo (cm): ");
					figura = new Circulo(miRadio);
					//figura.calcularArea();

				}
				case 2 -> {
					double miBase = Entrada.doble("\nMedida del lado del rectángulo (cm): ");
					double miAltura = Entrada.doble("\nMedida de la altura del rectángulo (cm): ");
					figura = new Rectangulo(miBase, miAltura);
				}
				case 3 -> {
					double miBase = Entrada.doble("\nMedida de la base del triángulo (cm): ");
					double miAltura = Entrada.doble("\nMedida de la altura del triángulo (cm): ");
					figura = new Triangulo(miBase, miAltura);
				}
				case 4 -> {
					double miLado = Entrada.doble("\nMedida del lado del cuadrado (cm): ");
					figura = new Cuadrado(miLado);
				}
				case 0 -> System.out.println("\nCálculo terminado");
		
				default -> System.out.println("\nInténtalo otra vez");
				}
				
				System.out.println("\nArea = " + figura.calcularArea() + " cm");

				System.out.println(" ");
				System.out.println(" ");
				
		} while (miOpcion != 0);
		

		
		
	}//Fin de main
	
	
	
	
	

}
