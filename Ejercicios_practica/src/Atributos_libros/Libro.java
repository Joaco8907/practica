package Atributos_libros;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
     * Crear una clase llamada Libro que contenga los siguientes atributos: 
     * ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro 
     * y un constructor vacío. 
     * Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método
     * el número de ISBN, el título, el autor del libro y el número de páginas
     */

public class Libro {
    
    public String ISBN;
    public String Titulo;
    public String Autor;
    public String Num_de_pag;
    
    

    //Creamos un constructor que recibe datos por parametro para el objeto libro. 
    public Libro(String ISBN, String Titulo, String Autor, String Num_de_pag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Num_de_pag = Num_de_pag;
    }

    //Creamos un constructor vacio para el objeto Libro. 
    public Libro() {
    }

    // creamos un metodo set para poder modificar los atributos por los que elija el usuario. 

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNum_de_pag(String Num_de_pag) {
        this.Num_de_pag = Num_de_pag;
    }

   
    // Creamos metodos get para poder recuperar los atributos modificados por el usuario.
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getNum_de_pag() {
        return Num_de_pag;
    }
    
    
    
    
    // A trave del metodo toString(). mostramos todos los datos seleccionados. 
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Num_de_pag=" + Num_de_pag + '}';
    }
    
    
    
    
    
}
