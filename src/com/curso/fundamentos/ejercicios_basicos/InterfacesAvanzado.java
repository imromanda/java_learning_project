package com.curso.fundamentos.ejercicios_basicos;

interface DatosPersonalesInterface {
	String getNombre();
	String getApellidos();
	String getDni();
	String getEstadoCivil();
		
	String getNivelEstudios();
	String getEspecialidadEstudios();

}

//Clase Estudios (objeto interno)

class Estudios {
	private String nivel;
	private String especialidad;
	
	
	public Estudios (String nivel, String especialidad) {
		this.nivel = nivel;
		this.especialidad = especialidad;
	}
			//GETTERS
			public String getNivel() {
			return nivel;
		}
			public String getEspecialidad() {
			return especialidad;
		}
			
			
}


//Clase DatosPersonales (implementa la interfaz)

class DatosPersonales implements DatosPersonalesInterface {
	
	//CAMPOS
	private String nombre;
	private String apellidos;
	private String dni;
	private String estadoCivil;
	private Estudios estudios; // DEVUELVE UN OBJETO DE CLASE ESTUDIOS
	
	//CONSTRUCTOR
	public DatosPersonales (String nombre, String apellidos, String dni, String estadoCivil, Estudios estudios) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.estadoCivil = estadoCivil;
		this.estudios = estudios;
	}
	
	//GETTERS
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String getApellidos() {
		return apellidos;
	}
	
	@Override
	public String getDni() {
		return dni;
	}
	
	@Override
	public String getEstadoCivil() {
		return estadoCivil;
	}
	

	@Override
	public String getNivelEstudios() {
		return estudios.getNivel();
	}
	
	@Override
	public String getEspecialidadEstudios() {
		return estudios.getEspecialidad();
	}


} //FIN class DatosPersonales implements DatosPersonalesInterface 



public class InterfacesAvanzado {
	public static void main(String[] args) {
		
		Estudios misEstudios = new Estudios("Grado Superior", "Informática y Diseño");
		
		DatosPersonalesInterface misDatos = new DatosPersonales("Ana", "Romero", "35546846864A", "Es complicado", misEstudios);
		
		System.out.println("\nNombre: " + misDatos.getNombre());
		System.out.println("\nApellidos: " + misDatos.getApellidos());
		System.out.println("\nDNI: " + misDatos.getDni());
		System.out.println("\nEstado Civil: " + misDatos.getEstadoCivil());
		System.out.println("\nNivel de Estudios: " + misDatos.getNivelEstudios());
		System.out.println("\nEspecialidad: " + misDatos.getEspecialidadEstudios());

	} // Fin Main

} // FIn InterfacesAvanzado
