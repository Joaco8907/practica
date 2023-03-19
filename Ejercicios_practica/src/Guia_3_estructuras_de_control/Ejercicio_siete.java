
package Guia_3_estructuras_de_control;

import java.util.Scanner;
public class Ejercicio_siete {

    /**
     Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
     * Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
     * el primer carácter tiene que ser X y el último tiene que ser una O.
       Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos 
     * (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
     Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
     * Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont_correct=0, cont_incorrect=0;
        String forma="";
        
        
        while (!(forma.equals("&&&&&"))){
            System.out.println("Ingrese una cadena de 5 letras");
            forma = entrada.nextLine();
            
            
            if (forma.length()== 5 && forma.startsWith("x") && forma.endsWith("o")){
                cont_correct +=1;
                
            }else{
                cont_incorrect +=1;
                
            }
            
        }
        
        cont_incorrect=cont_incorrect-1;
        System.out.println("La cantidad de veces que se ingreso el formato correcto fueron: " + cont_correct);
        System.out.println("La cantidad de veces que se ingreso el formato incorrecto fueron: " + cont_incorrect);
        
    }
    
}
