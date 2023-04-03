
package Guia_5_vectores_ejercicios_extra;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio_extra_cinco_practica {

    /**
     * Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Random aleatorio = new Random();
        
        System.out.print("Ingrese la cantidad de filas: ");
        int n = entrada.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int m = entrada.nextInt();
        
        int [][] matriz = new int [n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                
                matriz [i][j]=aleatorio.nextInt(0,10);
            }
        }
        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.print("["+columna+"]" + " ");   // Imprime columna por columna sobre la primera fila
            }
            System.out.println(""); // Salto de linea       
        }
        
    }
    
}
