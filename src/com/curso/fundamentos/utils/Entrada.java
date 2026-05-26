package com.curso.fundamentos.utils;

import java.util.Scanner;

public class Entrada {

	//Instanciamos sc de la clase Scanner
	//private -> nivel de acceso privado. Solo lo ve la misma clase.
	//static -> Variable única y compartida por toda slas instancias.
	//final -> No se puede modificar. La variable solo se puede asignar una vez.
	
    private static final Scanner sc = new Scanner(System.in);

    public static String texto(String msg) {
    	//Creamos una variable auxiliar
    	String input;
    	do {
    			//Printamos el mensaje recibido
            System.out.print(msg);
            //Solicitamos el ingreso por teclado
            input = sc.nextLine().trim();
            
            //Comprobamos si lo recibido está vacío
            if (input.isEmpty()) {
            		System.out.println("Error. El texto no puede estar vacío");
            		
            } 
            
    	} while (input.isEmpty());
          return input;
    }

    public static int entero(String msg) {
    	//Versión sin validación
    		//Printamos el mensaje recibido
    			//System.out.print(msg); 
        //Solicitamos el ingreso por teclado
    			//return Integer.parseInt(sc.nextLine());
    	
    	//Versión con validación
    		while(true) {
    			
    			//Printamos el mensaje
    			System.out.print(msg);
    			
    			//Capturo por teclado sea cual sea el dato
    			String input = sc.nextLine();
    			
    			//Intenta    			
    			try {
    				
    				//Devuelve el input parseado a entero
    				return Integer.parseInt(input);
    				
    				//Si hay error, y el número "e" no tiene el formato correcto...
    			} catch (NumberFormatException e) {
    				
    				//Printa el siguiente mensaje de error
    				System.out.println("Error: debes introducir un número entero");
    			}
    		}
    }
    
    
    public static int enteroRango(String msg, int min, int max) {
    	int valor;
    	do {
    		valor = entero(msg);
    		if (valor < min || valor > max)
    			System.out.println("Error. "
    					+ "Valor fuera de rango"
    					+ " (" + min + " - " + max + ")");
    	} while (valor < min || valor > max);
    	
    	return valor;
    }
    
    
    public static double doble(String msg) {
    	
    	//Versión con validación
    		while(true) {
    			
    			//Printamos el mensaje
    			System.out.print(msg);
    			
    			//Capturo por teclado sea cual sea el dato
    			String input = sc.nextLine();
    			
    			//Intenta    			
    			try {
    				
    				//Devuelve el input parseado a entero
    				return Double.parseDouble(input);
    				
    				//Si hay error, y el número "e" no tiene el formato correcto...
    			} catch (NumberFormatException e) {
    				
    				//Printa el siguiente mensaje de error
    				System.out.println("Error: debes introducir un número entero");
    			}
    		}
    }
    
    
    
    
    
    
    
    
}
