package com.curso.fundamentos.ejercicios_basicos;
//import java.util.Scanner;
import com.curso.fundamentos.utils.Entrada;

public class Ejercicio06_Scanner {
	
	
	//Clase privada estática y final que usa Scanner llamda sc 
	//private static final Scanner sc = new Scanner(System.in); 
	
		
	//Declaramos la función "ejecutar" con la funcionalidad que necesitemos
	public static void ejecutar() {
		
		//Imprime el string y el scanner permite escribir en consola
	//	System.out.print("Introduce tu edad: ");
		
		//nextLine es un string de lo que hemos introducido arriba
		//ese string es traducido (Integer.parseInt) a un entero 
		//guardado en variable age
	//	int age = Integer.parseInt(sc.nextLine());
		
		 // System.out.print("Introduce tu nombre: ");
		// String name = sc.nextLine();
		int age = Entrada.entero("Introduce tu edad: ");
		String name = Entrada.texto("Introduce tu nombre: ");
		
		
		
		
		
		System.out.println("Has introducido la edad de " + age + " años");
		System.out.println("Has introducido el nombre de " + name );
		System.out.println("¡Bienvenido!" + name + " de " + age + " años");

	}
	
	
	
	
	//Ejecutamos la función "ejecutar" con main
	public static void main(String[] args) {
		ejecutar();
	}
	
}
