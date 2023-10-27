/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Zaid
 */
public class Cuadrilatero extends Poligono {
    private int alfa;
    private int beta;
    private int gamma;
    private float a;
    private float b;
    private float c;
    private float base;
    private float altura;
    /**
     * Constructor vacio de la clase Cuadrilatero
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor lleno de la clase Cuadrilatero
     * @param alfa Angulo interno del cuadrilatero
     * @param beta Angulo interno del cuadrilatero
     * @param gamma Angulo interno del cuadrilatero
     * @param a Lado del cuadrilatero
     * @param b Lado del cuadrilatero
     * @param c Lado del cuadrilatero
     * @param base Valor de la base del cuadrilatero
     * @param altura Valor de la altura del cuadrilatero
     */
    public Cuadrilatero(int alfa, int beta, int gamma, float a, float b, float c, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }
    /**
     * Metodo getAlfa
     * @return Angulo interno del cuadrilatero
     */
    public int getAlfa() {
        return this.alfa;
    }
    /**
     * Metodo que nos permite ingresar el valor del angulo alfa
     * @param alfa 
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    /**
     * Metodo getBeta
     * @return Angulo interno del cuadrilatero
     */
    public int getBeta() {
        return this.beta;
    }
    /**
     * Metodo que nos permite ingresar el valor del angulo beta
     * @param beta 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Metodo getGamma
     * @return Angulo interno del cuadrilatero
     */
    public int getGamma() {
        return this.gamma;
    }
    /**
     * Metodo que nos permite ingresar el valor del angulo gamma
     * @param gamma 
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
    /**
     * Metodo getA
     * @return Un lado del cuadrilatero
     */
    public float getA() {
        return this.a;
    }
    /**
     * Metodo que nos permite ingresar el valor de un lado del cuadrilatero
     * @param a 
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * Metodo getB
     * @return Un lado del cuadrilatero
     */
    public float getB() {
        return this.b;
    }
    /**
     * Metodo que nos ayuda a asignar a una variable el valor de un lado del cuadrilatero
     * @param b 
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * Metodo getC
     * @return Un lado del cuadrilatero
     */
    public float getC() {
        return this.c;
    }
    /**
     * Metod que nos permite ingresar un valor de un lado del cuadrilatero
     * @param c 
     */
    public void setC(float c) {
        this.c = c;
    }
    /**
     * Metodo getBase
     * @return Valor de la base del cuadrilatero
     */
    public float getBase() {
        return this.base;
    }
    /**
     * Metodo que nos permite ingresar el valor de la base del cuadrilatero
     * @param base 
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Metodo getAltura
     * @return Valor de la altura del cuadrilatero
     */
    public float getAltura() {
        return this.altura;
    }
    /**
     * Metodo que nos ayuda en la asignacion del valor de la altura del cuadrilatero
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Metodo heradado de la clase abstracta Poligono que calcula el area del cuadrilatero
     * @return area del cuadrilatero
     */
    @Override
    public int area() {
        return (int)(this.base * this.altura);
    }
    /**
     * Metodo heradado de la clase abstracta Poligono que calcula el perimetro del cuadrilatero
     * @return perimetro del cuadrilatero
     */
    @Override
    public int perimetro() {
        return (int)(2.0F * this.a + 2.0F * this.b);
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Cuadrilatero y con el metodo super.toString() los atributos de la clase base Poligono
     */
    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{alfa=" + this.alfa + ", beta=" + this.beta + ", gamma=" + this.gamma + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", base=" + this.base + ", altura=" + this.altura + "}";
    }
}
