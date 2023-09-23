/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Cano Vazquez Axel Zaid
 */
public class Punto {
    public int x,y;// Zona de atributos
    //Zona de constructor 

    public Punto() {
    }
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void imprimePunto(){
        System.out.println("x="+x+" , y="+y);
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
}
