package com.mycompany.proyecto;

/**
 *
 * @author Santiago
 */
public class Materia {
    private String nombre;
    private int clave;
    private int calificacion;
    private boolean aprobada;
    private int creditos;
    /**
     * Constructor vacio de la clase Materia
     */
    public Materia() {
    }
    /**
     * Constructor lleno de la clase Materia 
     * @param nombre Nombre de la materia
     * @param clave La clave de la materia para facilitar su busqueda o uso
     * @param calificacion Calificacion que tiene el alumno en la asignatura
     * @param aprobada Nos indica si el alumno aprobo o reprobo la materia
     * @param creditos Creditos que vale la materia respecto al avance escolar
     */
    public Materia(String nombre, int clave, int calificacion, boolean aprobada, int creditos) {
        this.nombre = nombre;
        this.clave = clave;
        this.calificacion = calificacion;
        this.aprobada = aprobada;
        this.creditos = creditos;
    }
    
    //Getters ------------------------------------------------
    /**
     * Metodo getNombre
     * @return El nombre de la materia
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo getClave
     * @return La clave de la materia 
     */
    public int getClave() {
        return clave;
    }
    /**
     * Metodo getCalificacion
     * @return La calificacion que tiene el alumno en dicha materia
     */
    public int getCalificacion() {
        return calificacion;
    }
    /**
     * Metodo booleano que determina si el alumno paso la materia
     * @return Una variable que nos indica si el alumno aprobo la materia (calificacion >= a 6) a traves de True o si reprobo la materia con False
     */
    public boolean isAprobada() {
        return aprobada;
    }
    /**
     * Metodo getCreditos
     * @return Los creditos que vale la materia
     */
    public int getCreditos() {
        return creditos;
    }
    //Setters ------------------------------------------------
    /**
     * Metodo que permite ingresar un valor a la variable nombre
     * @param nombre El nombre de la materia
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que nos ayuda a modificar al atributo clave
     * @param clave La clave de la materia
     */
    public void setClave(int clave) {
        this.clave = clave;
    }
    /**
     * Metodo que nos deja asignarle un valor al atributo calificacion 
     * @param calificacion Calificacion que obtuvo el alumno en ese semestre
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    /**
     * Metodo que guarda en el atributo aprobada unl valor de una variable booleana 
     * @param aprobada Si el alumno aprobo o reprobo la materia
     */
    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }
    /**
     * Metodo que ingresa la cantidad de creditos que vale la materia
     * @param creditos Creditos que vale la materia 
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    //toString -----------------------------------------------
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase Materia 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Clave: ").append(clave).append("\n");
        sb.append("Calificación: ").append(calificacion).append("\n");
        sb.append("Aprobada: ").append(aprobada ? "Sí" : "No").append("\n");
        sb.append("Créditos: ").append(creditos).append("\n");
        return sb.toString();
    }
     
}
