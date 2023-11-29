package com.mycompany.proyecto;

import java.util.List;

/**
 *
 * @author Santiago
 */
public class Alumno {
    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private int semestre;
    private double numInscripcion;
    private String numeroCuenta;
    private String direccion;
    private List<Materia> materiasCursadas;
    
    /**
     * Constructor vacio de la clase Alumno
     */
    public Alumno() {
    }
    /**
     * Construcor lleno de la clase Alumno
     * @param nombre Nombre del alumno
     * @param apellidoPaterno Primero apellido del alumno
     * @param apellidoMaterno Segundo apellido 
     * @param edad Edad del alumno 
     * @param semestre Semestre que acaba de cursar 
     * @param numInscripcion El numero de inscripcion del alumno que le indica el turno correspondiente
     * @param numeroCuenta Numero de cuenta del alumno
     * @param direccion Direccion del hogar del alumno
     * @param materiasCursadas Lista de materias que ha cursado el alumno
     */
    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, int semestre, int numInscripcion, String numeroCuenta, String direccion, List<Materia> materiasCursadas) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.semestre = semestre;
        this.numInscripcion = numInscripcion;
        this.numeroCuenta = numeroCuenta;
        this.direccion = direccion;
        this.materiasCursadas = materiasCursadas;
    }

    //Getters ------------------------------------------------
    /**
     * Metodo getNombre
     * @return Nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo getApellidoPaterno
     * @return Primer apellido del alumno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    /**
     * Metodo getApellidoMaterno
     * @return Segundo apellido del alumno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    /**
     * Metodo getEdad
     * @return La edad del alumno
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Metodo getSemestre
     * @return El ultimo semestre cursado por el alumno
     */
    public int getSemestre() {
        return semestre;
    }
    /**
     * Metodo getNumInscripcion
     * @return El numero de inscripcion del alumno
     */
    public double getNumInscripcion() {
        return numInscripcion;
    }
    /**
     * Metodo getNumeroCuenta
     * @return Numero de cuenta del alumno
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * Metodo getDireccion
     * @return Direccion de la vivienda del alumno
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Metodo getMateriasCursadas
     * @return La lista de materias que ha llevado el alumno
     */
    public List<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }
    
    //Setters ------------------------------------------------
    /**
     * Metodo que establece el nombre del alumno
     * @param nombre Nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que ingresa el primer apellido del alumno
     * @param apellidoPaterno Primer apellido del alumno
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    /**
     * Metodo que asigna el segundo apellido del alumno
     * @param apellidoMaterno Segundo apellido del alumno
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    /**
     * Metodo que asigna la edad del alumno 
     * @param edad Edad del alumno
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Metodo que nos permite ingresar el ultimo semestre cursado del alumno
     * @param semestre 
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    /**
     * Metodo que nos ayuda en la asignacion del numero de inscripcion del alumno
     * @param numInscripcion Numero de inscripcion del alumno
     */
    public void setNumInscripcion(double numInscripcion) {
        this.numInscripcion = numInscripcion;
    }
    /**
     * Metodo que nos deja ingresar el numero de cuenta del alumno
     * @param numeroCuenta Numero de cuenta del alumno
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    /**
     * Metodo en el cual se ingresa la direccion del alumno
     * @param direccion Direccion del alumno
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Metodo que contiene la lista de todas las materias cursadas por el alumno
     * @param materiasCursadas Lista de materias cursadas por el alumno
     */
    public void setMateriasCursadas(List<Materia> materiasCursadas) {
        this.materiasCursadas = materiasCursadas;
    }
    
    //toString -----------------------------------------------
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos Nombre, Edad, Semestre, Numero de inscripcion, Numero de cuenta y Direccion de la clase Alumnos 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append(" ").append(apellidoPaterno).append(" ").append(apellidoMaterno).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Semestre: ").append(semestre).append("\n");
        sb.append("Número de inscripción: ").append(numInscripcion).append("\n");
        sb.append("Número de cuenta: ").append(numeroCuenta).append("\n");
        sb.append("Dirección: ").append(direccion).append("\n");

        return sb.toString();
    }
}

