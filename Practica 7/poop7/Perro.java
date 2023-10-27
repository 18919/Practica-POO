/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Zaid
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;
    /**
     * Constructor vacio de la clase Perro
     */
    public Perro() {
    }
    /**
     * Constructor lleno de la clase Perro
     * @param colorCollar El color del collar del perro
     * @param numeroPatas Numero de patas que tiene el animal
     * @param nombre Nombre del animal
     * @param lugarOrigen Lugar de oriden, nacimiento o donde comunmente suele habitar
     * @param color Color del animal
     */
    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }
    
    /**
     * Metodo getColorCollar
     * @return El color del collar del perro
     */
    
    public String getColorCollar() {
        return colorCollar;
    }
    /**
     * Metodo que nos apoya en ingresar el color del collar del perro
     * @param colorCollar 
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    /**
     * Metodo que nos indica si el perro esta haciendo trucos
     */
    public void hacerTrucos(){
        System.out.println("Estoy haciendo trucos");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Perro y con el metodo super.toString() los atributos de la clase base AnimalTerrestre
     */
    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar + " " + super.toString()+'}';
    }
}
