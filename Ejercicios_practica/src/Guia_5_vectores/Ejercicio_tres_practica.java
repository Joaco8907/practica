
package Guia_5_vectores;

import java.util.Scanner;

public class Ejercicio_tres_practica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamaño al vector");
        int n = leer.nextInt();
        String vector[] = new String[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero de hasta 5 digitos");
            vector[i] = leer.next();

        }

        for (String numero : vector) {
            System.out.println(numero);

        }
        for (int i = 0; i < vector.length; i++) {

            if (vector[i].length() == 1) {
                System.out.println("El elemento de la posicion " + i + " tiene 1 digito");
            }
            if (vector[i].length() == 2) {
                System.out.println("El elemento de la posicion " + i + " tiene 2 digito");
            }
            if (vector[i].length() == 3) {
                System.out.println("El elemento de la posicion " + i + " tiene 3 digito");
            }
            if (vector[i].length() == 4) {
                System.out.println("El elemento de la posicion " + i + " tiene 4 digito");
            }
            if (vector[i].length() == 5) {
                System.out.println("El elemento de la posicion " + i + " tiene 5 digito");
            }
        }
    }
}