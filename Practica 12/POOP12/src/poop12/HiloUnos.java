/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author LENOVO
 */
public class HiloUnos implements Runnable {
    /**
     * Metodo implementado de la interfaz Runnable que imprime la cantidad de veces que le indique el ciclo for el simbolo 1- que al juntar cierta cantidad de simbolos representan una cadena
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("1-");
    }
    }
    
}
