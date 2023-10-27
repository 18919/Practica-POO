/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop8;

/**
 *
 * @author Zaid
 */
public interface InstrumentoMusical {
    //Metodos objetivos
    /**
     * Metodo tocar de la interfaz InstrumentoMusical
     */
    void tocar();
    /**
     * Metodo afinar de la interfaz InstrumentoMusical
     */
    void afinar();
    /**
     * Metodo que nos indica el tipo de instrumento que es apartir de una variable String
     * @return El tipo de instrumento en el que se debe de clasificar
     */
    String tipoInstrumento();
}
