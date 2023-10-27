/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Zaid
 */
public class Aereos extends MediosDeTransporte {
    private int altura;
    /**
     * Constructor vacio de la clase Aereos
     */
    public Aereos() {
    }
    /**
     * Constructor lleno de la clase Aereos
     * @param altura Numeros de metros a los que se encuentra volando desde el suelo el transporte
     * @param nombre Representa el nombre del medio de transporte
     * @param capacidadPasajeros La cantidad maxima de pasajeros que pueden abordar 
     * @param color El color del Transporte
     */
    public Aereos(int altura, String nombre, int capacidadPasajeros, String color) {
        super(nombre, capacidadPasajeros, color);
        this.altura = altura;
    }
    /**
     * Metodo getAltura
     * @return Cantidad de metros que se encuentra sobre el suelo el transporte
     */
    public int getAltura() {
        return altura;
    }
    /**
     * Metodo que permite asignar un valor numerico a la variable altura
     * @param altura 
     */
    public void setAltura(int altura) {
        this.altura = altura;
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
     * @return Muestra en forma de cadena los atributos de la clase Aereos y con el metodo super.toString() los atributos de la clase base MediosDeTransporte
     */
    @Override
    public String toString() {
        return "Aereos{" + "altura=" + altura + "m " + super.toString() + '}';
    }
    
    
}
