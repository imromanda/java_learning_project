package com.curso.fundamentos.ejercicios_basicos;

import com.curso.fundamentos.utils.Entrada;

/*
 * Clase & estructura
 * Constructor
 * Getter & Setter
 * Métodos internos
 * 
 */

//CLASE Y ESTRUCTURA INTERNA
class Producto {
	private String nombre; //nombre del producto
	private double precio; //precio del producto
	
	//CONSTRUCTOR	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	

	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}

}//Fin de class Productos


public class ArrayObjetos {
	
	//Crearemos un array que contenga una serie 
	//de productos con su nombre y precio
	public static void main (String[] args) {
		int nroProductos = Entrada.enteroRango("¿Cuántos productos quieres registrar?(1 - 5)",1, 5);
		Producto[] listaProds = new Producto[nroProductos];
		System.out.println("\nTu lista de productos tiene: " + nroProductos + " productos");
		
		for (int i = 0; i < nroProductos; i++) {
			System.out.println("\n===PRODUCTO " + (i + 1) + "===");
			String nombre = Entrada.texto("\nNombre: ");
			double precio = Entrada.doble("Precio: ");
			listaProds[i] = new Producto (nombre, precio);
		}
		
		System.out.println("\n===PRODUCTOS===");
		double suma = 0;
		for (Producto item:listaProds) {
			System.out.println("\n- " + item.getNombre() + ": " + item.getPrecio() + "€");
			suma += item.getPrecio();

		}//Fin de for
		
		System.out.println("\nEl precio total es: " + suma);
		double media = suma/nroProductos;
		System.out.println("\nEl precio medio es: " + media);

		
	}//Fin main

}//Fin ArrayObjetos

