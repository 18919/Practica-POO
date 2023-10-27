/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Zaid
 */
public class Flauta extends InstrumentoViento {
    /**
     * Constructor vacio de la clase Flauta
     */
    public Flauta() {
    }
    /**
     * Metodo heradado de la clase InstrumentoViento
     * @return El tipo de instrumento que es
     */
    @Override
    public String tipoInstrumento() {
        return "flauta";
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de mensaje el nombre del instrumento
     */
    @Override
    public String toString() {
        return "Flauta{}";
    }
}
