
package Guia_3_estructuras_de_control;

import java.util.Scanner;

public class Ejercicio_uno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();
        
        if (num % 2 == 0){
            System.out.println("El numero ingresado es PAR");
        }else{
            System.out.println("El numero ingresado es IMPAR");
        }
        
    }
    
}
