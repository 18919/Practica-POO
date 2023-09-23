/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Cano Vazquez Axel Zaid
 */
public class Coche {
    String marca, modelo, color, motor, combustible;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, String motor, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.combustible = combustible;
    }
    public void avanzar(int distance){
        System.out.println("El coche recorrio "+distance+" km");
    }
    public void frenar(){
        System.out.println("El coche no se esta moviendo, acaba de frenar");
    }
    public void encender(){
        System.out.println("Encendido");
    }
    public void apagar(){
        System.out.println("El coche esta apagado");
    }
    public void direccion(String lado){
        System.out.println("El coche gira hacia la "+lado);
    }
    public void movimiento(){
        System.out.println("El coche esta en movimiento xd");
    }
    
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor + ", combustible=" + combustible + '}';
    }
    
    
}
