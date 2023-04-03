package Guia_5_vectores;

import java.util.Scanner;


public class Ejercicio_seis_practica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Elija el orden de la matriz (no superior a 10)");
        int order = input.nextInt();

        int[][] magicArray = new int[order][order];

        int k = 0;
        int l = 0;
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.println("Ingrese siguiente numero");
                magicArray[i][j] = input.nextInt();
                showProgress(magicArray, k, l, j);
                if (l < order - 1) {
                    l = l + 1;
                }
            }
            k = k + 1;
        }

        validateArray(magicArray, order);
    }

    public static void showProgress(int[][] magicArray, int k, int l, int j) {
   //     clearScreen();
        for (int i = 0; i <= k; i++) {
            if (i == k) {
                l = j;
            }
            for (int m = 0; m <= l; m++) {
                System.out.print(magicArray[i][m] + "  ");
            }
            System.out.println();
        }
    }

    public static void validateArray(int[][] magicArray, int order) {
        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;
        boolean valid = true;

        for (int i = 0; i < order && valid; i++) {
            diagonalPrincipal += magicArray[i][i];
            diagonalSecundaria += magicArray[i][order - 1 - i];
            valid = magicArray[i][i] >= 1 && magicArray[i][i] <= 9 && magicArray[i][order - 1 - i] >= 1 && magicArray[i][order - 1 - i] <= 9;
        }

        valid = diagonalPrincipal == diagonalSecundaria;

        for (int i = 0; i < order && valid; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;

            for (int j = 0; j < order && valid; j++) {
                sumaFila += magicArray[i][j];
                sumaColumna += magicArray[j][i];
                valid = magicArray[i][j] >= 1 && magicArray[i][j] <= 9 && magicArray[j][i] >= 1 && magicArray[j][i] <= 9;
            }

            valid = valid && sumaFila == sumaColumna && sumaFila == diagonalPrincipal;
        }

        if (valid) {
            System.out.println("Bien. Suma: " + diagonalSecundaria);
        } else {
            System.out.println("MAL.");
        }
    }

  //  public static void clearScreen() {  
    //    System.out.print("\033[H\033[2J");  
    //  System.out.flush();  
}  

