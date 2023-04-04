package Entidades;

import java.util.Scanner;

/**
 *Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
 * Asegúrate de que el saldo nunca sea negativo 
 * después de realizar una transacción de retiro.
 */
public class Cuenta {
    private int saldo;
    private String titular;

    public Cuenta(String titular, int saldo ) {
        this.titular=titular;
        this.saldo=saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    public int retirar_dinero(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int monto_retirar; 
        System.out.println("El saldo de tu cuenta es: $" + saldo);
        do{
            
            System.out.println("Ingrese la cantidad de dinero que desea retirar de su cuenta: ");
            monto_retirar=entrada.nextInt();
        if (saldo>=monto_retirar){
            saldo-=monto_retirar;
            System.out.println("descontaremos de tu cuenta $" + monto_retirar);
            System.out.println("El saldo actual de tu cuenta actualmente es: $" + saldo);
        }
        if (saldo<monto_retirar){
            System.out.println("Lo sentimos tu saldo es insufiente para realizar esta operacion.");
            System.out.println("El saldo de tu cuenta actualmente es: $" + saldo );
        }
            System.out.println("Desea realizar otro retiro:  ");
            System.out.println("1- SI");
            System.out.println("2- NO");
            opcion=entrada.nextInt();
            
        }while(opcion!=2);    
        
        return saldo;
    }
    
    
}
