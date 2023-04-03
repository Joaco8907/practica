package Guia_5_vectores_ejercicios_extra;

import java.util.Scanner;

public class Ejercicios_extra_dos_practica {

    /**
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales
     * (la comparación deberá detenerse en cuanto se detecte alguna diferencia
     * entre los elementos).
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la dimension deseada para los vectores: ");
        int n = entrada.nextInt();
        int[] vector_uno = new int[n];
        int[] vector_dos = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese un numero para alojar en la posicion " + (i + 1) + " del primer vector");
            vector_uno[i] = entrada.nextInt();
            System.out.println("Ingrese un numero para alojar en la posicion " + (i + 1) + " del segundo vector");
            vector_dos[i] = entrada.nextInt();

        }
        boolean igualdad = false;
        
        for (int i = 0; i < n; i++) {
            if (vector_uno[i] != vector_dos[i]) {
                igualdad = false;
                break;
            } else {
                igualdad = true;
            }

        }
        
        if (igualdad == true) {
            System.out.println("El primer vector es igual al segundo vector ");
        } else {
            System.out.println("El primer vector no es igual al segundo vector ");
        }
    }

}
