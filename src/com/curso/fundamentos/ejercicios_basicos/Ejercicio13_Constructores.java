package com.curso.fundamentos.ejercicios_basicos;

class Moto {
	String marca;
	String modelo;
	
	
	//CONSTRUCTOR
	public Moto (String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
}


public class Ejercicio13_Constructores {

	public static void main(String[] args) {
		Moto miMotillo = new Moto("Yamaha", "Special");
		System.out.println(miMotillo.marca + "  " + miMotillo.modelo);
	}
	
}
