package com.curso.fundamentos.alumnos;

public class Profesor extends Persona {
	private String aula;
	
		//Constructor
			public Profesor (String nombre, int edad, String aula) {
				super(nombre, edad);
				this.aula = aula;
			}
		
		//GETTERS
			public String getAula() {
				return aula;
			}
		
		
		//SETTERS
			public void setAula(String aula) {
				//Validación: si se envía vacío no se settea
				if (aula == null || aula.isEmpty() ) return;
				this.aula = aula;
				}
			
		//MÉTODO QUE MUESTRE LA INFO DEL ALUMNO:
			@Override
			public void mostrarInfo() {
				System.out.println("\nNombre: " + getNombre());
				System.out.println("Edad: " + getEdad());
				System.out.println("Aula: " + getAula());
				System.out.println("------------------");

			}
			

}
