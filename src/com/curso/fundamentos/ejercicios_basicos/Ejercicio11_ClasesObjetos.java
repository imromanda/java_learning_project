package com.curso.fundamentos.ejercicios_basicos;

//Esta es la estructura:
class Coche {
	String marca;
	String modelo;
}


public class Ejercicio11_ClasesObjetos {

		public static void ejecutar() {
			//Para crear un objeto de una clase tengo instanciar
			//(Crear un nuevo objeto)
			
			//Coche es el tipo 
			//coco es el nombre que le voy a dar al objeto
			// new Coche(); es un nuevo objeto de la clase Coche
			Coche coco = new Coche();
				coco.marca="Seat";
				coco.modelo="Ibiza";
			
			
			//Coche es el tipo 
			//descapotable es el nombre que le voy a dar al objeto
			// new Coche(); es un nuevo objeto de la clase Coche
			Coche descapotable = new Coche();
				descapotable.marca="Porsche";
				descapotable.modelo="500";
			
			
System.out.println("Mi " + coco.marca + " es del modelo " + coco.modelo);
System.out.println("Mi " + descapotable.marca + " es del modelo " + descapotable.modelo);

		}
		
		public static void main (String[] args) {
			ejecutar();
		}
	
}

