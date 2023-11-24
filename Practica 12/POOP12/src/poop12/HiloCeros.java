
package poop12;

/**
 *
 * @author LENOVO
 */
public class HiloCeros implements Runnable {
    /**
     * Metodo implementado de la interfaz Runnable que imprime la cantidad de veces que le indique el ciclo for el simbolo -o que al juntar cierta cantidad de simbolos representan una cadena
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("0-");
        }
    }
    
}
