/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).

El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Guia_4_Funciones_y_Subprocesos_practica;

import java.util.Scanner;

/**
 *
 * @author Afsca
 */
public class Ejercicio_tres_practica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para realizar op: ");
        double num_uno = entrada.nextInt();
        
        
        
        System.out.println("Menu");
        System.out.println("1-libra");
        System.out.println("2-pesos");
        System.out.println("3-yenes");
        System.out.println("¿A que moneda deseas convertir? ");
        int opcion = entrada.nextInt();
        
        opciones(opcion, num_uno);
        
        
    }
    public static double libra(double a){
        double c = a*0.86;
        return c;
    }
    public static double peso(double a){
        double c = a*1.28611;
        return c;
    }
    public static double yuan(double a){
        double c = a*129.852;
        return c;
    }
 
              
    public static void opciones(int opcion,double a){
        
        
        switch (opcion) {
            
            case 1:
                System.out.println("La cantidad de euros ingresados equivalen a " +libra(a)+ " Libras"); 
                break;
            
            case 2:
                System.out.println("La cantidad de euros ingresados equivalen a " +peso(a)+ " Pesos");
                break;
               
            case 3:
                 System.out.println("La cantidad de euros ingresados equivalen a " +yuan(a) + " Yuanes");
                break;
            
            default:
                System.out.println("La opcion ingresada no corresponde al menu");
        }
    }
        
}    
