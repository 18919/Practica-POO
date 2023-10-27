/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author poo08alu08
 */
public class Ballena extends AnimalAcuatico{
    private int largo;
    /**
     * Constructor vacio de la clase Ballena
     */
    public Ballena() {
    }
    /**
     * Constructor lleno de la clase Ballena 
     * @param largo Representa la longitud o la cantida de metros que mide la ballena 
     * @param numeroAletas El numero de aletas que tiene el animal
     * @param nombre Nombre del animal
     * @param lugarOrigen Lugar de oriden, nacimiento o donde comunmente suele habitar
     * @param color Color del animal
     */
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }
    /**
     * Metodo getLargo
     * @return La longitud de la Ballena
     */
    public int getLargo() {
        return largo;
    }
    /**
     * Metodo que nos apoya en la asignacion de la cantidad de metros que mide la ballena
     * @param largo 
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    /**
     * Metodo que imprime un mensaje en el cual dice que la Ballena esta peleando con pinocho
     */
    public void pelearConPinocho(){
        System.out.println("Estoy peleando contra Pinocho");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Ballena y con el metodo super.toString() los atributos de la clase base AnimalAcuatico
     */
    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + " " + super.toString()+'}';
    }
    
}
