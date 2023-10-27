/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Zaid
 */
public class AnimalAereo extends Animal {
    private int numeroAlas;
    /**
     * Constructor vacio de la clase AnimalAereo
     */
    public AnimalAereo() {
    }
    /**
     * Constructor lleno de la clase AnimalAereo
     * @param numeroAlas Numero de alas que tiene el animal
     * @param nombre Nombre del animal
     * @param lugarOrigen Lugar de oriden, nacimiento o donde comunmente suele habitar
     * @param color Color del animal
     */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
     * Metodo getNumeroAlas
     * @return El numero de alas del animal
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }
    /**
     * Metodo que nos permite ingresar la cantidad de alas del animal en la variable numeroAlas
     * @param numeroAlas 
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
     * Metodo que nos indica si el animal esta volando
     */
    public void volar(){
        System.out.println("Estoy volando");
    }
    /**
     * Metodo heradado de la clase base Animal que indica si el animal se encuentra comiendo
     */
    @Override
    public void comer() {
        super.comer(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase AnimalAereo y con el metodo super.toString() los atributos de la clase base Animal
     */
    @Override
    public String toString() {
        return "AnimalAereo{" + "numeroAlas=" + numeroAlas + " " + super.toString() +'}';
    }
}
