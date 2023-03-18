
package Guia_2;

import java.util.Scanner;
public class Ejercicio_cuatro {

    /**
     *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
     *La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de grados centigrados que desea convertir a Fahrenheit: ");
        int cent = entrada.nextInt();
        float fahren = 32 + (9 * cent / 5);
        
        System.out.println("La cantidad de grados cenigrados ingresada equivale a " + fahren + ( " grados Fahrenheit"));
        
        
        
    }
    
}
