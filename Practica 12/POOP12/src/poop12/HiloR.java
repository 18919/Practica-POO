
package poop12;

/**
 *
 * @author LENOVO
 */
public class HiloR implements Runnable {
    /**
     * Metodo que en cada iteracion marca el valor del acumulador junto con el nombre del hilo que lo este ejecutando
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("Iteracion "+i+" del "+Thread.currentThread().getName());
        }
        System.out.println("Termina el "+Thread.currentThread().getName());
    }
    
}
