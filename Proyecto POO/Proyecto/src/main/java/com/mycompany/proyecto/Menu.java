/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Santiago
 */
public class Menu {
    /**
     * Metodo estatico de la clase Menu que muestra el menú general de inicio en la consola.
     * Este método proporciona las opciones disponibles para el manejo o creacion de los registros de los alumnos
     */
    
    public static void menuInicio(){
        
        System.out.println("---------------------");
        System.out.println("|     BIENVENIDO    |");
        System.out.println("---------------------");
        
        System.out.println("Menú de inicio");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Generar Alumno(s).");
        System.out.println("2. Gestionar cuenta de Alumno.");
        System.out.println("3. Mostrar lista de alumnos.");
        System.out.println("4. Generar documento csv.");
        System.out.println("5. Salir.");
        
    }
    /**
     * Metodo estatico de la clase Menu que despliega un menu sobre las posibles acciones que se pueden realizar al querer gestionar la cuenta de algun alumno en especifico
     */
    public static void menuGestorAlumno(){
        
        System.out.println("----------------------------------------");
        System.out.println("|      GESTIONAR CUENTA DE ALUMNO      |");
        System.out.println("----------------------------------------");

        System.out.println("1. Eliminar alumno.");
        System.out.println("2. Modificar historial académico.");
        System.out.println("3. Volver.");
        
    }
    
}
