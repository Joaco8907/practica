
package Guia_5_vectores;

import java.util.Scanner;
import java.util.Random;
public class Ejercicio_dos_practica {

    /**
     * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. 
     * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("Ingrese la dimension deseada para su vector: ");
        int N=entrada.nextInt();
        
        int[] vector = new int[N];
        
        for (int i=0; i<vector.length;i++){
            vector[i]= aleatorio.nextInt(20);
        }
        
        // Imprimiremmos como queda la matriz con numeros aleatorios. 
        for (int i=0;i<N;i++){
            
            System.out.println("["+vector[i]+"]" + " " );
        
        }
        System.out.println("Ingrese el numero a buscar dentro del array: ");
        int buscar = entrada.nextInt();
        boolean encontrado=false;
        int repite=0;
        for (int i=0;i<vector.length;i++){
            
            if (vector[i] == buscar){
                encontrado = true;
            if (encontrado == true && repite<1){
                System.out.println("El numero " + buscar + " se encuentra en la posicion " + i);
                repite++;
                encontrado=false;
                    
                }else{
                    System.out.println("El numero " + buscar + " tambien se en cuentra en la posicion " + i);
                    repite++;
                    encontrado=false;
                }
            }
        }if (repite >0){
            System.out.println("El elemento " + buscar + " se encuentra " + repite + " veces en el vector");
        }else{
            System.out.println("El numero " + buscar +" no se encuentra en el vector");
        }
    }
}
