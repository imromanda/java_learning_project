package com.curso.fundamentos.ejercicios_basicos;


import java.util.ArrayList;
import com.curso.fundamentos.utils.Entrada;

public class EjercicioArrayList {
	
	int miOpcion;
	ArrayList<Integer> numeros = new ArrayList<Integer> ();

	/* 1. Crear un array dinámico vacío.
	 * 2. Crear un menu para añadir, borrar, modificar y mostrar
	 * 		un análisis (media y mayor)
	 * 3. Crear los métodos que realicen las anteriores acciones.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		int miOpcion;
		ArrayList<Integer> numeros = new ArrayList<Integer> ();
		boolean salir = false;
		
		while (!salir) {

			System.out.println(" \n ============= LISTA DINÁMICA DE NÚMEROS =============\r\n"
					+ "	 * 1. Añadir número.\r\n"
					+ "	 * 2. Modificar número.\r\n"
					+ "	 * 3. Borrar número.\r\n"
					+ "	 * 4. Mostrar análisis (media y valor).\r\n"
					+ "	 * 0. Salir");		
			System.out.println("    ");
			miOpcion = Entrada.enteroRango("Escribe el número para elegir opción: ", 0, 4);

			//con Switch elegimos qué método aplicar para cada opción
			
			switch(miOpcion) {
			case 1 -> nuevoNro(numeros);
			case 2 -> nroModificado(numeros);
			case 3 -> borrarNro(numeros);
			case 4 -> analisisArray(numeros);
			case 0 -> salir = true;
			
			//default -> System.out.println("Inténtalo otra vez"); 
			//Al usar el enteroRango el default ya no es necesario
					
			}//Final del switch	
		} //final del while		
	} //final del main
	

	
	public static void nuevoNro(ArrayList<Integer> numeros)  {
		
		int nuevo = Entrada.entero("\nNúmero a añadir: ");
		numeros.add(nuevo); 
		pintaDato("\nNúmero añadido: ", nuevo);
		pintaArray("\nArray Actual: ", numeros);
		System.out.println("    ");
		System.out.println("    ");

		} //Fin de 1. Añadir número
	

	
	public static void nroModificado(ArrayList numeros)  {
		System.out.println("    ");

		pintaArray("\nArray Actual: ", numeros);
		
		int indAModif = Entrada.enteroRango("\nÍndice del esaf número a "
				+ "modificar: (0 - " + (numeros.size()-1) + ")", 0 , numeros.size()-1);
		
		System.out.println(numeros.get(indAModif));
		
		int valorModif = Entrada.entero("\nNuevo valor: ");
		numeros.set(indAModif, valorModif);
		pintaDato("\nÍndice modificado: ", indAModif);
		pintaDato("\nNúmero modificado: ", valorModif);
		pintaArray("\nArray Actual: ", numeros);
		System.out.println("    ");

	} //Fin de 2. Modificar número
	
	
		public static void borrarNro(ArrayList<Integer> numeros)  {
			System.out.println("    ");
	
			
			int indABorrar = Entrada.enteroRango("\nÍndice del número a borrar: (0 - " + (numeros.size()-1) + ")", 0 , numeros.size()-1);
			int nroABorrar = numeros.get(indABorrar);
			
			System.out.println(String.format("\nNúmero borrado: %s de índice %d ", nroABorrar, indABorrar));
	
			numeros.remove(indABorrar);
			
			pintaArray("Array Actual: ", numeros);
			System.out.println("    ");

		} //Fin de 3. Borrar número
	
	
	public static void analisisArray(ArrayList<Integer> numeros) {
		
		int suma = 0; 
		double media = (double) 0;
		
		int nroMayor = numeros.get(0);
		int nroMenor = numeros.get(0);
		
		for (int numero:numeros) {
			suma +=numero;
			
			System.out.println("Paso a paso " + suma);
			
			
			if (numero > nroMayor) {
				nroMayor = numero;
			}
			
			
			if (numero < nroMenor) {
				nroMenor = numero;
			}
		
		}//Fin del for
		
	System.out.println("La suma total es " + suma);
	System.out.println("La cantidad de números en el array es: " + numeros.size());

		media = (double) suma/numeros.size();
		System.out.println("La media es " + media);
		System.out.println("El número mayor es " + nroMayor);
		System.out.println("El número menor es " + nroMenor);
		
	} //Fin de 4. Mostrar análisis

	

	/////////////////////UTILS/////////////////////////////
	
	
	public static void pintaDato(String etiqueta, int dato) {

		System.out.println(etiqueta + dato);		

	}


	public static void pintaArray(String etiqueta, ArrayList<Integer> lista) {
		System.out.println("    ");

		System.out.print(etiqueta + " {");		
		for (int i = 0; i < lista.size(); i++) {
			int item = (int) lista.get(i);
			
			//si es el último ítem... 
			if (i == lista.size()-1) { 
				System.out.print(item + "}");
				
			} //Si NO es el último ítem...
				else System.out.print(item + ", ");

		}
	}
	
}
