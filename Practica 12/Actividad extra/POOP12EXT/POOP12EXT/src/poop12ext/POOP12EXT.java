
package poop12ext;

/**
 *
 * @author Sanchez Ramirez Miguel Angel
 */
public class POOP12EXT {
    
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumbers());
        Thread oddThread = new Thread(new OddNumbers());

        evenThread.start();
        oddThread.start();
    }
    
}
