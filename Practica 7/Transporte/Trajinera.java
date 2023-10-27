/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Zaid
 */
public class Trajinera extends Acuaticos {
    private int velocidad;
    /**
     * Constructor vacio de la clase Trajinera 
     */
    public Trajinera() {
    }
    /**
     * Constructor lleno de la clase Trajinera
     * @param velocidad La velocidad que puede alcanzar 
     * @param propulsion Aqui se menciona que objeto hace que se desplace 
     * @param nombre El nombre del transporte
     * @param capacidadPasajeros Cantidad maxima de pasajeros que pueden subir
     * @param color Color del transporte
     */
    public Trajinera(int velocidad, String propulsion, String nombre, int capacidadPasajeros, String color) {
        super(propulsion, nombre, capacidadPasajeros, color);
        this.velocidad = velocidad;
    }
    /**
     * Metodo getVelocidad
     * @return La velocidad que tiene el transporte
     */
    public int getVelocidad() {
        return velocidad;
    }
    /**
     * Metodo que nos ayuda a ingresarle el valor de la velocidad del transporte a la variable 
     * @param velocidad 
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    /**
     * Metodo que dice que cancion se les pidio a los mariachis que cantaran
     */
    public void mariachi(){
        System.out.println("Que cancion desea joven?????");
        System.out.println("Amor eterno");
    }
    /**
     * Metodo que nos muestra brevemente una parte de la cancion que las personas abordo estan cantando
     */
    public void cantar(){
        System.out.println("Y me estaras llamando, cada 20 de abril");
    }
    /**
     * Metodo que denota que esta comienda una persona abordo de la Trajinera
     */
    public void comer(){
        System.out.println("Se come un sandwich*");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Trajinera y con el metodo super.toString() los atributos de la clase padre Acuaticos
     */
    @Override
    public String toString() {
        return "Trajinera{" + "velocidad=" + velocidad + "km/h " + " " + super.toString() +'}';
    }
}
