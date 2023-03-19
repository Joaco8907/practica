
package Guia_3_estructuras_de_control;

import java.util.Scanner;
public class Ejercicio_cuatro {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese una frase: ");
        String frase = entrada.nextLine();
        
        if ((frase.substring(0, 1)).equalsIgnoreCase("a")){
        
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
    
}
