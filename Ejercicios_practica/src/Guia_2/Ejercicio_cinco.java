
package Guia_2;

import java.util.Scanner;

public class Ejercicio_cinco {

    /**
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
     * el triple y la raíz cuadrada de ese número. 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();
        
        
        System.out.println("El doble del numero ingresado es: " + num*2);
        System.out.println("El triple del numero ingresado es: " + num*3);
        
        double raiz = Math.sqrt(num);
        System.out.println("La raiz cuadrada del numero ingresado es: " + raiz);
         
    }
    
}
