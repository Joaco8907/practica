
package Main;

import Entidades.Rectangulo;


public class POOEj06_extras_practica {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4,6);
        
        rectangulo1.calcular_area();
    
        System.out.println(rectangulo1);
        System.out.println("El area del rectangulo es: Area=" + rectangulo1.calcular_area());
    }
    
}
