
package main;

import Entidades.Cuenta;

/**
 *
 * @author Afsca
 */
public class POOEj04_extras_practica {

    /**
     * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita 
     * retirar una cantidad de dinero del saldo de la cuenta. 
     * Asegúrate de que el saldo nunca sea negativo 
     * después de realizar una transacción de retiro.(metodo retiro)
     */
    public static void main(String[] args) {
        Cuenta banco_x = new Cuenta("Joaquin",500000);
        
        banco_x.retirar_dinero();
        System.out.println("El saldo actual de tu cuenta es: $" + banco_x.getSaldo());
    }
    
}
