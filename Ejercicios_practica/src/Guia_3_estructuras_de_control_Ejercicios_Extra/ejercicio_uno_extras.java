
package Guia_3_estructuras_de_control_Ejercicios_Extra;

import java.util.Scanner;
public class ejercicio_uno_extras {

    /**
     Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos,
     * el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de minutos a calcular: ");
        int minutos = entrada.nextInt();
        
       
        
        if (minutos % 1440 == 0){
            int dias = Math.round(minutos / 1440);
            System.out.println("La cantidad de minutos equivalen a:" + dias + " dias");
        }else if (minutos %1440 >0 && (minutos %1440)%60 == 0){
            int dias = Math.round(minutos / 1440);
            int horas = Math.round((minutos % 1440)/60);
            System.out.println("Los minutos ingresados equivalen a : " + dias + " dias, " + horas + " Horas");
        }else if (minutos % 1440>0 && (minutos %1440)%60 > 0){
            int dias =Math.round(minutos/1440);
            int horas = Math.round((minutos%1440)/60);
            minutos = minutos - (1440*dias)-(60*horas);
        }else if (minutos %1440<0 && (minutos %1440)%60 > 0){
            int horas = Math.round((minutos % 1440)/60 );
            minutos = minutos-(horas*60);
            System.out.println("La cantidad de minutos ingresados equivalen a " + horas + " horas " + minutos + "minutos");
        }else{
            System.out.println("la cantidad de minutos ingresados quivalen a " + minutos);
        }
    
   }
    
}
