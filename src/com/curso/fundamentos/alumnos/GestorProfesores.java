package com.curso.fundamentos.alumnos;

import java.util.ArrayList;

public class GestorProfesores {
	//Definbo la lista que guarda objetos de tipo Profesor
	
	private ArrayList<Profesor> listaProfesores = new ArrayList<>();
	
	
	//Añadir profesores
	public void anadirProfesor(Profesor profesor) {
		listaProfesores.add(profesor);
		System.out.println("\nProfesor " + profesor.getNombre() +  " anadido correctamente.");
	}
	
	//Modificar profesor
		public boolean modificarProfesor (String nombreBuscado, String nuevoNombre, int nuevaEdad, String nuevaAula) {
			for (Profesor a:listaProfesores) {
				if (a.getNombre().equalsIgnoreCase(nombreBuscado)) {
					a.setNombre(nuevoNombre); 				
					a.setEdad(nuevaEdad); 
					a.setAula(nuevaAula); 
					System.out.println("\nEl profesor " + nombreBuscado + " ha sido sustituido por " + a.getNombre());
					return true;
					} 
				} //Fin for
		
		System.out.println("\nProfesor no encontrado");
		return false;
		} //fin editarProfesor
		
		
		//Eliminar profesor
		public boolean eliminarProfesor (String nombreBuscado) {
			for (Profesor a:listaProfesores) {
					if (a.getNombre().equalsIgnoreCase(nombreBuscado)) {
						listaProfesores.remove(a);
						System.out.println("\nProfesor " + nombreBuscado +  " eliminado correctamente.");
						return true;
					}
				}
			System.out.println("\nProfesor no encontrado");
			return false;
			}
		
		
		//Mostrar la lista de profesores
		public void mostrarTodosProfes() {
			for (Profesor a:listaProfesores) {
				a.mostrarInfo();
			}
			
		}
		
}//Fin GestorProfesor
