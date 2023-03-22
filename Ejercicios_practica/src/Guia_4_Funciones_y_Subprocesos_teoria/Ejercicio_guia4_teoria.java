package Guia_4_Funciones_y_Subprocesos_teoria;



import java.util.Scanner;



/**
 *
 * @author Pablo
 */
public class Ejercicio_guia4_teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String frase;
       
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese una frase para codificar");
        frase = leer.nextLine();
        frase = frase.toLowerCase();
                    
        int largo = frase.length();
        
        codificar(frase, largo);
    }
        
     public static void codificar(String frase, int largo) {
            
        for (int i = 0;i < largo; i++) {
            //for (int j = i+1; j <= largo; j++) {
          int  j = i + 1;
             String  letra = frase.substring(i,j);
             if (letra.equals("a")) {
                 letra = "@";
             }
              if (letra.equals("e")) {
                 letra = "#";
             }
               if (letra.equals("i")) {
                 letra = "$";
             }
                if (letra.equals("o")) {
                 letra = "%";
             }
                 if (letra.equals("u")) {
                 letra = "*";
             }
             System.out.print(letra);
            
            } 
        
        }        
                       
    }