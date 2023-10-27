/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Zaid
 */
public class Suburbano extends Subterraneo {
    private String ruta,horario;
    /**
     * Constructor vacio de la clase Suburbano
     */
    public Suburbano() {
    }
    /**
     * Constructor lleno de la clase Suburbano
     * @param ruta Indica la ruta que va a seguir 
     * @param horario Muestra la hora a la que se inicia el servicio asi como la hora en que termina
     * @param medio Nos indica en que plataforma o con ayuda de que se traslada el transporte, por ejemplo carretera
     * @param numRuedas Representa el numero de llantas con el que cuenta el transporte
     * @param nombre El nombre del transporte
     * @param capacidadPasajeros El numero maximo de personas que puede llevar
     * @param color El color del transporte
     */
    public Suburbano(String ruta, String horario, String medio, int numRuedas, String nombre, int capacidadPasajeros, String color) {
        super(medio, numRuedas, nombre, capacidadPasajeros, color);
        this.ruta = ruta;
        this.horario = horario;
    }
    /**
     * Metodo getRuta
     * @return La ruta que sigue el Suburbano
     */
    public String getRuta() {
        return ruta;
    }
    /**
     * Metodo que nos permite ingresar a la varible un mensaje que indica la ruta que tomara el suburbano
     * @param ruta 
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    /**
     * Metodo getHorario
     * @return La hora en que inicia el servicio y la hora en que finaliza 
     */
    public String getHorario() {
        return horario;
    }
    /**
     * Metodo que nos permite ingresar el horario de funcionamiento del suburbano
     * @param horario 
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }
    /**
     * Metodo que nos indica que estacion en especifico se encuentra el suburbano en ese momento
     */
    public void estacion(){
        System.out.println("Se encuentra en la estacion Fortuna");
    }
    /**
     * Metodo que simula la accion de dormir que podria hacer un pasajero en el transporte
     */
    public void dormir(){
        System.out.println("zzzzzzzz");
        System.out.println("Nota: Esta dormido en el transporte");
    }
    /**
     * Metodo heradado de la clase base Subterraneo que nos informa desde que estacion inicia el viaje
     */
    @Override
    public void viaje() {
        super.viaje(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return Regresa en forma de mensaje los atributos de la clase suburbano y por medio del metodo super.toString() se imprime el mismo mensaje que la clase de la que herada el metodo
     */
    @Override
    public String toString() {
        return "Suburbano{" + "ruta=" + ruta + ", horario=" + horario + " " + super.toString() + '}';
    }
    
}
