/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
package Guia_2;

import java.util.Scanner;

public class Ejercicio_uno {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num_uno=0, num_dos=0;
        
        System.out.println("Ingrese un numero: ");
        num_uno = entrada.nextInt();
        
        System.out.println("Ingrese otro numero: ");
        num_dos = entrada.nextInt();
        
        
        int resultado = num_uno + num_dos;
        
        System.out.println("El resultado de la suma de los dos numeros es: " + resultado);
    }
   
    
}
