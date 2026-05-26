package com.curso.fundamentos.main;

import java.util.Scanner;
import com.curso.fundamentos.ejercicios_basicos.*;

public class Main {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ FUNDAMENTOS JAVA ===");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Estructura básica");
            System.out.println("3. Variables");
            System.out.println("4. Tipos de datos");
            System.out.println("5. Operadores");
            System.out.println("6. Scanner");
            System.out.println("7. Condicionales");
            System.out.println("8. Bucles");
            System.out.println("9. Arrays");
            System.out.println("10. Métodos");
            System.out.println("11. Clases y Objetos");
            System.out.println("12. Encapsulación");
            System.out.println("13. Constructores");
            System.out.println("14. Comentarios");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> Ejercicio01_HolaMundo.ejecutar();
                case 2 -> Ejercicio02_Estructura.ejecutar();
                case 3 -> Ejercicio03_Variables.ejecutar();
                case 4 -> Ejercicio04_Tipos.ejecutar();
                case 5 -> Ejercicio05_Operadores.ejecutar();
                case 6 -> Ejercicio06_Scanner.ejecutar();
                case 7 -> Ejercicio07_Condicionales.ejecutar();
                case 8 -> Ejercicio08_Bucles.ejecutar();
            }
            
        
        } while (opcion != 0);

        
        System.out.println("Fin del programa.");
    }

public static void main(String[] args) {
    	ejecutar();
    }
}
