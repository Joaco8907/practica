/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia_5_vectores;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Afsca
 */
public class Ejercicio_cuatro_practica {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();

        int[][] m = new int[4][4];

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m.length; j++) {
                m[i][j] = aleatorio.nextInt(10);

            }

        }
        for (int i = 0; i<m.length; i++) {
            for (int j = 0; j<m.length ; j++) {
                System.out.print(m[i][j] + " ");
                
            } 
            System.out.println(""); 
        }
        System.out.println("");
        System.out.println("");
        for (int j = 0; j<m.length; j++) {
            for (int i = 0; i<m.length ; i++) {
                System.out.print(m[i][j] + " ");
                
            } 
            System.out.println(""); 
        }
    }
}   

