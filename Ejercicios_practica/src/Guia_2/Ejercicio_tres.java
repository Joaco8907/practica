
package Guia_2;

import java.util.Scanner;
public class Ejercicio_tres {

    /**
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase= entrada.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}