/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author poo08alu08
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        //Manejo de excepciones
        /*
        Como el arreglo solamente contiene 3 mensajes y nosotros en el for ponemos que haga la iteracion
        hasta el 3 sin embargo los elementos del arreglo se cuentan desde el 0 entonces el ultimo 
        elemento tiene indice igual a 2, es decir, estamos pidiendo un elemento que no existe ya que no
        hay nada despues del elemento 2.
        */
        try{
            String mensajes[] = {"Primero","Segundo","Tercero"};
            for (int i = 0; i <= 3; i++) {
                System.out.println(mensajes[i]);

            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera del rango del arreglo");
            System.out.println(e.getMessage());
        }
        //Identificar el tipo de error
        System.out.println("\n\nHola mundo 2");
        /*double x;
        x = 0/0;
        System.out.println(x);
        */
        try{
            float equis = 0/0;
            System.out.println("Equis = "+ equis);
        }catch(ArithmeticException e){
            System.out.println("Error: division entre cero");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("A pesar de todo, se ejecuta el bloque finally\n");
        }
        
        try{
            float equis = 0/0;
            System.out.println("Equis = "+ equis);
        }catch(ArithmeticException e){
            System.out.println("Error: division entre cero");
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera del rango del arreglo");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Error: excepcion general");
        }
        
        try{
            float equis = 0/0;
            System.out.println("Equis = "+ equis);
        }catch(ArithmeticException e){
            System.out.println("Error: division entre cero");
            System.out.println(e.getMessage());
            /**
             *Es lo mismo que el e.getMessage pero al momento de declarar ambas es 
             * redundante por eso se comenta esa linea
             * e.printStackTrace();
             */
            
        }
    
        
        System.out.println("\n\nHola mundo 3");
        /**
         * 
         */
        try{
            double division = miMetodo(4,6);
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("Excepcion aritmetica arrojada");
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n\nHola mundo 4");
        CuentaBancaria cuenta = new CuentaBancaria();
        try{
            cuenta.depositar(2000);
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.depositar(200);
            cuenta.retirar(100);
        }catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
        
    }
    /**
     * Metodo estatico que sirve para manejar el error al dividir un numero entre cero
     * @param a el numerador de la division
     * @param b el denominador de la division
     * @return el resultado de la division 
     * @throws ArithmeticException error que aparece cuando se divide un numero entre cero
     */
    public static double miMetodo(double a, double b)throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException();
        }
        double c= a/b;
        return c;
    }
    
}
