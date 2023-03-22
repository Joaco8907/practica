/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo 
del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
*/
package Guia_3_estructuras_de_control_Ejercicios_Extra;

import java.util.Scanner;
public class Ejercicio_cinco_extras {
    /**
    * descripcion de que debe hacer el programa. 
    * 3 clase de socios.  

    A = -50%
    B = -35%
    C = -0%

    solicitar una letra y un valor (costo del tratamiento) 
    Imprimir el precio con descuento correspondiente ue pagara el socio.   
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la letra correspondiente a su tipo de socio: ");
        String tipo_socio= (entrada.nextLine()).toUpperCase();
        System.out.println("Ingrese el valor bruto del tratamiento: ");
        int valor_tratamiento = entrada.nextInt();
        
        switch (tipo_socio) {
            
            case "A":
                double valor_socio_A = valor_tratamiento-(valor_tratamiento*0.5);
                System.out.println("El valor a pagar segun su categoria de socio es: " + valor_socio_A);
                break;
                
            case "B":
                double valor_socio_B = valor_tratamiento-(valor_tratamiento*0.35);
                System.out.println("El valor a pagar segun su categoria de socio es: " + valor_socio_B);
                break;
                
            case "C":
                System.out.println("El valor a pagar segun su categoria de socio es: " + valor_tratamiento);
                break;
                
            default:
                System.out.println("El tipo de socio ingresado no exite");
                
        }
    }
    
}
