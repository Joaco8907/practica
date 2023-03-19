
package Guia_3_estructuras_de_control;

import java.util.Scanner;
public class Ejercicio_tres {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, intruduzca una frase de 8 letras");
        String frase = entrada.nextLine();
        
        if (frase.length()==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
