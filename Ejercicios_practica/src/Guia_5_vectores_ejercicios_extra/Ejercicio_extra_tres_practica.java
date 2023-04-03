
package Guia_5_vectores_ejercicios_extra;
import java.util.Random;

public class Ejercicio_extra_tres_practica {

    /**
     * Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
     * Después haremos otra función o procedimiento que imprima el vector
     */
    public static void main(String[] args) {
        int [] vector = new int[5];
        
        vector = devolverVector(vector);
        imprimir_Vector(vector);
        
        
    // Creando una funcion que rellena un vector y retorna su valor. 
    }public static int[] devolverVector(int vector[]){
        Random aleatorio = new Random();
            for (int i = 0; i < vector.length; i++) {
                vector[i]= aleatorio.nextInt(10);
            }
            return vector;
        }
    
    // Creando un metodo que imprime por pantalla el vector. 
    public static void imprimir_Vector(int [] vector){
        devolverVector(vector);
        // A traves de un for mejorado imprimo todos los elementos del vector. 
        for (int i : vector) {
            System.out.print(i + " ");
        }
    }
}
