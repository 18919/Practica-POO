/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
import java.util.logging.Level;
import java.util.logging.Logger;
*/
/**
 *
 * @author poo08alu08
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("#############File###########");
        File archivo = new File("archivo.txt");
        System.out.println("Archivo existe: "+archivo.exists());
        /**
         * El !archivo.exists() devuelve valores booleanos
         * es decir; true or false
         */
        if(!archivo.exists()){
            try {
                /**
                 * En la parte de boolean seCreo necesita un catch pero no se porque 
                 * investigar
                 */
                boolean seCreo= archivo.createNewFile();
                System.out.println("Secreo un archivo: "+seCreo);
                System.out.println("Archivo existe: "+archivo.exists());
            } catch (IOException ex) {
                System.out.println("ex.Mesagge()");
            }
        }
        
        System.out.println("##################FileWriter############");
        
        /**
         * BufferedReader 
         * se esta construyedo la infraestructura
         */
        
        try {
            System.out.println("############ Lectura de teclado #############");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escriba el texto para el archivo");
            String texto;
            texto = br.readLine();
            
            System.out.println("El usuario escribio: "+texto);
            
            System.out.println("######## Escritura del archivo ##############");
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter impresoraDeArchivos = new PrintWriter(bw);
            impresoraDeArchivos.println(texto);
            
            impresoraDeArchivos.close();
            
            System.out.println("######## Lectura del archivo ##########");
            FileReader fr = new FileReader("archivo.txt");
            br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            
            System.out.println("#########StringTokenizer");
            String alumno = "Hector,Jimenez,Maya,319345623,20,8.3";
            System.out.println("Cadena a tokenizar");
            StringTokenizer tokenizador = new StringTokenizer(alumno,",");
            while(tokenizador.hasMoreTokens()){
                System.out.println(tokenizador.nextToken());
            }
            
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
        
        
        System.out.println("############## Actividad extra ############");
        try {
            
            
            System.out.println("######## Escritura del archivo ##############");
            FileWriter fw = new FileWriter("alumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter impresoraDeArchivos = new PrintWriter(bw);
            impresoraDeArchivos.println("Reodrigo,Sanchez,Perez,20,123456,9.9,Copilco 300 Coyoacan");
            impresoraDeArchivos.println("Sandra,Robles,Riba,21,123666,8.9,Copilco 300 Coyoacan");
            impresoraDeArchivos.println("Itzel,Guevara,Torres,19,123456,7.9,Copilco 300 Iztapalapa");
            impresoraDeArchivos.println("Eduardo,Arrayo,Lopez,20,111456,8.9,Copilco 300 Tlalpan");
            impresoraDeArchivos.println("Ramon,Mendoza,Pacheco,21,122456,9.2,Copilco 300 Coyoacan");
            
            
            
            
            impresoraDeArchivos.close();
            
            System.out.println("######## Lectura del archivo ##########");
            FileReader fr = new FileReader("alumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            /*
            System.out.println("#########StringTokenizer");
            String alumno = "Hector,Jimenez,Maya,319345623,20,8.3";
            System.out.println("Cadena a tokenizar");
            StringTokenizer tokenizador = new StringTokenizer(alumno,",");
            while(tokenizador.hasMoreTokens()){
                System.out.println(tokenizador.nextToken());
            }
            */
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
        
    }
    
}
