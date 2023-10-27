/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Zaid
 */
public class Combi extends Supraterreno {
    public int tarifa;
    /**
     * Constructor vacio de la clase Combi
     */
    public Combi() {
    }
    /**
     * Constructor lleno de la clase Combi
     * @param tarifa Es la cantidad de dinero que se cobra por el servicio
     * @param medio Nos indica en que plataforma o con ayuda de que se traslada el transporte, por ejemplo carretera
     * @param numRuedas Representa el numero de llantas con el que cuenta el transporte
     * @param nombre El nombre del transporte
     * @param capacidadPasajeros El numero maximo de personas que puede llevar
     * @param color El color del transporte
     */
    public Combi(int tarifa, String medio, int numRuedas, String nombre, int capacidadPasajeros, String color) {
        super(medio, numRuedas, nombre, capacidadPasajeros, color);
        this.tarifa = tarifa;
    }
    /**
     * Metodo getTarifa
     * @return La cantidad de dinero que se cobra por usar el transporte
     */
    public int getTarifa() {
        return tarifa;
    }
    /**
     * Metodo que nos facilita la asignacion a la variable tarifa de la cantidad de dinero que se cobra por usar el transporte
     * @param tarifa 
     */
    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    /**
     * Metodo que simula la situacion en la que un usuario esta lejos del conductor por lo que le pide a los demas usuarios si podrian ayudarlo a pasar el dinero de su pasaje
     */
    public void pasaje(){
        System.out.println("¿Podria pasar el dinero porfavor?");
        System.out.println("Le pasa el pasaje*");
    }
    /**
     * Metodo que nos muestra una cancion que el conductor puso durante el viaje
     */
    public void musica(){
        System.out.println("Suena Tus jefes no me quieren de Grupo Ensamble*");
    }
    /**
     * Metodo que imprime un mensaje donde el usuario pregunta el conductor podria detenerse en un punto especifico del camino para poder bajar del vehiculo
     */
    public void bajada(){
        System.out.println("Puede parar en el puente amarillo?");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Combi y con el metodo super.toString() los atributos de la clase padre Supraterreno
     */
    @Override
    public String toString() {
        return "Combi{" + "tarifa=" + tarifa + " " + super.toString() + '}';
    }
    
    
}
