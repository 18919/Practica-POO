/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Zaid
 */
public class AnimalTerrestre extends Animal{
    private int numeroPatas;
    /**
     * Constructor vacio de la clase AnimalTerrestre
     */
    public AnimalTerrestre() {
    }
    /**
     * Constructor lleno de la clase AnimalTerrestre
     * @param numeroPatas Numero de patas que tiene el animal
     * @param nombre Nombre del animal
     * @param lugarOrigen Lugar de oriden, nacimiento o donde comunmente suele habitar
     * @param color Color del animal
     */
    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }
    /**
     * Metodo que nos permite ingresar la cantidad de patas que tiene el animal
     * @param numeroPatas 
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    /**
     * Metodo getNumeroPatas
     * @return El numero de patas del animal
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }
    /**
     * Metodo que nos indica si el animal se encuetra corriendo
     */
    public void correr(){
        System.out.println("Estoy corriendo");
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
     * @return Muestra en forma de cadena los atributos de la clase AnimalTerrestre y con el metodo super.toString() los atributos de la clase base Animal
     */
    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + " " + super.toString() +'}';
    }
    
    
}
