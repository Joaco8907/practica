
package Guia_2;

import java.util.Scanner;


public class Ejercicio_dos {
    
    // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Dame tu nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);
        
    }
    
}
