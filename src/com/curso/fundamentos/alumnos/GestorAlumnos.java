package com.curso.fundamentos.alumnos;

import java.util.ArrayList;

/*
 * Gestiona las acciones sobre la lista de Alumnos
 */

public class GestorAlumnos {
	//Defino la lista que guarda objetos de tipo alumno
	
	private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
	
	
	
	//Añadir alumnos
	public void añadirAlumno (Alumno alumno) {
		listaAlumnos.add(alumno);
		System.out.println("\nAlumno " + alumno.getNombre() +  " añadido correctamente.");
		}
	public void borrarAlumno (Alumno alumno) {
		listaAlumnos.remove(alumno);
		System.out.println("\nAlumno " + alumno.getNombre() +  " eliminado correctamente.");
		}
	
	//Modificar alumno
	public boolean editarAlumno (String nombreBuscado, String nuevoNombre, int nuevaEdad, String nuevoCurso) {
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
	
	
}// Fin class GestorAlumnos



