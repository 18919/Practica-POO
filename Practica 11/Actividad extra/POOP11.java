
package poop11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


/**
 *
 * @author Sanchez Ramirez Miguel Angel
 */
public class POOP11 {
    
    public static void main(String[] args) {
        // Crear 10 objetos Alumno
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan", "González", "Pérez", "318073789", 20));
        alumnos.add(new Alumno("Mario", "Sanchez", "García", "319077669", 20));
        alumnos.add(new Alumno("María", "López", "García", "319088931", 21));
        alumnos.add(new Alumno("Adolfo", "Marin", "Perez", "321203456", 19));
        alumnos.add(new Alumno("Leonardo", "Martinez", "Ramirez", "318089435", 21));
        alumnos.add(new Alumno("Ana", "Razo", "Huerta", "317890902", 23));
        alumnos.add(new Alumno("Sofia", "Delgado", "Lopez", "319045345", 20));
        alumnos.add(new Alumno("Esmeralda", "Ramirez", "Campos", "321334059", 20));
        alumnos.add(new Alumno("Brayan", "Sanhcez", "Negrete", "319003456", 21));
        alumnos.add(new Alumno("Alejandro", "Mendez", "Mendoza", "318045567", 23));
        

        // Escribir en un archivo CSV
        String nombreArchivo = "alumnos.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            writer.println("Nombre,ApPat,ApMat,NumCuenta,Edad");
            for (Alumno alumno : alumnos) {
                writer.println(alumno.nombre + "," + alumno.apellidoPaterno + "," + alumno.apellidoMaterno + "," + alumno.numCuenta + "," + alumno.edad);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer el archivo CSV y crear nuevos objetos Alumno
        List<Alumno> nuevosAlumnos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            // Saltar la primera línea que contiene los encabezados
            br.readLine();
            while ((linea = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(linea, ",");
                String nombre = tokenizer.nextToken();
                String apellidoPaterno = tokenizer.nextToken();
                String apellidoMaterno = tokenizer.nextToken();
                String numCuenta = tokenizer.nextToken();
                int edad = Integer.parseInt(tokenizer.nextToken());
                nuevosAlumnos.add(new Alumno(nombre, apellidoPaterno, apellidoMaterno, numCuenta, edad));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Mostrar los nuevos objetos Alumno creados a partir del archivo CSV
        for (Alumno alumno : nuevosAlumnos) {
            System.out.println("Nombre: " + alumno.nombre + ", ApPat: " + alumno.apellidoPaterno +
                    ", ApMat: " + alumno.apellidoMaterno + ", NumCuenta: " + alumno.numCuenta +
                    ", Edad: " + alumno.edad);
        }
    }
    
}
