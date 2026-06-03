package com.curso.fundamentos.alumnos;

public class Persona {
	
	//Campos de clase o atributos de clase
	private String nombre;
	private int edad;
	
	
	//Constructor
	public Persona (String nombre, int edad) {
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
	public void setNombre(String nombre) {
		//Validación: si se envía vacío no se settea
		if (nombre == null || nombre.isEmpty() ) return;
		this.nombre = nombre;

	}
	public void setEdad(int edad) {
		//Validación: si se envía vacío no se settea
		if (edad <= 0  ) return;
		this.edad = edad;
	}	

	
	//Método para MOSTRAR LA INFO
	
	public void mostrarInfo() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Edad: " + getEdad());
}

} //FIN class Persona
