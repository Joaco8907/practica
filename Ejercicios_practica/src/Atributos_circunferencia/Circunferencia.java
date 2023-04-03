/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atributos_circunferencia;

import java.util.Scanner;

/**
    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
    A continuación, se deben crear los siguientes métodos:
        Método constructor que inicialice el radio pasado como parámetro.
        Métodos get y set para el atributo radio de la clase Circunferencia.
        Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
        Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
        Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */

//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
public class Circunferencia {
    private double radio;

    // Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
     public double getRadio() {
        return radio;
    }
    
     public void setRadio(double radio) {
        this.radio = radio;
    }
    
     
    
    
    // Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
    public void crearCircunferencia(){
       Scanner entrada = new Scanner (System.in);
       System.out.println("Ingrese el radio deseado: ");
       this.radio = entrada.nextDouble();
   }
    
    // Metodo para calcular el Area y devolver un double en el return. 
    public double area(){
        return Math.PI*radio*radio;
    }
    
    // Metodo para calcular el perimetro y devolver un double en el return
    public double perimetro(){
       return 2*Math.PI*radio; 
    }
    
     
}



