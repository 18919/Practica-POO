/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author poo08alu08
 */
public class CuentaBancaria {
    private double saldo;
    /**
     * Constructor vacio de la clase CuentaBancaria
     */
    public CuentaBancaria() {
        saldo=0;
    }
    /**
     * Constructor lleno de la clase CuentaBancaria
     * @param saldo 
     */
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Metodo que ingresa a la cuenta bancaria la cantidad que el usuario desea
     * @param monto cantidad de dinero que se ingresa a la cuenta
     */
    public void depositar(double monto){
        System.out.println("Depositando "+monto);
        saldo += monto;
    }
    /**
     * Metodo que nos permite retirar cierta cantidad de dinero que hay en la cuenta
     * @param monto cantidad de dinero que se quiere sacar de la cuenta
     * @throws SaldoInsuficienteException el tipo de error que se desea identificar al retirar mas dinero del que posee la cuenta
     */
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando "+monto);
        if(saldo < monto){
            throw new SaldoInsuficienteException();
        }
        else{
            saldo -= monto;
        }
    }
    /**
     * Metodo getSaldo
     * @return la cantidad de dinero que tiene la cuenta
     */
    public double getSaldo() {
        return saldo;
    }
    
    
    
    
    
}
