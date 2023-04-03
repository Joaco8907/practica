
package Guia_5_vectores_ejercicios_extra;

import java.util.Scanner;
public class Ejercicios_extra_uno_practica {

    /**
     * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese la dimension deseada para su vector: ");
        int n= entrada.nextInt();
        
        int [] vector = new int[n];
        int suma_vector = 0;
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Ingrese un numero para la " +(i+1)+ " posicion: " );
            vector[i]=entrada.nextInt();
            suma_vector += vector[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
    
        System.out.println("La suma de todos los elementos del vector es = " + suma_vector);
    }
}
