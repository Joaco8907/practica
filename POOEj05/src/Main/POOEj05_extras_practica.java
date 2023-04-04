package Main;

import Entidades.Empleado;
import java.util.Scanner;

/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, 
 * crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual.
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
public class POOEj05_extras_practica {
    
    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        Scanner entrada =new Scanner(System.in);
        
        System.out.println("Ingerse su nombre: ");
        emp1.setNombre(entrada.next());
        System.out.println("Ingrese su edad: ");
        emp1.setEdad(entrada.nextInt());
        System.out.println("Ingrese el monto de salario actual que percibe: ");
        emp1.setSalario(entrada.nextDouble());
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("El empleado " + emp1.getNombre()+ " tiene "+ emp1.getEdad()+" años y su salario actual es $" +emp1.getSalario());
        
        if (emp1.getEdad()>=30){
            System.out.println("Por tener " + emp1.getEdad()+" años te corresponde un 10% de aumento en tu salario");
            
        }else{
            System.out.println("Por tener " + emp1.getEdad()+" años te corresponde un 5% de aumento en tu salario");
        }
        
        emp1.calcular_aumento();
        System.out.println("Tu salario con el nuevo aumento es $" + emp1.getSalario());
    }
    
}
