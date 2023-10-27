/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author poo08alu08
 */
public class Animal extends Object{
    private String nombre, lugarOrigen,color;
    /**
     * Constructor vacio de la clase Animal
     */
    public Animal() {
    }
    /**
     * Constructor lleno de la clase Animal
     * @param nombre Nombre del animal
     * @param lugarOrigen Lugar de oriden, nacimiento o donde comunmente suele habitar
     * @param color Color del animal
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * Metodo getNombre
     * @return El nombre del animal
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo getLugarOrigen
     * @return El lugar de nacimiento u origen del animal
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
     * Metodo getColor
     * @return El color del animal
     */
    public String getColor() {
        return color;
    }
    /**
     * Metodo que nos permite asignar el nombre del animal
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que nos apoya en ingresar el lugar de origen del animal
     * @param lugarOrigen 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    /**
     * Metodo que nos ayuda en la asignacion del color del animal
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Metodo que recibe una cadena de texto en el que se indica el sonido que emite el animal y lo imprime
     * @param sonido 
     */
    public void hacersonido(String sonido){
        System.out.println("Sonido:"+sonido);
    }
    /**
     * Metodo que da a entender si el animal esta comiendo
     */
    public void comer(){
        System.out.println("Estoy comiendo....");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Animal
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
    
}
