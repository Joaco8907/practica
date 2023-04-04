
package Entidad;

import java.util.Scanner;

public class Pooej03_extras_practica {

    
    public static void main(String[] args) {
        
        //asi por parametros podemos comenzar el juego simplemente invocando al metodo partida().
        Juego adivinarNumero= new Juego("pedro","Maria",5,3,5);
        
        //Sino podemos modificar los datos antes de comenzar la partida de la siguiente forma:
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del jugador 1: ");
        adivinarNumero.setJugador1(entrada.next());
        System.out.println("");
        
        System.out.println("Ingrese el nombre de  jugador 2: ");
        adivinarNumero.setJugador2(entrada.next());
        System.out.println("");
        
        System.out.println(adivinarNumero.getJugador1() + " elige la cantidad de intentos limites que tendra " + adivinarNumero.getJugador2() 
                            + " para adivinar el numero que elegiste: ");
        adivinarNumero.setIntentosLimites(entrada.nextInt());
        System.out.println("");
        
        
        System.out.println(adivinarNumero.getJugador1() + " Elije el numero que tendra que adivinar " + adivinarNumero.getJugador2());
        adivinarNumero.setNumAdivinar(entrada.nextInt());
        adivinarNumero.limpiar();
        
        System.out.println(""); 
        System.out.println("-------------------------------------------------------------------------");
        
        // Una vez cargados todos los datos comenzamos el juego invocando al metodo partida().
        System.out.println(adivinarNumero.getJugador2() + " ¿Que numero crees que eligio " + adivinarNumero.getJugador1 ()+ "?");
        adivinarNumero.setNumelegido(entrada.nextInt());
        
        adivinarNumero.partida();
        
    }
}
