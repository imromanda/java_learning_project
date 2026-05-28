package com.curso.fundamentos.ejercicios_basicos;

import com.curso.fundamentos.utils.Entrada;

/*
 * Crearemos una clase "Cuenta bancaria" con campos privados
 * - Titular de la cuenta (String)
 * - Número de cuenta (String)
 * - Saldo (double)
 * 
 * La clase incluirá:
 * - Un constructor para inicializar el titular y el saldo
 * - Métodos getter para ambos campos
 * - Métodos para ingresar y retirar Saldo
 * 			- Método depositar(double cantidad)
 * 			- Método retirar(double cantidad) 
 * 				-> Solo podrá retirar si hay suficiente saldo
 * 
 * 
 *Instrucciones:
 * 1. Crear la clase CuentaBancaria con atributos privados
 * 2. Implementar constructor getter
 * 3. Métodos depositar y retirar
 * 4. Pedir datos al usuario
 * 5. Realizar las operaciones pertinentes(con un menú)
 * 
 */

class CuentaBancaria {
	
	private String titular;
	private double saldo;
	
	
	//CONSTRUCTOR DE LA CLASE
	/*	El constructor de la clase nos permite rellenar los
	 *  campos con los argumentos que creamos a la hora
	 *  de crear o instanciar el nuevo objeto con el new
	 *  Serían los valores iniciales
	 *  CONSTRUCTORES PARA CONSTRUIR EL OBJETO 
	 *  CON UNOS VALORES INICIALES EN EL MOMENTO DE LA CREACIÓN
	 */
	
	public CuentaBancaria (String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	
	
	//GETTERS
	public String getTitular() {
		return titular;
	}
	

	
	public double getSaldo() {
		return saldo;
	}

	//SETTER
	public void setTitular(String nuevoTitular) {
		this.titular = nuevoTitular;
	}
	
	/*Creamos dos métodos independientes para ingresar y retirar
	 *Vamos a modificar el saldo positiva o negativamente
	 *
	 * 
	 */
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
			System.out.println("\nIngreso realizado. Tu saldo ahora es de: " + saldo + "€");
		} else System.out.println("\nLa cantidad debe ser positiva");
	}//Fin ingresar
	
	public void retirar(double cantidad) {
		if (cantidad < 0) {
			System.out.println("\nLa cantidad debe ser positiva");
		} else {
			if (cantidad > saldo) {
				System.out.println("\nNo tienes suficiente saldo, prueba otra vez");
			} else { saldo -= cantidad;
			System.out.println("\nRetirada realizada. Tu saldo ahora es de: " + saldo + "€");
			}
				
		  }
	}//Fin retirar
	
	
}//FIN clase CuentaBancaria



public class Encapsulacion {
	
	public static void limpiarConsola() {
		for (int i = 0; i < 1; i++) {
			System.out.println();
		}
	}
	
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
		String miTitular = Entrada.texto("\nIntroduce el Titular de la cuenta: ");
		Double miSaldo = Entrada.doble("\nIntroduce el Saldo inicial de la cuenta: ");
		
		
		CuentaBancaria miCuenta = new CuentaBancaria(miTitular, miSaldo);
//		
//		System.out.println("\nNombre del titular: " + miCuenta.getTitular() + " ");
//		System.out.println("\nSaldo de la cuenta: " + miCuenta.getSaldo() + " ");
//		limpiarConsola();

		
		int miOpcion;
		
		do {
			miOpcion = Entrada.enteroRango("\n====¿QUÉ DESEAS HACER?===="
							+ "\n 1. Consultar saldo"
							+ "\n 2. Ingresar saldo"
							+ "\n 3. Retirar saldo"
							+ "\n 4. Cambiar titular"
							+ "\n 0. Salir"
							+ "  "
							+ "  ", 0, 4);
			
			limpiarConsola();
			
			accionCuenta(miOpcion, miCuenta); //Aquí envío a accionCuenta la opción elegida y la cuenta
		
		} while (miOpcion != 0 );
	
		
		
	} //Fin del main
	
	
	
}//FIN DEL FIN
