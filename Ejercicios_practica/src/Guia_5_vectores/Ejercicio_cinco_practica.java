
package Guia_5_vectores;

import java.util.Scanner;


public class Ejercicio_cinco_practica {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la dimencion cuadrada de la matriz: ");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese un numero");
                matriz[i][j]= leer.nextInt();
            }
        }
        boolean esAntisimetrica = true;
        
        for (int i=0;i< n;i++){
            for (int j=0;i<n;i++){
                if (matriz[i][j]!= -matriz[j][i]){
                    esAntisimetrica = false;
                    break;
                }
            
            }
            if (!esAntisimetrica){
                break;
            }
        }
        
        if (esAntisimetrica==true){
            System.out.println("La matriz es antisimetrica");
            for (int i=0;i<n; i++){
                for(int j=0;j<n;j++){
                    System.out.print(matriz [i][j] + " ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
        
        
    }
}

