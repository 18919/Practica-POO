
package poop12;

/**
 *
 * @author LENOVO
 */
public class POOP12 {
    
    
    public static void main(String[] args){
        /**
         * @param args the command line arguments
         */
        
        HiloT hilo1 = new HiloT("Primer Hilo");
        hilo1.start();
        new HiloT("Segundo Hilo").start();
        new Thread(new HiloR(), "Tercer Hilo").start();
        for (int i = 0; i<10; i++){
            System.out.println("Iteracion "+i+" del main ");
        }
        System.out.println("Termina el  Main ");
        
        new Thread(new HiloCeros(), "Hilos Ceros").start();
        new Thread(new HiloUnos(), "Hilos Uno").start();
        new Thread(new HiloSaltoDeLinea(), "Hilos Salto de Linea").start();
        
        /*
        new Cuenta("Extraer 1").start();
        new Cuenta("Extraer 2").start();
        new Cuenta("Depositar 1").start();
        new Cuenta("Depositar 2").start();
        System.out.println("Termina el hilo principal");
        */

    }
    
}
