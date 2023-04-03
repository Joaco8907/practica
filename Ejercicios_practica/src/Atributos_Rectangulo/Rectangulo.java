package Atributos_Rectangulo;

import java.util.Scanner;

     /*
     * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo 
     * privado altura. La clase incluirá un método para crear el rectángulo con los datos del Rectángulo 
     * dados por el usuario. 
        También incluirá un método para calcular la superficie del rectángulo 
     * y un método para calcular el perímetro del rectángulo. Por último, 
     * tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
     * Se deberán además definir los métodos getters, setters y constructores correspondientes.
       Superficie = base * altura / Perímetro = (base + altura) * 2.
     */
 

// Creamos el objeto Rectangulo con sus atributos bse y altura. 
public class Rectangulo {
    private int base;
    private int altura;

    
    // Ahora le ingresamos valores a los atributos base y altura del objeto rectangulo. 
    public Rectangulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        this.base = entrada.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura=entrada.nextInt();
    }
    
    // creamos el metodo set para modificar la base 
    public void setBase(int base) {
        this.base = base;
    }
    //creamos el metodo set para modificar altura
    public void setAltura(int altura) {
        this.altura = altura;
    }
    // creamos el metodo get para recuperar el dato que hay en base
    public int getBase() {
        return base;
    }
    // Creamos el metodo get para recuperar el dato de altura. 
    public int getAltura() {
        return altura;
    }
    
    
    // Creamos un metodo que calcule la superficie del rectangulo.  
    public int superficieRectangulo(){
        return base*altura;
    }
    // Creamos un metodo que calculé el perimetro del rectangulo. 
    public double PerimetroRectangulo(){
        return (base+altura)/2;
    }
    
    // Creamos un metodo que dibuje el rectangulo de a cuerdo a los datos de base y altura elegidos por el usuario. 
    public void dibujarRectangulo(){
        String[][] dibujoRectangulo = new String[altura][base];
        /*                * * * * *
                          *       *
                          *       *
                          * * * * *
        */
        for (int i=0; i<(altura);i++){
            for (int j=0; j<base;j++)
                if (j>0 && j<base-1 && i>0 && i<altura-1){
                   dibujoRectangulo[i][j]="  ";
                }else{
                    dibujoRectangulo[i][j]="* ";
                }
        }
        for (int i=0; i<(altura);i++){
            for (int j=0; j<base;j++){
                System.out.print(dibujoRectangulo[i][j]);
        }
            System.out.println("");
   }
}
    
    
}
