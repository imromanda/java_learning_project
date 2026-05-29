package com.curso.fundamentos.ejercicios_basicos;
/*
 *ENUNCIADO:
 * Crea una clase base (padre) llamada "Animal" con los atributos:
 * 	- Nombre 
 *  - Edad
 *  
 *  Crea un método "hacerSonido()" que muestre un mensaje genérico
 *  
 *  Luego crea dos clases hicas:
 *   - Perro -> Sobreescribe "hacerSonido()": Guau
 *   - Gato -> Sobreescribe "hacerSonido()": Miau
 *   
 * El programa debe:
 *  1. Pedir al usuario si quiere crear un perro o un gato
 *  2. Pedir Nombre edad del animal
 *  3. Crear el objeto perro o gato (que extienden la clase a animal)
 *  4. Llamar a "hacerSonido()"
 */

import com.curso.fundamentos.utils.Entrada;

/*
 * CONCEPTO DE HERENCIA: La herencia en Java es el mecanismo mediante el cual 
 * una clase Hija (subclase) puede reutilizar y ampliar el código de una 
 * clase Padre (Superclase)
 * Permite decir que "una clase hija es una versión más específica de otra"
 * 
 */



//======================
//CLASE ANIMAL
//======================

class Animal {
	private String nombre;
	private int edad;
	
	//Constructor
	public Animal (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	

	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}	
	

	//SETTERS
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	public void setEdad(int nuevaEdad) {
		this.edad = nuevaEdad;
	}
	
	
	//MÉTODO "hacerSonido()"
	
	public void hacerSonido() {
	
			System.out.println("\nEl animal hace un sonido genérico");
			
	}//Fin hacerSonido()
	
}//Fin Clase Animal


class Perro extends Animal {
	
	//Constructor
	public Perro (String nombre, int edad) {
		super(nombre, edad); //llama al constructor de la clase padre donde están this.nombre = nombre;
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("Y dice... Guau, guau");
	}
	
}

class Gato extends Animal {
	
	//Constructor
	public Gato (String nombre, int edad) {
		super(nombre, edad); //llama al constructor de la clase padre donde están this.nombre = nombre;
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("Y dice... Miau, miau");
	}
	
}


//

public class Herencia {
	
	public static void main (String[] args) {
		
		int miOpcion = Entrada.enteroRango("\n¿Tu mascota es perro ('1') o gato ('2')? ", 1, 2);
		
		//===================================================================================
		
//		String nombre = Entrada.texto("\nNombre de tu mascota: ");
//		int edad = Entrada.entero("\nEdad de tu mascota: ");
//		
//		Animal animal;
//		
//		if (miOpcion == 1) {
//			animal = new Perro(nombre, edad);
//		} else {
//			animal = new Gato(nombre, edad);
//		}
//		
//		//Pintamos los datos
//		System.out.println("\n=== INFORMACIÓN DE TU MASCOTA ==="
//				+ "\nNombre: " + animal.getNombre()
//						+ "\nEdad: " + animal.getEdad());
//		animal.hacerSonido();
//		
//		
		
		
		
	//	==============================================================================================
						switch(miOpcion) {
						case 1 -> {
							String nombre = Entrada.texto("\n¿Cuál es el nombre de tu perrete? ");
							int edad = Entrada.entero("\n¿Qué edad tiene tu perrete? ");
							Animal animal = new Perro(nombre, edad);
							System.out.println("\nTu perro es " + nombre + " y tiene " + edad + " años.");
							
							animal.hacerSonido();
							
							}
						case 2 -> {
							String nombre = Entrada.texto("\n¿Cuál es el nombre de tu gatete? ");
							int edad = Entrada.entero("\n¿Qué edad tiene tu gatete? ");
							Animal animal = new Gato(nombre, edad);
							System.out.println("\nTu gato es " + nombre + " y tiene " + edad + " años.");
							
							animal.hacerSonido();
							}
						
						}
	
//		String animalNombre = Entrada.texto("\n¿Cuál es el nombre de tu mascota? ");
//		int animalEdad = Entrada.entero("\n¿Qué edad tiene tu mascota? ");

		

		//Inicialización de la clase Animal
//		Animal nuevoAnimal = new Animal(animalNombre, animalEdad);
		
	}//Fin de main
	
	

	
}//Fin de Herencia
