/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Zaid
 */
public class Barco extends Acuaticos {
    private String apodo;
    /**
     * Constructor vacio de la clase Barco
     */
    public Barco() {
    }
    /**
     * Constructor lleno de la clase Barco
     * @param apodo Nombre caracteristico que comunmente se le da al barco
     * @param propulsion Aqui se menciona que objeto hace que se desplace 
     * @param nombre El nombre del transporte
     * @param capacidadPasajeros Cantidad maxima de pasajeros que pueden subir
     * @param color Color del transporte
     */
    public Barco(String apodo, String propulsion, String nombre, int capacidadPasajeros, String color) {
        super(propulsion, nombre, capacidadPasajeros, color);
        this.apodo = apodo;
    }
    /**
     * Metodo getApodo
     * @return En forma de mensaje el apodo del Barco
     */
    public String getApodo() {
        return apodo;
    }
    /**
     * Metodo que nos ayuda a ingresar el apodo del Barco y guardarla en la variable apodo
     * @param apodo 
     */
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    /**
     * Metodo que nos indica cuando el viaje del Barco a finalizado mostrando en forma de mensaje las indicaciones del capitan de tirar el ancla
     */
    public void anclar(){
        System.out.println("Hemos llegado a nuestro destino");
        System.out.println("Tiren el ancla");
    }
    /**
     * Metodo que da a entender sobre la existencia de un espectaculo de magia abordo del Barco
     */
    public void espectaculo(){
        System.out.println("Seleccione una carta");
        System.out.println("Es esta tu carta?");
        System.out.println("Le muestra un 2 de corazones*");
    }
    /**
     * Metodo que atraves de una onomatopeya nos muestra cuando el barco toca su bocina
     */
    public void bocina(){
        System.out.println("El barco toca la bocina*");
        System.out.println("brooooom brooooom");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Barco y con el metodo super.toString() los atributos de la clase padre Acuaticos
     */
    @Override
    public String toString() {
        return "Barco{" + "apodo=" + apodo + " " + super.toString() + '}';
    }
    
    
}
