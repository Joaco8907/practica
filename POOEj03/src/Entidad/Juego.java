package Entidad;

import java.util.Scanner;

/**
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de números. El primer jugador elige un
 * número y el segundo jugador intenta adivinarlo. (jugador1; jugador2;
 * numeroAdivinar; numeroElegido;) //Atributos El segundo jugador tiene un
 * número limitado de intentos y recibe una pista de "más alto" o "más bajo"
 * después de cada intento. (Intentos; crear el mensaje en un condicional" mas
 * alto o mas bajo") El juego termina cuando el segundo jugador adivina el
 * número o se queda sin intentos. (condicional para terminar partida;
 * cont_intentos) Registra el número de intentos necesarios para adivinar el
 * número y el número de veces que cada jugador ha ganado.
 * (mostrar_cont_intentos; mostrarJ1_gano; mostrarJ2_gano) metodos.
 */
public class Juego {

    private String jugador1;
    private String jugador2;
    private int intentosLimites;
    private int numAdivinar;
    private int numelegido;

    public Juego(String jugador1, String jugador2, int numAdivinar, int numelegido, int intentosLimites) {
        // Todo esto sera preguntado y pasado por parametro.
        this.jugador1 = jugador1; // ¿Quien sera el jugador 1? 
        this.jugador2 = jugador2; // ¿Quien sera el jugador 2?
        this.intentosLimites = intentosLimites;  // ¿Cuantos intentos limites tendra el jugador 2? 
        this.numAdivinar = numAdivinar;  // Elije el numero que tendra que adivinar el jugador 2.
        this.numelegido = numelegido;    // ¿Que numero crees que eligio el jugador 1?  
    }

    // ¿Como se jugara? ** es decir, que es lo que tiene que hacer este programa. 
    // Todos estos son metodos para modificar y extraer datos de los atributos privados.
    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public void setIntentosLimites(int intentosLimites) {
        this.intentosLimites = intentosLimites;
    }

    public void setNumAdivinar(int numAdivinar) {
        this.numAdivinar = numAdivinar;
    }

    public void setNumelegido(int numelegido) {
        this.numelegido = numelegido;
    }

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public int getIntentosLimites() {
        return intentosLimites;
    }

    public int getNumAdivinar() {
        return numAdivinar;
    }

    public int getNumelegido() {
        return numelegido;
    }

    //-------------------------------------------------------------------------------------------
    
    //Estos metodo se podria usar si los modificadores de acceso fueran publicos y no priivados. 
    // Metodo para elegir el nombre del primer jugador.
    public String asignarNombre_jugador_1(String nombre) {
        jugador1 = nombre;
        return jugador1;
    }

    // Metodo para elegir el nombre del segundo jugador.
    public String asignarNombre_jugador_2(String nombre) {
        jugador1 = nombre;
        return jugador2;
    }

    // Metodo para elegir la cantidad de intentos limites elegidas por el primer jugador.
    public int elegir_intentos_Limites(int intentos) {
        intentosLimites = intentos;
        return intentosLimites;
    }

    // Metodo para que el jugador 1 elegija ¿Cual sera el numero a adivinar?
    public int elegir_numero_a_adivinar(int num1) {
        numAdivinar = num1;
        return numAdivinar;
    }

    // Metodo para que el jugador 2 nos diga ¿Cual cree que fue el numero que eligio el jugador 1?    
    public int elegir_numero_elegido(int num2) {
        numelegido = num2;
        return numelegido;
    }
    
    public void limpiar(){
        for (int i=0; i <30 ; i++){
         System.out.println();
        }
    }
    
    //----------------------------------------------------------------------------------------

    //Comenzamos la partida .........
    public void partida() {
        Scanner entrada = new Scanner(System.in);
        int aux_intentos = 1;
        int opcion;
        int j1_gano=0;
        int j2_gano=0;
        
        do{
        while (numAdivinar != numelegido && intentosLimites != 0 ) {

            aux_intentos++;
            this.intentosLimites--;
            
            if (numAdivinar < numelegido && intentosLimites != 0) {
                System.out.println("El numero a adivinar es mas bajo que el numero que elegiste");
                System.out.println("Elige un otro numero considerando esta pista.");
                numelegido = entrada.nextInt();
            } else if (numAdivinar > numelegido && intentosLimites != 0) {
                System.out.println("El numero a adivinar es mas alto que el numero que elegiste");
                System.out.println("Elige un otro numero considerando esta pista.");
                numelegido = entrada.nextInt();
            }
        }
        if (intentosLimites==0){
            System.out.println("El ganador de esta partida es " + jugador1 );
            j1_gano ++;
        }else{
            System.out.println("El ganador de esta partida es " + jugador2 + " y la cantidad de intentos que utilizo fueron: " 
                                + aux_intentos + " intentos.");
            j2_gano ++;
        }
        
        System.out.println("¿Desean seguir jugando? elije un numero: ");
        System.out.println("1- Si/ 2- No");
        opcion = entrada.nextInt();
        if(opcion ==1){
            intentosLimites+=aux_intentos;
            System.out.println(jugador1 + " Elige otro numero: ");
            numAdivinar=entrada.nextInt();
            System.out.println("--------------");
            System.out.println(jugador2 + " ¿Que numero crees que eligio el jugador 1?: ");
            numelegido=entrada.nextInt();
        } 
        }while(opcion!=2);
        
        System.out.println(jugador1 + " Gano " +j1_gano + " partidas");
        System.out.println(jugador2 + " Gano " +j2_gano + " partidas");
        
        if (j1_gano>j2_gano){
            System.out.println("Congratulation " + jugador1 + "Eres el ganador del juego");
        }else{    
            System.out.println("Congratulation " + jugador2 + "Eres el ganador del juego");
        }
    }

}
