/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Zaid
 */
public class Helicoptero extends Aereos {
    private String modelo;
    /**
     * Constructor vacio de la clase Helicoptero
     */
    public Helicoptero() {
    }
    /**
     * Constructor lleno de la clase Helicoptero
     * @param modelo El modelo específico del helicoptero
     * @param altura Numeros de metros a los que se encuentra volando desde el suelo el transporte
     * @param nombre Representa el nombre del medio de transporte
     * @param capacidadPasajeros La cantidad maxima de pasajeros que pueden abordar 
     * @param color El color del Transporte
     */
    public Helicoptero(String modelo, int altura, String nombre, int capacidadPasajeros, String color) {
        super(altura, nombre, capacidadPasajeros, color);
        this.modelo = modelo;
    }
    /**
     * Metodo getModelo
     * @return El modelo del helicoptero
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Metodo que nos ayuda a ingresar el modelo del helicoptero y guardarlo en una variable
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Metodo que nos muestra la forma en que se comunica el piloto con la base de control para tener informacion sobre el clima y si deberia de tomar algunas precauciones
     */
    public void mensaje(){
        System.out.println("piloto a base, repito piloto a base, pedimos un informe sobre el estado del clima");
    }
    /**
     * Metodo en el que se muestra como el piloto va dando una guia a las personas abordo sobre el lugar en el que se esta pilotando
     */
    public void descripcion(){
        System.out.println("Como pueden observar estamos volando sobre la selva mas grande del mundo, donde cabe mencionar tiene una fauna variada");
    }
    /**
     * Metodo que nos muestra la accion que hacen las personas abordo del helicoptero para poder rescatar o llevar a otro lugar a una persona
     */
    public void estraccion(){
        System.out.println("Lanza una soga para recuperar a una persona*");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Helicoptero y con el metodo super.toString() los atributos de la clase padre Aereos
     */
    @Override
    public String toString() {
        return "Helicoptero{" + "modelo=" + modelo + " " + super.toString() + '}';
    }
    
    
}
