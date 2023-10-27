/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Zaid
 */
public abstract class Poligono {
    /**
     * Constructor vacio de la clase abstracta Poligono
     */
    public Poligono() {
    }
    /**
     * Metodo abstracto area
     * @return 
     */
    public abstract int area();
    /**
     * Metodo abstracto perimetro
     * @return 
     */
    public abstract int perimetro();
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Poligono
     */
    @Override
    public String toString() {
        return "Poligono{}";
    }
}