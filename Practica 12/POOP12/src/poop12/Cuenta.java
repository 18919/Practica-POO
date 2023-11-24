
package poop12;

/**
 *
 * @author LENOVO
 */
public class Cuenta extends Thread {
    private static long saldo = 0;
    /**
     * Constructor de la clase cuenta que hereda de la clase base Thread que toma como parametro una variable string 
     * @param nombre Nombre que se le denota al hilo al ser inicializado
     */
    public Cuenta (String nombre){
     super(nombre);
    }
    /**
     * Metodo heradado de la clase thread donde dependiendo del nombre del hilo instanciado es si extrae dinero de la cuenta o deposita en ella
     */
    public void run(){
        if (getName().equals("Deposito 1") ||
                getName().equals("Deposito 2")){
            this.depositarDinero(100);
        } else {
          this.extraerDinero(50);
        }
        System.out.println("Termina el "+getName());
    }
    /**
     * Metodo que modifica la cantidad de dinero acorde al valor del parametro recibido donde solamente puede agregar mas valor a la cuenta
     * @param cantidad Cantidad de dinero que se desea ingresar a la cuenta
     */
    public synchronized void depositarDinero(int cantidad){
        System.out.println("El saldo actual es "+saldo);
        saldo += cantidad;
        System.out.println("Se depositaron "+cantidad+" pesos ");
        notifyAll();
    }
    /**
     * Metodo que modifica la cantidad de dinero acorde al valor del parametro recibido donde unicamente puede disminuir la cantidad de dinero de la cuenta
     * @param cantidad Cantidad de dinero que se desea extraer o quitar de la cuenta
     */
    public synchronized void extraerDinero (int cantidad){
                System.out.println("El saldo actual es "+saldo);

        try{
            if (saldo <= 0 ){
                System.out.println(getName()+ "esperar deposito" + "\nSaldo= " +saldo);
                sleep(5000);
            }
       }catch(InterruptedException e){
            System.out.println(e);
       }
        
        saldo -= cantidad;
        System.out.println(getName()+ "extrajo " +cantidad+" pesos.\nSaldo restante = "+saldo);
        notifyAll();
    }
}
