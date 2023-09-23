/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author Cano Vazquez Axel Zaid
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto = new Punto();
        punto.imprimePunto();
        Punto punto2 = new Punto(3,5);
        punto2.imprimePunto();
        System.out.println(punto);
        Perro perro = new Perro("Zeus","Chihuahua","Gris",8);
        System.out.println(perro);
        perro.corre(55);
        perro.sentado();
        perro.duerme(9000);
        perro.ladra(10);
        Coche ferarri = new Coche("Nissan","Tsuru","Rojo","8 cilindros","Tanque lleno");
        System.out.println(ferarri);
        ferarri.encender();
        ferarri.movimiento();
        ferarri.direccion("derecha");
        ferarri.frenar();
        ferarri.apagar();
        ferarri.avanzar(70);
        
    }
    
}
