/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
}validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, 
sino informe que no lo son.
 */
package Guia_4_Funciones_y_Subprocesos_teoria;

import java.util.Scanner;
public class Ejercicio_guia4_teoria_segundo_ejercicio {

    /**
     importar Scanner para ingresar 2 numeros
     * definir si el primer numero es multiplo del segundo.
     * imprimir por pantalla respuesta
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros: ");
        int num_uno = entrada.nextInt();
        int num_dos = entrada.nextInt();
        EsMultiplo(num_uno,num_dos);
        
    }
    
    public static void EsMultiplo(int num_uno,int num_dos){
        
        if (num_dos % num_uno ==0){
            System.out.println(num_uno + " Es multiplo de " +num_dos);
        }else{
            System.out.println(num_uno + " No es multiplo de " + num_dos);
        }
            
    }
    
    
}
