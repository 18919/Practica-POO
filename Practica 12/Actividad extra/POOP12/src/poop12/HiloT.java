
package poop12;

/**
 *
 * @author LENOVO
 */
public class HiloT extends Thread{
    /**
     * Constructor de la clase cuenta que hereda de la clase base Thread que toma como parametro una variable string 
     * @param name Nombre que se le denota al hilo al ser inicializado
     */
    public HiloT(String name) {
        super(name);
    }
    /**
     * Metodo que en cada iteracion marca el valor del acumulador junto con el nombre del hilo que lo este ejecutando
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("Iteracion "+i+" de "+getName());
        }
        System.out.println("Termina el "+getName());
    }
    
    
}
