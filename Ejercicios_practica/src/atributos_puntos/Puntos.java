/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atributos_puntos;

import java.util.Scanner;

/**
 *
 * @author Afsca
 */
public class Puntos {
    
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Puntos () {
    
}
    
    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    

    
    
    public void crearPuntos(){ 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valor para x1 ");
        x1 = leer.nextInt();
        System.out.println("Ingrese valor para x2");
        x2 = leer.nextInt();
        System.out.println("ingrese valor para y1");
        y1 = leer.nextInt();
        System.out.println("ingrese valor para y2");
        y2 = leer.nextInt();
    }
    public double calcularDistancia() {
        double d= Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
        return d;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    
}
