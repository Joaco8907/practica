
package Guia_3_estructuras_de_control;

import java.util.Scanner;

public class Ejercicio_seis {

        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num_uno=0, num_dos=0;
        float resultado=0;
        String confirm="n";
        
        System.out.println("Ingrese 2 numeros para operarlos: ");
        num_uno= entrada.nextInt();
        num_dos= entrada.nextInt();
        
        
        System.out.println("Menu: ");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir ");
        System.out.println("5. Salir ");
        int menu = entrada.nextInt();
        
        
        
        do{
            
            if (menu==1){
                resultado=num_uno+num_dos;
            }
            
            if (menu==2){
                resultado=num_uno-num_dos;
            }
            
            if (menu==3){
                resultado=num_uno*num_dos;
            }
            
            if (menu==4){
                resultado=num_uno / num_dos;
            }
            
            if (menu==5){
                confirm="s";
            }
            
        }while (confirm.equalsIgnoreCase("s") && resultado !=0);
        
        
        System.out.println("El resultado de la operacion es: " + resultado);
        
    }
    
}
