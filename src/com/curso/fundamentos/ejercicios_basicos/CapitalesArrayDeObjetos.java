package com.curso.fundamentos.ejercicios_basicos;

public class CapitalesArrayDeObjetos {
	//Clase "Pais" que contiene nombre del país y la capital correspondiente
	public static class Pais {
		private String nombre;
		private String capital;
		
				//CONSTRUCTOR
		public Pais (String nombre, String capital) {
			this.nombre = nombre;
			this.capital = capital;
		}
		
		//GETTERS & SETTERS
		//Encapsulación: Evitamos acceso directo (Nos permitirá validar antes)
		//Get: Leer  y Set: Escribir	
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getCapital() {
			return capital;
		}
		public void setCapital(String capital) {
			this.capital = capital;
		}
		
	}
	
	public static void main(String[] args) {
		
		Pais[] paises = {
				new Pais("España" , "Madrid"),
				new Pais("Francia" , "Paris"),
				new Pais("Italia" , "Roma"),
				new Pais("Inglaterra" , "Londres"),
				new Pais("Alemania" , "Berlin"),
				new Pais("Portugal" , "Lisboa")
				};
		
		System.out.println("====== LISTA DE PAÍSES Y CAPITALES ======");
			for (int i = 0; i < paises.length; i++) {
				System.out.println(
						(i + 1) + ". " + paises[i].getNombre() + 
						" -> " + paises[i].getCapital());
			}
	}
}
