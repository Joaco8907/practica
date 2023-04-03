
package Guia_5_vectores_ejercicios_extra;

import java.util.Scanner;

public class Ejercicio_extra_seis_practica {

    /**
     * 
     */
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Leer las 5 palabras del usuario
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la palabra " + (i+1) + ": ");
            palabras[i] = input.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("La palabra debe tener entre 3 y 5 caracteres. Ingrese nuevamente: ");
                palabras[i] = input.nextLine();
            }
        }
        
        // Crear la matriz de la sopa de letras
        char[][] sopaDeLetras = new char[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopaDeLetras[i][j] = (char) (Math.random() * 10 + '0');
            }
        }
        
        // Seleccionar una fila aleatoria para ubicar las palabras
        int fila = (int) (Math.random() * 20);
        int columna = 0;
        
        // Ubicar las palabras en la fila seleccionada
        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length(); i++) {
                sopaDeLetras[fila][columna] = palabra.charAt(i);
                columna++;
            }
            columna++; // Agregar un espacio entre palabras
        }
        
        // Imprimir la sopa de letras
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println();
        }
    }
}