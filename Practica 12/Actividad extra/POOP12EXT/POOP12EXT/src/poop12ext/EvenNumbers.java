
package poop12ext;

/**
 *
 * @author Sanchez Ramirez Miguel Angel
 */
public class EvenNumbers implements Runnable {
    /**
     * Metodo implementado de la interfaz Runnable que imprime numeros pares comprendidos desde el 0 hasta el 500
     */
    @Override
    public void run() {
        for (int i = 0; i <= 500; i += 2) {
            System.out.println("Número par: " + i);
            try {
                Thread.sleep(10); // Solo para dar un poco de espacio entre impresiones
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
