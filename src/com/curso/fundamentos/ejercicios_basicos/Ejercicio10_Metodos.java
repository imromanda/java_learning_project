package com.curso.fundamentos.ejercicios_basicos;

import com.curso.fundamentos.utils.Entrada;

public class Ejercicio10_Metodos {
	
	public static void ejecutar() {
		comidaFavorita();	
		bebidaFavorita();
		
		String miAficion = Entrada.texto("Escribe tu afición: ");
		aficionFavorita(miAficion);
		
		String miJuego = juegoFavorito();
		System.out.println(miJuego);
		
	}
	
	//Métodos sin argumentos
	public static void comidaFavorita() {
		System.out.println("Mi comida favorita es la paella");
	}
	
	public static void bebidaFavorita() {
		System.out.println("Mi bebida favorita es el zumo de naranja");
	}
	//Método con argumentos
	public static void aficionFavorita(String aficionRecibida) {
		System.out.println("Mi afición favorita es " + aficionRecibida);
	}

	public static String juegoFavorito() {
		return "Mi juego favorito son los bolos";
	}
	
	public static void main(String[] args) {
		ejecutar();
	}
	
}
