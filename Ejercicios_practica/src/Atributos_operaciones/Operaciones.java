
package Atributos_operaciones;

import java.util.Scanner;


public class Operaciones {
    /*
    Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
    A continuación, se deben crear los siguientes métodos:
        *Método constructor con todos los atributos pasados por parámetro.
        *Método constructor sin los atributos pasados por parámetro.
        *Métodos get y set.
        *Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los 
        atributos del objeto.
        
        Método sumar(): calcular la suma de los números y devolver el resultado al main.
        Método restar(): calcular la resta de los números y devolver el resultado al main
        Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
        si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
        Si no, se hace la multiplicación y se devuelve el resultado al main
        Método dividir(): primero valida que no se haga una división por cero, 
        si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario 
        el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

    */
    private int numero1 ;
    private int numero2 ;

    // Creando un constructor con atributos por parametros. 
    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // Creando un constructor sin atributos sin parametros.
    public Operaciones() {
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperaciones(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el primer numero para operar: ");
        this.numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero para operar: ");
        this.numero2= entrada.nextInt();
    }
    
    public int sumar(){
        return numero1+numero2;
    }
    
    public int restar(){
        return numero1-numero2;
    }
    
    public int multiplicar(){
        if (numero1!=0 && numero2!=0){
            return numero1*numero2;
        }else{
            return 0;
        }
    }
    public double dividir(){
        if (numero1!=0 && numero2!=0){
            return numero1/numero2;
        }else{
            return 0;
        }
    }
        
        
}
