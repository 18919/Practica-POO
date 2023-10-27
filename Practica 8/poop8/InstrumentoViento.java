/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Zaid
 */
public class InstrumentoViento implements InstrumentoMusical {
    /**
     * Constructor vacio de la clase InstrumentoViento
     */
    public InstrumentoViento() {
    }
    /**
     * Metodo implementado de la interfaz InstrumentoMusical
     * @return EL tipo de instrumento que es
     */
    @Override
    public String tipoInstrumento() {
        return "InstrumentoViento";
    }
    /**
     * Metodo implementado de la interfaz InstrumentoMusical que nos indica si se esta tocando el instrumento
     */
    @Override
    public void tocar() {
        System.out.println("Tocar instrumento de viento");
    }
    /**
     * Metodo implementado de la interfaz IntrumentoMusical que nos muestra a traves de un mensaje si se esta afinando el instrumento
     */
    @Override
    public void afinar() {
        System.out.println("Afinar instrumento de viento");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos  
     * @return Muestra en forma de cadena el tipo de instrumento en el que se clasifica
     */
    @Override
    public String toString() {
        return "InstrumentoViento{}";
    }
}
