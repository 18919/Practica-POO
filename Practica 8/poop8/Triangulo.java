/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Zaid
 */
public class Triangulo extends Poligono {
    private int alfa;
    private int beta;
    private int gamma;
    private float a;
    private float b;
    private float c;
    private float base;
    private float altura;
    /**
     * Constructor vacio de la clase Triangulo
     */
    public Triangulo() {
    }
    /**
     * Constructor lleno de la clase Triangulo
     * @param alfa Angulo interno del triangulo
     * @param beta Angulo interno del triangulo
     * @param gamma Angulo interno del triangulo
     * @param a Lado del triangulo
     * @param b Lado del triangulo
     * @param c Lado del triangulo
     * @param base Valor de la base del triangulo
     * @param altura Valor de la altura del triangulo
     */
    public Triangulo(int alfa, int beta, int gamma, float a, float b, float c, float base, float altura) {
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
     * @return Angulo interno del triangulo
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
     * @return Angulo interno del triangulo
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
     * @return Angulo interno del triangulo
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
     * @return Un lado del triangulo
     */
    public float getA() {
        return this.a;
    }
    /**
     * Metodo que nos permite ingresar el valor de un lado del triangulo
     * @param a 
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * Metodo getB
     * @return Un lado del triangulo
     */
    public float getB() {
        return this.b;
    }
    /**
     * Metodo que nos ayuda a asignar a una variable el valor de un lado del triangulo
     * @param b 
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * Metodo getC
     * @return Un lado del triangulo
     */
    public float getC() {
        return this.c;
    }
    /**
     * Metod que nos permite ingresar un valor de un lado del triangulo
     * @param c 
     */
    public void setC(float c) {
        this.c = c;
    }
    /**
     * Metodo getBase
     * @return Valor de la base del triangulo
     */
    public float getBase() {
        return this.base;
    }
    /**
     * Metodo que nos permite ingresar el valor de la base del triangulo
     * @param base 
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Metodo getAltura
     * @return Valor de la altura del triangulo
     */
    public float getAltura() {
        return this.altura;
    }
    /**
     * Metodo que nos ayuda en la asignacion del valor de la altura del triangulo
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Metodo heradado de la clase abstracta Poligono que calcula el area del triangulo
     * @return area del triangulo
     */
    @Override
    public int area() {
        return (int)(this.base * this.altura) / 2;
    }
    /**
     * Metodo heradado de la clase abstracta Poligono que calcula el perimetro del triangulo
     * @return perimetro del triangulo
     */
    @Override
    public int perimetro() {
        return (int)(this.a + this.b + this.c);
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Triangulo y con el metodo super.toString() los atributos de la clase base Poligono
     */
    @Override
    public String toString() {
        return super.toString() + "Triangulo{alfa=" + this.alfa + ", beta=" + this.beta + ", gamma=" + this.gamma + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", base=" + this.base + ", altura=" + this.altura + "}";
    }
}
