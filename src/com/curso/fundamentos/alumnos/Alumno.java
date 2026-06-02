package com.curso.fundamentos.alumnos;

public class Alumno extends Persona {
	private String curso;
	
	
	//Constructor
	public Alumno (String nombre, int edad, String curso) {
		super(nombre, edad);
		this.curso = curso;
	}
		
	//GETTERS
	public String getCurso() {
		return curso;
	}
	
	
	//SETTERS
	public void setCurso(String curso) {
		//Validación: si se envía vacío no se settea
		if (curso == null || curso.isEmpty() ) return;
		this.curso = curso;
		}
	
	//Método que muestre la info del alumno:
	
	@Override
	public void mostrarInfo() {
		System.out.println("\nNombre: " + getNombre());
		System.out.println("\nEdad: " + getEdad());
		System.out.println("\nCurso: " + getCurso());
		}		
	
	}

