package com.curso.fundamentos.alumnos;

import com.curso.fundamentos.utils.Entrada;

/*
 * Dentro del main creo un método menú
 * 
 * Dentro del menú creo las variables para capturar los datos
 * 
 * Creo un objeto con esos datos
 * 
 *  Profesor prof = capturaDatos(asdfasdfasdf)
 *
 * 
 */





public class Main {

	public static void main(String[] args) {
		
		//RELLENAMOS UN POCO LAS LISTAS PARA TENER CON QUÉ OPERAR
		
		GestorAlumnos gestorAlu = new GestorAlumnos();
		//Creamos nuevos objetos de tipo Alumno
		Alumno a1 = new Alumno("Ana", 32, "2do Batch");
		Alumno a2 = new Alumno("Pepe", 41, "1ro Batch");
		Alumno a3 = new Alumno("Dawid", 30, "3ro Batch");
		//Añadimos a los alumnos a la lista
		gestorAlu.anadirAlumno(a1);
		gestorAlu.anadirAlumno(a2);
		gestorAlu.anadirAlumno(a3);
		
		GestorProfesores gestorProf = new GestorProfesores();
		//Creamos nuevos objetos de tipo Profesor
		Profesor p1 = new Profesor("Juana", 51, "Aula 3");
		Profesor p2 = new Profesor("Antonio", 36, "Aula 1");
		Profesor p3 = new Profesor("Lola", 59, "Aula 6");
		
		//Añadimos a los Profesores a la lista
		gestorProf.anadirProfesor(p1);
		gestorProf.anadirProfesor(p2);
		gestorProf.anadirProfesor(p3);


		
		int miOpcion;

		do {
		    miOpcion = Entrada.enteroRango(
		            "\n¿Con qué lista deseas operar? "
		            + "\n1. Lista Profesores "
		            + "\n2. Lista Alumnos "
		            + "\n0. Salir ",
		            0, 2);

		    switch (miOpcion) {
		        case 1 -> menuProfesores(gestorProf);
		        case 2 -> menuAlumnos(gestorAlu);
		    }

		} while (miOpcion != 0);
	
		
	
		
		
		
		
//		GestorAlumnos gestor = new GestorAlumnos();
//		Alumno a1 = new Alumno("Ana", 32, "2do Batch");
//		Alumno a2 = new Alumno("Pepe", 41, "1ro Batch");
//		Alumno a3 = new Alumno("Dawid", 30, "3ro Batch");
//
//		//Añadimos a los alumnos a la lista
//		gestor.anadirAlumno(a1);
//		gestor.anadirAlumno(a2);
//		gestor.anadirAlumno(a3);
//		System.out.println(""
//				+ ""
//				+ ""
//				+ "");
//
//		//Mostrar alumnos
//		gestor.mostrarTodos();
//		System.out.println(""
//				+ ""
//				+ ""
//				+ "");
//
//		//Editamos alumnos
//		gestor.modificarAlumno("Pepe", "Manolo", 31, "1º ESO");
//		gestor.modificarAlumno("Aguacate", "Pepín", 25, "2º ESO");
//		System.out.println(""
//				+ ""
//				+ ""
//				+ "");
//		
//		//Mostrar alumnos
//		gestor.mostrarTodos();
//		System.out.println(""
//				+ ""
//				+ ""
//				+ "");
//		
//		//Eliminar alumnos
//		gestor.eliminarAlumno("Ana");
//		gestor.eliminarAlumno("Aguacate");
//		System.out.println(""
//				+ ""
//				+ ""
//				+ "");

	} //Fin main

	

public static void menuProfesores(GestorProfesores gestorProf) {
	int miOpcion;
	do {
			miOpcion = Entrada.enteroRango("\n === LISTA PROFESORES === "
					+ "\n¿Qué deseas hacer? "
					+ "\n1. Mostrar todos los Profesores "
					+ "\n2. Añadir un profesor "
					+ "\n3. Editar un profesor "
					+ "\n4. Eliminar un profesor "
					+ "\n0. Volver atrás "
					+ "", 0, 4);
			
			
		    switch (miOpcion) {
		        case 1 -> {
		        	gestorProf.mostrarTodosProfes();
		        	}	
		        case 2 -> {
		    		Profesor p4 = new Profesor("Ramón", 365, "Aula 615");
		        gestorProf.anadirProfesor(p4);
		        	}
		        case 3 -> {
		        	gestorProf.modificarProfesor("Juana", "Juanita", 45, "Aula t61");
		        }
		        case 4 -> {
		        	gestorProf.eliminarProfesor("Ramón");
		        }
		    }
    } while (miOpcion != 0);
}


public static void menuAlumnos(GestorAlumnos gestorAlu) {
	int miOpcion;
	do {
				miOpcion = Entrada.enteroRango("\n === LISTA ALUMNOS === "
						+ "\n¿Qué deseas hacer? "
						+ "\n1. Mostrar todos los Alumnos "
						+ "\n2. Añadir un alumno "
						+ "\n3. Editar un alumno "
						+ "\n4. Eliminar un alumno "
						+ "\n0. Volver atrás "
						+ "", 0, 4);
				
				
			    switch (miOpcion) {
			        case 1 -> {
			        	gestorAlu.mostrarTodosAlumnos();
			        	}	
			        case 2 -> {
			    		Alumno a4 = new Alumno("César", 46, "3ºESO");
			        gestorAlu.anadirAlumno(a4);
			        	}
			        case 3 -> {
			        	gestorAlu.modificarAlumno("Pepe", "Pepín", 23, "2ºESO");
			        }
			        case 4 -> {
			        	gestorAlu.eliminarAlumno("César");
			        }
			    }
   } while (miOpcion != 0);
}



} //Fin class