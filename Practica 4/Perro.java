/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author alumno
 */
public class Perro {
    String nombre,raza,color;
    int edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    public void sentado(){
        System.out.println("Estoy sentado xd");
    }
    public void ladra(int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("Guau");
        }
    }
    public void corre(int distancia){
        System.out.println("Corri "+distancia+" metros");
    }
    public void duerme(int tiempo){
        System.out.println("Dormi: "+tiempo+" minutos");
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + '}';
    }
    
    
}
