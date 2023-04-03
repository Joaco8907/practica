
package Guia_7_POO_Practica;

import Atributos_circunferencia.Circunferencia;
import java.util.Scanner;

public class Ejercicio_dos_POO_practiva {

   /*
    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
    A continuación, se deben crear los siguientes métodos:
        Método constructor que inicialice el radio pasado como parámetro.
        Métodos get y set para el atributo radio de la clase Circunferencia.
        Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
        Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
        Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

    */
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        Circunferencia circunferencia = new Circunferencia (0);
        System.out.println("Radio: " + circunferencia.getRadio());
        System.out.println("Ingrese el nuevo radio deseado: ");
        circunferencia.setRadio(e.nextDouble());    
        System.out.println("Nuevo Radio: " + circunferencia.getRadio());
        
        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("");
        
        // obtener su area y perimetro.
        System.out.println("Area de la cicunferencia: " + circunferencia.area());
        
        // imprimimos el calculo del perimetro. 
        System.out.println("Perimetro de la circunferencia: " + circunferencia.perimetro());
        
    }
    
}
/*
public static void main(String[] args) {
    // Crear un objeto Circunferencia con radio 5
    Circunferencia circunferencia1 = new Circunferencia(5);
    
    // Obtener y mostrar el radio de la circunferencia
    System.out.println("Radio: " + circunferencia1.getRadio());
    
    // Cambiar el radio de la circunferencia y mostrarlo de nuevo
    circunferencia1.setRadio(10);
    System.out.println("Nuevo radio: " + circunferencia1.getRadio());
    
    // Crear una nueva circunferencia y obtener su área y perímetro
    Circunferencia circunferencia2 = new Circunferencia(3);
    System.out.println("Área de la circunferencia 2: " + circunferencia2.area());
    System.out.println("Perímetro de la circunferencia 2: " + circunferencia2.perimetro());
    
    // Crear una nueva circunferencia y solicitar al usuario que introduzca el radio
    Circunferencia circunferencia3 = new Circunferencia(0);
    circunferencia3.crearCircunferencia();
    System.out.println("Área de la circunferencia 3: " + circunferencia3.area());
    System.out.println("Perímetro de la circunferencia 3: " + circunferencia3.perimetro());

*/