
package Guia_3_estructuras_de_control_Ejercicios_Extra;

import java.util.Scanner;
public class Ejercicio_cuatro_extras {
    // Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
    public static void main(String[]args) {
       Scanner entrada = new Scanner (System.in);
       
        System.out.println("Ingrese un numero: ");
       int opcion = entrada.nextInt();
       
        switch (opcion) {
            case 1:
                System.out.println("El numero ingresado se escribe (I) en numeros Romanos");
                break;
            case 2:
                System.out.println("El numero ingresado se escribe (II) en numeros Romanos");
                break;
            case 3:
                System.out.println("El numero ingresado se escribe (III) en numeros Romanos");
                break;
            case 4:
                System.out.println("El numero ingresado se escribe (IV) en numeros Romanos");
                break;
            case 5:
                System.out.println("El numero ingresado se escribe (V) en numeros Romanos");
                break;
            case 6:
                System.out.println("El numero ingresado se escribe (VI)- en numeros Romanos");
                break;
            case 7:
                System.out.println("El numero ingresado se escribe (VII) en numeros Romanos");
                break;
            case 8:
                System.out.println("El numero ingresado se escribe (VIII) en numeros Romanos");
                break;
            case 9:
                System.out.println("El numero ingresado se escribe (IX) en numeros Romanos");
                break;
            case 10:
                System.out.println("El numero ingresado se escribe (X) en numeros Romanos");
                break;                   
            default:
                System.out.println("El numero ingresado no se encuentra en el rango solicitado");
        }
       
    }   
}
