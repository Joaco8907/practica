/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package Guia_4_Funciones_y_Subprocesos_practica;

import java.util.Scanner;
public class Ejercicio_uno_practica {

    /**
     scanner 2 numeros

swich opciones:
	caso 1:
		.........
		sout 

public static int ( )
	resultado
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros para realizar op: ");
        int num_uno = entrada.nextInt();
        int num_dos = entrada.nextInt();
        
        System.out.println("Menu");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("Elija una opcion: ");
        int opcion = entrada.nextInt();
        
        opciones(opcion,num_uno,num_dos);
        
        
    }
    public static int suma(int a, int b){
        int c = a+b;
        return c;
    }
    public static int resta(int a, int b){
        int c = a-b;
        return c;
    }
    public static int multi(int a, int b){
        int c = a*b;
        return c;
    }
    public static int divis(int a, int b){
        double c = (a/b);
        return (int) c;
              
    }
    public static void opciones(int opcion,int a,int b){
        
        
        switch (opcion) {
            
            case 1:
                System.out.println(suma(a,b)); 
                break;
            
            case 2:
                System.out.println(resta(a,b));
                break;
               
            case 3:
                 System.out.println(multi(a,b));
                break;
            
            case 4:
                System.out.println(divis(a,b));
                break;
            default:
                System.out.println("La opcion ingresada no corresponde al menu");
        }
    
    }
    
}
