package com.curso.fundamentos.ejercicios_basicos;

import com.curso.fundamentos.utils.Entrada;

/*
 * Creamos una interfaz llamada "Operable" con dos métodos:
 * 
 * - encender()
 * - apagar()
 * 
 * Luego dos clases que implementen la interfaz
 * 
 * - Ordenador
 * - Televisor
 * 
 * Cada clase debe mostrar mensajes distintos al apagar y encender
 */


/*
 * INTERFAZ:
 * 
 * Define qué metodos debe tener una clase
 * Sin indicar cómo se imlementan
 */

interface Operable{
		
		void encender();
		void apagar();
		}
//=======================================================================


class Ordenador implements Operable {
	
	@Override
	public void encender() {
		System.out.println("\nEl ordenador se está encendiendo");	
		}
	
	@Override
	public void apagar() {
		System.out.println("\nEl ordenador se está apagando");	

	}
}//Fin class Ordenador
//=======================================================================


class Televisor implements Operable {
	
	@Override
	public void encender() {
		System.out.println("\nEl televisor se está encendiendo");	
		}
	
	@Override
	public void apagar() {
		System.out.println("\nEl televisor se está apagando");	

	}
}//Fin class Televisor
//=======================================================================

public class Interfaces {

	
	public static void main(String[] args) {
		
		int miOpcion;
		
		 miOpcion = Entrada.enteroRango("\nEscribe para elegir 1. Ordenador o 2. Televisor", 1, 2);
		 
		 Operable dispositivo;
		 
		 if(miOpcion == 1) dispositivo = new Ordenador();
		 	else dispositivo = new Televisor();

		System.out.println("\n====== OPERACIONES con dispositivo ======");	
		dispositivo.encender();
		dispositivo.apagar();

		
	}//Fin main
	
}//Fin Interfaces
