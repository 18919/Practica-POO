
package poop12ext;

/**
 *
 * @author LENOVO
 */
public class OddNumbers implements Runnable {
    /**
     * Metodo implementado de la interfaz Runnable que imprime numeros impares comprendidos desde el 1 hasta el 500
     */
    @Override
    public void run() {
        for (int i = 1; i <= 500; i += 2) {
            System.out.println("Número impar: " + i);
            try {
                Thread.sleep(10); // Solo para dar un poco de espacio entre impresiones
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
