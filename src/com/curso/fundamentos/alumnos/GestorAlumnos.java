package com.curso.fundamentos.alumnos;

import java.util.ArrayList;

/*
 * Gestiona las acciones sobre la lista de Alumnos
 */

public class GestorAlumnos {
	//Defino la lista que guarda objetos de tipo alumno
	
	private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
	
	
	
	//Anadir alumnos
	public void anadirAlumno (Alumno alumno) {
		listaAlumnos.add(alumno);
		System.out.println("\nAlumno " + alumno.getNombre() +  " anadido correctamente.");
		}

	
	//Modificar alumno
	public boolean modificarAlumno (String nombreBuscado, String nuevoNombre, int nuevaEdad, String nuevoCurso) {
		for (Alumno a:listaAlumnos) {
			if (a.getNombre().equalsIgnoreCase(nombreBuscado)) {
				a.setNombre(nuevoNombre); 				
				a.setEdad(nuevaEdad); 
				a.setCurso(nuevoCurso); 
				System.out.println("\nEl alumno " + nombreBuscado + " ha sido sustituido por " + a.getNombre());
				return true;
				} 
			} //Fin for
	
	System.out.println("\nAlumno no encontrado");
	return false;
	} //fin editarAlumno
	
	
	//Eliminar alumno
	public boolean eliminarAlumno (String nombreBuscado) {
		for (Alumno a:listaAlumnos) {
				if (a.getNombre().equalsIgnoreCase(nombreBuscado)) {
					listaAlumnos.remove(a);
					System.out.println("\nAlumno " + nombreBuscado +  " eliminado correctamente.");
					return true;
				}
			}
		System.out.println("\nAlumno no encontrado");
		return false;
		}
	
	//Mostrar la lista de alumnos
	public void mostrarTodosAlumnos() {
		for (Alumno a:listaAlumnos) {
			a.mostrarInfo();
		}
		
	}
	
	
}// Fin class GestorAlumnos



