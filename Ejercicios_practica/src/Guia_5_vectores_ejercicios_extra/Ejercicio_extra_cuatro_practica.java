
package Guia_5_vectores_ejercicios_extra;

import java.util.Scanner;

public class Ejercicio_extra_cuatro_practica {

    /**
     * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos 
     * para luego obtener una cantidad de aprobados y desaprobados. 
     * Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
     * Las ponderaciones de cada nota son:
             Primer trabajo práctico evaluativo 10%
             Segundo trabajo práctico evaluativo 15%
             Primer Integrador 25%
             Segundo integrador 50%
       Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
       Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
       teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cantidadAlumnos = 10;
        double[] promedios = new double[cantidadAlumnos];
        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese las notas del alumno " + (i+1) + ":");
            double tpe1 = input.nextDouble() * 0.1;
            double tpe2 = input.nextDouble() * 0.15;
            double integrador1 = input.nextDouble() * 0.25;
            double integrador2 = input.nextDouble() * 0.5;

            double promedio = tpe1 + tpe2 + integrador1 + integrador2;
            promedios[i] = promedio;

            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}
