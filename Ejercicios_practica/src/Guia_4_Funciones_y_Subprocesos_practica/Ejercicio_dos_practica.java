/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, 
el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package Guia_4_Funciones_y_Subprocesos_practica;

import java.util.Scanner;
public class Ejercicio_dos_practica {

    /**
     do
dentro del bulce 
datos ()
sout "deseas poner otro nombre"
* string opcion=en....
while s/n


sout

metodo String datos(string nombre, int edad)

  sout "Ingrese su nombre"
  string nombre=entrar.....
  sout "Ingrese su edad"

if (edad >18){
	sout (nombre + "tiene" + edad + ", Es mayor de edad)
	
}else
	sout (nombre + "tiene" +edad ", Es menor de edad")
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Desea ingresar los datos de la persona");
        String opcion = (entrada.nextLine()).toUpperCase();
        
        
        while (!(opcion.equalsIgnoreCase("no"))){
            datos();
            System.out.println("Quiere seguir mostrando personas ");
            opcion = (entrada.nextLine()).toUpperCase();
        }
    }
    public static void datos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = entrada.nextInt();
        
        if (edad >18){
	    System.out.println(nombre + "tiene" + edad + ", Es mayor de edad "); 
	
        }else
	    System.out.println(nombre + "tiene" + edad + ", Es mayor de edad ");
    }
    
}
