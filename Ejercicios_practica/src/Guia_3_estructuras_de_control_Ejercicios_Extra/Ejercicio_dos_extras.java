
package Guia_3_estructuras_de_control_Ejercicios_Extra;

import java.util.Scanner;

public class Ejercicio_dos_extras {

    /**
     Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
     * A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, 
     * C tome el valor de A, A tome el valor de D y D tome el valor de B. 
     * Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int aux = 0;
        
        System.out.println("Ingrese el valor de A: ");
        int a= entrada.nextInt();
        
        System.out.println("Ingrese el valor de B: ");
        int b= entrada.nextInt();
        
        System.out.println("Ingrese el valor de C: ");
        int c= entrada.nextInt();
        
        System.out.println("Ingrese el valor de D: ");
        int d= entrada.nextInt();
        
        
        System.out.println("A = " + a + ", B = " + b + ", C = " + c + ", D = " + d);
        // pasamos a mover las variables con la ayuda de una variable auxiliar. 
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.println("A = " + a + ", B = " + b + ", C = " + c + ", D = " + d);
                
                
        
        
        
        
        
        
        
        
        
        
    }
    
}
