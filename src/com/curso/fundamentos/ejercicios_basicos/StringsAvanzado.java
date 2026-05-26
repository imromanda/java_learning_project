package com.curso.fundamentos.ejercicios_basicos;
import com.curso.fundamentos.utils.Entrada;

public class StringsAvanzado {
	
	/*INSTRUCCIONES
	 * 1. Pedir al usuario que ingrese una frase completa
	 * 2. Calcular la longitud total del texto
	 * 3. Dividir el texto en palabras completas y contarlas
	 * 4. Mostrar toda la frase en mayúsculas
	 * 5. Mostrar toda la frase en minúsculas
	 * 6. Invertir la frase
	 *  
	 */
		
	public static void main(String[] args) {
		
		String frase = Entrada.texto("Escribe una frase cualquiera: ");
		
		int numCaracteres = frase.length(); 
		//.length() Devuelve el número de letras de un string 
		System.out.println("Número de caracteres: " + numCaracteres);
		
		
		//JUNTAR .TRIM Y .SPLIT
				String[] palabras = frase.trim().split(" ");
				int nroPalabras = palabras.length;
				System.out.println("Palabras dentro de la frase: " + nroPalabras);
		
				
		
		
		
		//POR SEPARADO
				String[] separador = frase.split(" ");
				int nroPalabrasSeparador = separador.length;
				//.split crea un array con los elementos que obtiene usando el separador
				System.out.println("Palabras dentro de la frase: " + nroPalabrasSeparador);
				
				
				String recorte = frase.trim();
				//.trim elimina los espacios antes y después del texto
				System.out.println("Frase sin espacios al principio y al final: " + recorte);
				
		
		//StringBuilder -> Constructor de textos rápido y modificable 
				
				//PASO A PASO
						StringBuilder invertidoAux = new StringBuilder(frase);
						invertidoAux.reverse();
						String invertido = invertidoAux.toString();
						System.out.println("Satán ha hablado: " + invertido);
		
						
				//ACUMULATIVO EN UNA SOLA LÍNEA
						String inversion = new StringBuilder(frase).reverse().toString();
						System.out.println("Satán ha hablado: " + inversion);
		
						
						System.out.println("Satán ha GRITADO: " + inversion.toUpperCase());
						System.out.println("Satán ha susurrado: " + inversion.toLowerCase());
						
			/*OTROS MÉTODOS DE STINGBUILDER
			 * añadir texto        -> .append("texto") añade texto al final
			 * insertar texto      -> .insert(pos-inic, "texto a insertar")
			 * borrar texto        -> .delete(pos-inic, pos-final-1)
			 * reemplazar texto    -> .replace(pos-inic, pos-final-1, "texto")
			 * 
			 * invertir texto      -> .reverse()
			 * convertir a string  -> .toString()
			 */
									
		
						
	frase = "Esto es una frase de prueba para testear métodos StringBuilder";
	StringBuilder auxFrase = new StringBuilder(frase);
	
	
	System.out.println("Pepe dice: " + auxFrase.toString().toUpperCase());
	System.out.println("Pepe dice: " + auxFrase.append(" en JAVA"));
	System.out.println("Pepe dice: " + auxFrase.insert(12, "aseffesajijji Java "));	
	System.out.println("Pepe dice: " + auxFrase.delete(13, 14));
	System.out.println("Pepe dice: " + auxFrase.replace(13, 14, "asñdlfjasdñlfjk"));

	

	
						
		
	} //Fin del main
		
	
	
} //Fin del StringsAvanzado
