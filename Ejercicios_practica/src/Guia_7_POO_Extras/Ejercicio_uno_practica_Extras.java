
package Guia_7_POO_Extras;

import atributos_cancion.Cancion;

/**
 *
 * @author Afsca
 */
public class Ejercicio_uno_practica_Extras {

    /**
     * Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
     * Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías 
     * y otro que reciba como parámetros el título y el autor de la canción. 
     * Se deberán además definir los métodos getters y setters correspondientes.
     */
    public static void main(String[] args) {
        Cancion can = new Cancion ("cancion1", "maddona");
        
        System.out.println(can.toString());

    }
    
}
