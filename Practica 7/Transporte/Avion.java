/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Zaid
 */
public class Avion extends Aereos {
    private String destino;
    /**
     * Construcor vacio de la clase Avion
     */
    public Avion() {
    }
    /**
     * Constructor lleno de la clase Avion
     * @param destino El pais desde que inicia el viaje hasta el pais que se desea llegar
     * @param altura Numeros de metros a los que se encuentra volando desde el suelo el transporte
     * @param nombre Representa el nombre del medio de transporte
     * @param capacidadPasajeros La cantidad maxima de pasajeros que pueden abordar 
     * @param color El color del Transporte
     */
    public Avion(String destino, int altura, String nombre, int capacidadPasajeros, String color) {
        super(altura, nombre, capacidadPasajeros, color);
        this.destino = destino;
    }
    /**
     * Metodo getDestino
     * @return Desde donde parte el avion hasta donde se dirige
     */
    public String getDestino() {
        return destino;
    }
    /**
     * Metodo que nos apoya en la asignacion del mensaje sobre la informacion del viaje del avion a la variable destino
     * @param destino 
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }
    /**
     * Metodo que nos muestra la cantidad de tiempo que falta para poder estar al lugar deseado
     */
    public void duracion(){
        System.out.println("Llegaremos a nuestro destino dentro de 20 minutos");
    }
    /**
     * Metodo que imprime un mensaje en el que una azafata le pregunta a un usuario si desea un aperitivo y en dado caso cual
     */
    public void aperitivo(){
        System.out.println("Desea un aperitivo??? Tenemos nueces o arandanos");
        System.out.println("Arandanos porfavor");
    }
    /**
     * Metodo en el que la azafata pregunta si todo esta en orden o si el usuario requiere ayuda en algo
     */
    public void azafata(){
        System.out.println("Se encuentra todo bien o hay algo en lo que lo pueda ayudar?");
        System.out.println("Todo bien por el momento, gracias");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Avion y con el metodo super.toString() los atributos de la clase padre Aereos 
     */
    @Override
    public String toString() {
        return "Avion{" + "destino=" + destino + " " + super.toString() +'}';
    }
    
    
}
