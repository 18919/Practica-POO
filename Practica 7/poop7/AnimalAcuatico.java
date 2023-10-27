/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author poo08alu08
 */
public class AnimalAcuatico extends Animal{
    private int numeroAletas;
    /**
     * Constructor vacio de la clase AnimalAcuatico
     */
    public AnimalAcuatico() {
    }
    /**
     * Constructor lleno de la clase AnimalAcuatico
     * @param numeroAletas El numero de aletas que tiene el animal
     * @param nombre Nombre del animal
     * @param lugarOrigen Lugar de oriden, nacimiento o donde comunmente suele habitar
     * @param color Color del animal
     */
    public AnimalAcuatico(int numeroAletas,String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
        
    }
    /**
     * Metodo que nos permite ingresar la cantidad de aletas que tiene el animal
     * @param numeroAletas 
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    /**
     * Metodo getNumeroAletas
     * @return El numero de aletas del animal
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }
    /**
     * Metodo que imprime un mensaje indicando si el animal se encuentra nadando
     */
    public void nadar(){
            System.out.println("Estoy nadando");
    }
    /**
     *
     * Metodo heradado de la clase base Animal que indica si el animal se encuentra comiendo
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo peces");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase AnimalAcuatico y con el metodo super.toString() los atributos de la clase base Animal
     */
    @Override
    public String toString() {
        return "AnimalAcuatico{" + "numeroAletas=" + numeroAletas + " " + super.toString() +'}';
    }
    
    
}
