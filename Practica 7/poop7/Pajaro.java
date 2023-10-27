/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Zaid
 */
public class Pajaro extends AnimalAereo {
    private String tipoPico;
    /**
     * Constructor vacio de la clase Pajaro
     */
    public Pajaro() {
    }
    /**
     * Constructor lleno de la clase Pajaro
     * @param tipoPico El tipo de pico que tiene el pajaro
     * @param numeroAlas Numero de alas que tiene el animal
     * @param nombre Nombre del animal
     * @param lugarOrigen Lugar de oriden, nacimiento o donde comunmente suele habitar
     * @param color Color del animal
     */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }
    /**
     * Metodo getTipoPico
     * @return El tipo de pico que tiene el pajaro
     */
    public String getTipoPico() {
        return tipoPico;
    }
    /**
     * Metodo que nos permite ingresar en forma de mensaje el tipo de pico que tiene el pajaro
     * @param tipoPico 
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    /**
     * Metodo que nos indica la cantidad de ramas que el pajaro ha recolectado
     */
    public void recolectarRamas(){
        System.out.println("He recolectado 12 ramas");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Pajaro y con el metodo super.toString() los atributos de la clase base AnimalAereo
     */
    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + " " + super.toString() +'}';
    }
    
}
