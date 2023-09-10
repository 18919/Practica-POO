/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
/**
 *
 * @author alumno
 */
public class POOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("################arreglos############");
        int []nums;
        int[] nums1;
        int [] nums2;
        int nums3[];
        int[] nums4 = {1,2,3,4};
        System.out.println("###########arreglos#############");
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }
        System.out.println("#############for each##########");
        for (int i : nums4) {
            System.out.println(i);
        }
        System.out.println("##############cocatenar################");
        String s = new String("Hola Mundo");
        String s1 = "Hola mundo";
        System.out.println(s);
        System.out.println(s1);
        String nombre = "Zaid";
        String apellido = "Cano";
        String nombreCompleto = nombre+" "+apellido;
        System.out.println(nombreCompleto);
        System.out.println("############### operador punto###########");
        System.out.println("num elementos del arreglo: "+nums4.length);
        System.out.println("num elementos del nombre: "+nombre.length());
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombreCompleto);
        System.out.println("################### Wrappers y Autoboxing ##################");
        int a = 3;
        Integer k = new Integer(50);
        Integer l = 22;
        int r = l;
        int b = 7;
        float c = b; // ->Casteo
        Integer rr = r;
        String s3 = rr.toString();
        System.out.println(s3);
        String s4 = r + "";// ->Parseo
        //en este caso es el operador mas porque no hace una suma de enteros
        System.out.println(s4);
        System.out.println(s4.length());
        
        //Parseo (to parse)
        //Casteo (to cast)
        
        System.out.println("#############Colecciones############");
        //Primer coleccion 
        System.out.println("############ arrayList##############");
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        //Va a almacenar enteros wrappers
        miArrayList.add(b);
        miArrayList.add(9);
        System.out.println(miArrayList.size());
        //Investigar porque uso el .size
        System.out.println(miArrayList.get(0));
        miArrayList.add(0, 20);
        System.out.println("***");
        for (Integer integer : miArrayList) {
            System.out.println(integer);
            
        }
        System.out.println("############## Hashtable ################");
        Hashtable<Integer,String> agenda = new Hashtable<Integer,String>();
        agenda.put(k, "Pedro");
        agenda.put(55667788, "Antonio");
        agenda.put(552241532, "Isabela");
        agenda.put(532133121, "Brayan");
        System.out.println(agenda.size());
        //el set no tiene orden de insercion
        System.out.println("***");
        for (String valor : agenda.values()) {
            System.out.println(valor);
            
        }
        for (Integer clave : agenda.keySet()) {
            System.out.println(clave);
            
        }
        System.out.println("############ Enumeracion ############");
        Integer clave;
        String valor;
        Enumeration<Integer> llaves = agenda.keys();//guarda los numeros telefonicos
        while(llaves.hasMoreElements()){
            clave = llaves.nextElement();
            valor = agenda.get(clave);
            System.out.println("clave: "+clave+" valor: "+ valor);
        }
        
        System.out.println("################# math ##############");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80, 7));
        System.out.println("################## Date ################");
        Date hoy = new Date();
        System.out.println(hoy);
        
    }
    
}
