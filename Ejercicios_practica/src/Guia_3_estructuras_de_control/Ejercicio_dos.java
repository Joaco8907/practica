
package Guia_3_estructuras_de_control;

import java.util.Scanner;

public class Ejercicio_dos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = entrada.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
