package Guia_3_estructuras_de_control;

import java.util.Scanner;
public class Ejercicio_cinco {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un valor para determinar un limite: ");
        int lim=entrada.nextInt();
        int num=0;
        
        while(num<=lim){
            System.out.println("Ingrese un numero hasta superar el limite determinado: ");
            num+=entrada.nextInt();
        }
        
        System.out.println("Has superado el limite establecido");
    }
    
}
