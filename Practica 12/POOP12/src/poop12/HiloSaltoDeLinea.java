/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author LENOVO
 */
public class HiloSaltoDeLinea implements Runnable{
    /**
     *Metodo implementado de la interfaz Runnable que imprime espacio vacios o saltos de linea la cantidad de veces que este marcado en el ciclo for 
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.print(" ");
        }
    }
    
}
