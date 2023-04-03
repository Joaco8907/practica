/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia_7_POO_Practica;

import Atributos_Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author Afsca
 */
public class Ejercicio_uno_POO_Practica {

    /**
     * Crear una clase llamada Libro que contenga los siguientes atributos: 
     * ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro 
     * y un constructor vacío. 
     * Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método
     * el número de ISBN, el título, el autor del libro y el número de páginas
     */
    public static void main(String[] args) {
        
        // Utilizamos la libreria Scanner para permitirle al usuario ingresar datos por teclado. 
        Scanner entrada = new Scanner (System.in);
        // Hacemos nacer el nuevo objeto llamado libro. 
        Libro libro = new Libro ("12334", "programacion", "joaquin gonzalez", "354");
        System.out.println(libro.toString());
        
        // Vamos a modificar lo que hay dentro de cada atributo del objeto libro. con el metodo libro.ser...()
        System.out.println("Ingrese el ISBN del libro: ");
        libro.setISBN(entrada.next());
        
        
        
        System.out.println("Ingrese el Titulo del libro: ");
        libro.setTitulo(entrada.nextLine());
        // Como se guardo la primera vez con un next y en este metodo tenemos que guardar una cadena de dos caracteres usamos entrada.next()
        // si no se hace hace el siguente escaner quedara vacio. 
        entrada.next();
   
        System.out.println("Ingrese el autor del libro: ");
        libro.setAutor(entrada.nextLine());
        // Como se guardo la primera vez con un next y en este metodo tenemos que guardar una cadena de dos caracteres usamos entrada.next()
        // si no se hace hace el siguente escaner quedara vacio. 
        entrada.next();
        
        System.out.println("Ingrese el numero de paginas: ");
        libro.setNum_de_pag(entrada.next());
        // Como se guardo la primera vez con un next y en este metodo tenemos que guardar una cadena de dos caracteres usamos entrada.next()
        // si no se hace hace el siguente escaner quedara vacio. 
        entrada.next();
        
        
        // Vamos a recuperar lo que hay detro de cada atributo una vez ya modificado a trave del metodo libro.get...()
        libro.getAutor();
        libro.getISBN();
        libro.getTitulo();
        libro.getNum_de_pag();
        
        System.out.println(libro);
        
        
    }
    
    
    
}
