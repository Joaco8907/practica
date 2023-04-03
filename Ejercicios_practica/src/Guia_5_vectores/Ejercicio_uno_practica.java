
package Guia_5_vectores;


public class Ejercicio_uno_practica {

    /**
     Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
     */
    public static void main(String[] args) {
        int[]  numeros = new int[100];
        
        for (int i=0;i<numeros.length;i++){
             
             numeros[i]=i+1; 
        }  
               
        for (int i=numeros.length-1;i>=0;i--){

            if (numeros[i]>1){
            System.out.print(numeros[i] +", ");
            }
            else{
            System.out.print(numeros[i]);
            }
        }
    }
}
