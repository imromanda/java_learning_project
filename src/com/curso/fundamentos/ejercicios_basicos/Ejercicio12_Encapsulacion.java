package com.curso.fundamentos.ejercicios_basicos;

class CocheEncapsulado {

	//Al ser privadas no hay acceso	
		private String marca;
		private String modelo;

	//GETTERS & SETTERS
	//Encapsulación: Evitamos acceso directo (Nos permitirá validar antes)
	//Get: Leer  y Set: Escribir	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String m) {
		marca = m;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String m) {
		//Validación: si se envía vacío no se settea
		if (m == null || m.isEmpty() ) return;
		modelo = m;
	}
		
}

public class Ejercicio12_Encapsulacion {
	
	public static void main(String[] args) {
		
		CocheEncapsulado coco = new CocheEncapsulado();
			
			coco.setMarca("Toyota");
			coco.setModelo("Yaris");

			System.out.println(coco.getMarca());
			System.out.println(coco.getModelo());}
}




