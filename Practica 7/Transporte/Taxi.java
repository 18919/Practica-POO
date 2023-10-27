/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Zaid
 */
public class Taxi extends Supraterreno {
    public int tarifa,tarpormin; 
    /**
     * Construcor vacio de la clase Taxi
     */
    public Taxi() {
    }
    /**
     * Constructor lleno de la clase Taxi
     * @param tarifa Suma de dinero inicial que se cobra solamente por subir
     * @param tarpormin Representa la cantidad de dinero que se cobra por minuto desde que se subio al transporte
     * @param medio Nos indica en que plataforma o con ayuda de que se traslada el transporte, por ejemplo carretera
     * @param numRuedas Representa el numero de llantas con el que cuenta el transporte
     * @param nombre El nombre del transporte
     * @param capacidadPasajeros El numero maximo de personas que puede llevar
     * @param color El color del transporte 
     */
    public Taxi(int tarifa, int tarpormin,String medio, int numRuedas, String nombre, int capacidadPasajeros, String color) {
        super(medio, numRuedas, nombre, capacidadPasajeros, color);
        this.tarifa = tarifa;
        this.tarpormin = tarpormin;
    }
    /**
     * Metodo getTarifa
     * @return Monto inicial que se cobra por subir al transporte
     */
    public int getTarifa() {
        return tarifa;
    }
    /**
     * Metodo en el cual podemos asignar la cantidad de valor de la tarifa que se cobra
     * @param tarifa 
     */
    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    /**
     * Metodo que presenta las frases que comunmente los conductores suelen decir
     */
    public void saludo(){
        System.out.println("Buenas tardes joven, A donde se dirige?");
        System.out.println("Que cree joven......\nNo voy para alla");
    }
    /**
     * Metodo que muestra un fragmento de la conversacion que tiene el usuario con el conductor
     */
    public void platica_frase(){
        System.out.println("Animo joven recuerde que....\nLa vida es como andar en bicicleta. Para mantener el equilibrio, debes seguir adelante.");
    }
    /**
     * Metodo donde nos muestra la opinion del conductor respecto al clima 
     */
    public void clima(){
        System.out.println("Como ha sentido el clima ultimamente???");
        System.out.println("Frio verdad? La verdad a mi no me agrada mucho este clima");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Taxi y con el metodo super.toString() los atributos de la clase padre Supraterreno
     */
    @Override
    public String toString() {
        return "Taxi{" + "tarifa incial=" + tarifa + ", tarifa por minuto=" + tarpormin + " " + super.toString() + '}';
    }

    
    
    
}
