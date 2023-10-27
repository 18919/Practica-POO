/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Zaid
 */
public class Acuaticos extends MediosDeTransporte {
    private String propulsion;
    /**
     * Constructor vacio de la clase Acuaticos
     */
    public Acuaticos() {
    }
    /**
     * Constructor lleno de la clase Acuaticos
     * @param propulsion Aqui se menciona que objeto hace que se desplace 
     * @param nombre El nombre del transporte
     * @param capacidadPasajeros Cantidad maxima de pasajeros que pueden subir
     * @param color Color del transporte
     */
    public Acuaticos(String propulsion, String nombre, int capacidadPasajeros, String color) {
        super(nombre, capacidadPasajeros, color);
        this.propulsion = propulsion;
    }
    /**
     * Metodo getPropulsion
     * @return El objeto responsable del movimiento del transporte
     */
    public String getPropulsion() {
        return propulsion;
    }
    /**
     * Metodo que nos ayuda a ingresar el mensaje que denota el objeto responsable del movimiento del transporte
     * @param propulsion 
     */
    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }
    /**
     * Metodo heradado de la clase base Medios de Transporte que indica el estado de la capacidad de pasajeros del transporte a traves de un mensaje
     */
    @Override
    public void Pasajeros() {
        super.Pasajeros(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return Regresa en forma de mensaje los atributos de la clase y por medio del metodo super.toString() se imprime el mismo mensaje que en la clase base
     */
    @Override
    public String toString() {
        return "Acuaticos{" + "propulsion=" + propulsion + " " + super.toString() + '}';
    }
    
}
