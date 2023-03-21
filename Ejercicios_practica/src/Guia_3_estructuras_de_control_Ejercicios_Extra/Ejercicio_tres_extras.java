
package Guia_3_estructuras_de_control_Ejercicios_Extra;

import java.util.Scanner;
public class Ejercicio_tres_extras {

    /**
     Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
     * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese una letra: ");
        String letra = entrada.nextLine();
        
        if (letra.equalsIgnoreCase("a")){
        }else if (letra.equalsIgnoreCase("e")){
            System.out.println("La letra " + letra + " Es una vocal");
        }else if (letra.equalsIgnoreCase("i")){
            System.out.println("La letra " + letra + " Es una vocal");
        }else if (letra.equalsIgnoreCase("o")){
            System.out.println("La letra " + letra + " Es una vocal");
        }else if (letra.equalsIgnoreCase("u")){
            System.out.println("La letra " + letra + " Es una vocal");
        }else{
            System.out.println("La letra "+ letra + " es una consonante");
        }
        
    }
    
}
