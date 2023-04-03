
package Guia_7_POO_Practica;

import Atributos_operaciones.Operaciones;


public class Ejercicio_tres_POO_practica {
    /*
    Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
    A continuación, se deben crear los siguientes métodos:
        Método constructor con todos los atributos pasados por parámetro.
        Método constructor sin los atributos pasados por parámetro.
        Métodos get y set.
        Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
        Método sumar(): calcular la suma de los números y devolver el resultado al main.
        Método restar(): calcular la resta de los números y devolver el resultado al main
        Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
        Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

    */
    
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones (1,2);
        System.out.println("Valor actual de Numero1= "+ operaciones.getNumero1());
        System.out.println("Valor actual de Numero2= "+ operaciones.getNumero2());
        
       operaciones.crearOperaciones();
        System.out.println("El resultado de la suma de los dos numeros modificados es: " + operaciones.sumar());
        System.out.println("El resultado de la resta de los numeros modificados es: "+ operaciones.restar());
        
        if (operaciones.multiplicar()!=0){
            System.out.println("El resultado de la multiplicacion de los numeros modificados es: "+ operaciones.multiplicar());
        }else{
            System.out.println("Error");
        }
        
        if (operaciones.dividir()!=0){
            System.out.println("El resultado de la division de los numeros modificados es: "+ operaciones.dividir());
        }
        
    }
    
}
