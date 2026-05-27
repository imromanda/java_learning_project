package com.curso.fundamentos.ejercicios_basicos;
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
			System.out.println("Ingreso realizado. Tu saldo ahora es de: " + saldo + "€");
		} else System.out.println("La cantidad debe ser positiva");
	}//Fin ingresar
	
	public void retirar(double cantidad) {
		if (cantidad < 0) {
			System.out.println("La cantidad debe ser positiva");
		} else {
			if (cantidad > saldo) {
				System.out.println("No tienes suficiente saldo, prueba otra vez");
			} else saldo -= cantidad;
			System.out.println("Retirada realizada. Tu saldo ahora es de: " + saldo + "€");
		  }
		
		
	}//Fin ingresar
	
	
}//FIN clase CuentaBancaria



public class Encapsulacion {
	
	
	public static void main(String[] args) {
		
		CuentaBancaria miCuenta = new CuentaBancaria("Ana", 1249581.13);
		System.out.println(miMotillo.marca + "  " + miMotillo.modelo);

		
		
	} //Fin del main
	

}//FIN DEL FIN
