
package Guia_7_POO_Practica;

import Atributos_Rectangulo.Rectangulo;


public class Ejercicio_cuatro_POO_Practica {

    /**
     * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo 
     * privado altura. La clase incluirá un método para crear el rectángulo con los datos del Rectángulo 
     * dados por el usuario. También incluirá un método para calcular la superficie del rectángulo 
     * y un método para calcular el perímetro del rectángulo. Por último, 
     * tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
     * Se deberán además definir los métodos getters, setters y constructores correspondientes.
       Superficie = base * altura / Perímetro = (base + altura) * 2.
     */
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo ();
        System.out.println("La base del rectangulo es: "+ rect.getBase());
        System.out.println("");
        System.out.println("La altura del rectangulo es: "+ rect.getAltura());
        
        int suerficie = rect.superficieRectangulo();
        System.out.println("La superficie del rectangulo es: "+ suerficie);
        double perimetro = rect.PerimetroRectangulo();
        System.out.println("El perimetro del rectangulo es: "+ perimetro);
        
        // Ahora imprimiremos por pantalla el rectangulo. 
        
        rect.dibujarRectangulo();
    }
}
