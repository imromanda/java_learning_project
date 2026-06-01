package com.curso.fundamentos.ejercicios_basicos;

import com.curso.fundamentos.utils.Entrada;

/*
 * Creamos una clase base abstracta que se llamará "Empleado"
 * con los campos de clase:
 *  - Nombre del empleado (string)
 *  - Salario base (double)
 *  
 *  Constructor para inicializar los campos
 *  
 *  Un método "mostrarDatos()"
 *  Método abstracto "calcularSalarioFinal()"
 *  
 *  
 *  Dos clases hijas
 *  
 *  - EmpleadoTiempoCompleto -> Salario Final = Salario Base * 300 
 *  - EmpleadoPorHoras -> Salario Final = Salario Base  * (Horas trabajadas * 12)
 *  
 *  OBJETIVO: 
 *  1. Preguntar al usuario qué tipo de empleado queremos crear
 *  2. Pedir los datos necesarios.
 *  3. Crear el objeto correspondiente.
 *  4. Printar los datos
 *  5. Calcular Salario final
 *  
 * 
 */

abstract class Empleado {
	
	protected String nombre;
	protected double salarioBase;
	 
	
	//Constructor
	public Empleado (String nombre, double salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}

	
	//Método mostrarDatos()
	public void mostrarDatos() {
			System.out.println("\nNombre del empleado: " + nombre);	
			System.out.println("\nSalario Base del empleado: " + salarioBase);	
			}
	
	
	//Método abstracto calcularSalarioFinal();
	
	public abstract double calcularSalarioFinal(); //Fin calcularSalarioFinal
	
}
	
	


class EmpleadoTiempoCompleto extends Empleado {
	
	//Constructor
	public EmpleadoTiempoCompleto(String nombre, double salario) {
		super(nombre, salario); //llama al constructor de la clase padre donde están this.nombre = nombre;
//		this.nombre = nombre;													Estas no hacen falta porque ya están en el padre
//		this.salarioBase = salario;
	}
	
//	
//	public void mostrarDatos(String nombre, double salario) {
//	//	super (nombre, salario);									ESTE MÉTODO NO ES NECESARIO PORQUE YA LO IMLEMENTA LA CLASE PADRE
//	}
	
	@Override
	public double calcularSalarioFinal() {
		double salarioFinal;
		salarioFinal = salarioBase * 300;
		return salarioFinal;
		
		//SalarioBase por hora * 8 * 22
	}

} //FinEmpleadoTiempoCompleto



class EmpleadoPorHoras extends Empleado {
	private int horasTrabajadas;

	
	//Constructor
	public EmpleadoPorHoras(String nombre, double salario, int horasTrabajadas) {
		super(nombre, salario); //llama al constructor de la clase padre donde están this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
	}
	
//	public void mostrarDatos(String nombre, double salario) {
//	//	super (nombre, salario);
//	}
	
	@Override
	public double calcularSalarioFinal() {
		
		double salarioFinal;
		salarioFinal = salarioBase + (horasTrabajadas * 12);
		return salarioFinal;
	}

	
	 //  - EmpleadoPorHoras -> Salario Final = Salario Base  + (Horas trabajadas * 12)

} //FinEmpleadoPorHo
	


class EmpleadoFinSemana extends Empleado {
	private int tipoTurno;
	
	/*
	 * Turno de mañana = 5h
	 * turno de tarde = 4h
	 * Completo 8h
	 * 20€/hora
	 */
	
	
	//Constructor
	public EmpleadoFinSemana(String nombre, int tipoTurno) {
	    super(nombre, 0);
	    this.tipoTurno = tipoTurno;
	}

	@Override
	public double calcularSalarioFinal() {
		int precioHora = 20;
		double salarioFinal = 0;
		
		switch(tipoTurno) {
		case 1 -> salarioFinal = (precioHora*5)*8;
		case 2 -> salarioFinal = (precioHora*4)*8;	
		case 3 -> salarioFinal = (precioHora*8)*8;	
		}
		return salarioFinal;
	}

	

} //Fin EmpleadoFinSemana
	





public class SueldoEmpleado {
	
	public static void main(String[] args) {
		
	Empleado empleado = null; 
		
		int miOpcion;
		
		System.out.println(" ============= TIPO DE EMPLEADO A CREAR =============\r\n"
				+ "	 * 1. Empleado a tiempo completo\r\n"
				+ "	 * 2. Empleado por horas\r\n"
				+ "	 * 3. Empleado por de fin de semana\r\n");
		miOpcion = Entrada.enteroRango("\nEscribe el número para elegir opción: ", 1, 3);
		
		
		switch(miOpcion) {
		case 1 -> {
			String nombre = Entrada.texto("\nNombre del empleado a tiempo completo: ");
			double salarioBase = Entrada.doble("\nSalario base por hora (€): ");
			empleado = new EmpleadoTiempoCompleto(nombre, salarioBase);
		}
		case 2 -> {
			String nombre = Entrada.texto("\nNombre del empleado por horas: ");
			double salarioBase = Entrada.doble("\nSalario base por hora (€): ");
			int horasTrabajadas = Entrada.entero("\nHoras trabajadas totales (h): ");

			empleado = new EmpleadoPorHoras(nombre, salarioBase, horasTrabajadas);
		}
		case 3 -> {
			String nombre = Entrada.texto("\nNombre del empleado de fin de semana: ");
			int tipoTurno = Entrada.enteroRango("\nEn qué turno trabajará: "
					+ "	 * 1. Fin de semana de mañanas (5h)\r\n"
					+ "	 * 2. Fin de semana de tardes (4h)\r\n"
					+ "	 * 3. Fin de semana tiempo completo (8h)\r\n", 1, 3);

			empleado = new EmpleadoFinSemana(nombre, tipoTurno);
		}

		}//Fin switch
		
		
		System.out.println("\n === INFORMACIÓN DEL EMPLEADO ===");
		empleado.mostrarDatos();
		System.out.println("\nSalario final mensual: " + empleado.calcularSalarioFinal() );


//		System.out.println("\nNombre del empleado/a: " + 
//		empleado.nombre + "\nSalario Base: " + 
//				empleado.salarioBase + "\nSalario final: " + empleado.calcularSalarioFinal() );
//		
		
	}//Fin Main
	

}//Fin clase SueldoEmpleado
