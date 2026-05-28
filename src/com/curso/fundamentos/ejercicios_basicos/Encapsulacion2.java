package com.curso.fundamentos.ejercicios_basicos;

import java.util.ArrayList;

import com.curso.fundamentos.utils.Entrada;

/*
 * Ampliamos la gestión de cuentas, mantenimiendo la clase CuentaBancaria
 * del anterior ejercicio.
 * Un banco tiene múltiples cuentas. 
 * Por tanto tenemos que poder crear distintas cuentas, 
 * seleccionarlas y operar con ellas de forma independiente.
 * Crearemos dos menús:
 *   	- Menú principal: donde crear, seleccionar y mostrar las cuentas.
 *      - Menú operaciones: donde trabajar con la cuenta seleccionada.
 */



public class Encapsulacion2 {
	
	public static void limpiarConsola() {
		for (int i = 0; i < 1; i++) {
			System.out.println();
		}
	}//Fin limpiarConsola()
	
	//=================================================================================
	//MENÚ OPERACIONES 
	//=================================================================================

	
	public static void menuOperaciones(CuentaBancaria cuenta) {
		

		int miOpcion;
		
		do {
			System.out.println("\nTitular actual: " + cuenta.getTitular());
			miOpcion = Entrada.enteroRango("\n====OPERACIONES SOBRE CUENTA BANCARIA===="
							+ "\n 1. Consultar saldo"
							+ "\n 2. Ingresar saldo"
							+ "\n 3. Retirar saldo"
							+ "\n 4. Cambiar titular"
							+ "\n 0. Salir"
							+ "  "
							+ "  ", 0, 4);
			
			limpiarConsola();
			
			accionCuenta(miOpcion, cuenta); //Aquí envío a accionCuenta la opción elegida y la cuenta
		
		} while (miOpcion != 0 );
	
		
		
	}//Fin menuOperaciones
	
	public static void accionCuenta(int caso, CuentaBancaria c) {
		
		switch (caso) {
			case 1 -> {
				System.out.println("\nNombre del titular: " + c.getTitular() + " ");
				System.out.println("\nSaldo actual: " + c.getSaldo() + " ");
			} 
			case 2 -> {
				c.ingresar(Entrada.doble("\nCantidad a ingresar: "));
//				double cantIngreso = Entrada.doble("Cantidad a ingresar: ");
//				c.ingresar(cantIngreso);
			}
			case 3 -> {
				c.retirar(Entrada.doble("\nCantidad a retirar: "));
//				double cantRetirar = Entrada.doble("Cantidad a retirar: ");
//				c.retirar(cantRetirar);
			}
			case 4 -> {
				System.out.println("\nTitular actual: " + c.getTitular());
				c.setTitular(Entrada.texto("\nNuevo titular: "));
//				String nuevoTitular = Entrada.texto("Nuevo titular: ");
//				c.setTitular(nuevoTitular);
			}
			case 0 -> {
				System.out.println("\nSaliendo del programa. Gracias por jugar.");
			}

		} //Fin del switch
		
	
	} //Fin accionCuenta
	

	
	
	
	public static void main(String[] args) {
		//Lista de tipo CuentaBancaria donde guardaré las cuentas bancarias
		ArrayList<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria> ();
		
		//Variable de tipo CuentaBancaria donde guardaré la cuenta seleccionada
		CuentaBancaria cuentaActiva = null;
		
		//=================================================================================
		//MENÚ PRINCIPAL 
		//=================================================================================

		int miOpcion;
				
				do {
					miOpcion = Entrada.enteroRango("\n====MENÚ PRINCIPAL===="
									+ "\n 1. Crear nueva cuenta"
									+ "\n 2. Seleccionar cuenta"
									+ "\n 3. Listar cuentas"
									+ "\n 4. Eliminar cuenta"
									+ "\n 0. Salir"
									+ "  "
									+ "  ", 0, 4);
					
					limpiarConsola();
					
				
				} while (miOpcion != 0 );
		
		
		

		
		String miTitular = Entrada.texto("\nIntroduce el Titular de la cuenta: ");
		Double miSaldo = Entrada.doble("\nIntroduce el Saldo inicial de la cuenta: ");
		
		
		CuentaBancaria miCuenta = new CuentaBancaria(miTitular, miSaldo);
//		
//		System.out.println("\nNombre del titular: " + miCuenta.getTitular() + " ");
//		System.out.println("\nSaldo de la cuenta: " + miCuenta.getSaldo() + " ");
//		limpiarConsola();

		
		
		
	} //Fin del main
	
	
	
}//FIN DEL FIN

