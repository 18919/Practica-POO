package com.mycompany.proyecto;

import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.Scanner;

/**
 *
 * @author Santiago
 */
/**
 * Clase principal que contiene los metodos para llevar a cabo la creacion, modificacion, impresion o eliminacion de los registros de los alumnos
 */
public class Proyecto {
    
    static Scanner sc = new Scanner(System.in);
    static List<Alumno> alumnosGenerados = new ArrayList<>();
    /**
     * Metodo que despliega el menu de opciones asi como inicializa las listas de nombres, direcciones y materias que se leeran de archivos csv
     * @param args 
     */
    public static void main(String[] args) {
        
        List<String[]> nombres = leerArchivoCSV("datos_alumnos.csv");
        List<String[]> direcciones = leerArchivoCSV2("direcciones.csv");
        List<Materia> materias = leerArchivoMaterias("materias.csv");

        int opcion;
        do {
            Menu.menuInicio();
            opcion = pedirEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    // Generar alumnos
                    int cantidadAlumnos = pedirEntero("Ingrese la cantidad de alumnos a generar: ");
                    alumnosGenerados = generarAlumnos(nombres, direcciones, materias, cantidadAlumnos);
                    break;
                case 2:
                    // Módulo CRUD
                    gestionarCuentaAlumno(alumnosGenerados);
                    break;
                case 3:
                    // Mostrar lista de alumnos
                    mostrarAlumnosGenerados(alumnosGenerados);
                    break;
                case 4:
                    // Guardar alumnos en archivo CSV
                    guardarAlumnosEnCSV(alumnosGenerados, "lista_alumnos.csv");
                    break;      
                case 5:
                    // Salir
                    System.out.println("Gracias por utilizar el programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 5);
    }
    /**
     * Metodo estatico que muestra la cantidad de alumnos que el programa haya generado anteriormente
     * @param alumnosGenerados La lista de registros de los alumnos creados
     */
    public static void mostrarAlumnosGenerados(List<Alumno> alumnosGenerados) {
        System.out.println("\nAlumnos generados:");
        for (Alumno alumno : alumnosGenerados) {
            System.out.println(alumno);
        }
    }
    /**
     * Metodo estatico que genera los alumnos y asigna valores a los atributos de la clase Alumno
     * @param nombres Lista de los multiples opciones de nombres que puede tener el alumno
     * @param direcciones Lista de todas las direcciones que se le pueden asignar a un alumno
     * @param materias Lista de materias que curso el alumno
     * @param cantidad El numero de alumnos que se desea generar
     * @return La lista de alumnos que se crearon y se le asignaron valores a los atributos correspondientes
     */
    public static List<Alumno> generarAlumnos(List<String[]> nombres, List<String[]> direcciones, List<Materia> materias, int cantidad) {
        
        List<Alumno> alumnosGenerados = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            // Obtener la información del alumno
            String[] nombre = nombres.get((int) (Math.random() * nombres.size()));
            String[] apellidoPaterno = nombres.get((int) (Math.random() * nombres.size()));
            String[] apellidoMaterno = nombres.get((int) (Math.random() * nombres.size()));
            String[] direccion = direcciones.get((int) (Math.random() * direcciones.size()));
            int semestre = (int) (Math.random() * 10) + 1;
            int edad = generarEdad(semestre);

            // Obtener las materias cursadas según el semestre del alumno
            List<Materia> materiasCursadas = obtenerMateriasCursadas(materias, semestre);
            
            // Crear el objeto Alumno con la información generada
            Alumno alumno = new Alumno(
                nombre[0],              // Primer nombre
                apellidoPaterno[1],     // Segundo apellido paterno
                apellidoMaterno[2],     // Tercer apellido materno
                edad,                   // Edad generada según el semestre
                semestre,               // Semestre generado aleatoriamente
                0,
                generarNumeroCuenta(),  // Número de cuenta aleatorio
                direccion[0] + " " + direccion[1] + ", " + direccion[2] + " " + direccion[3],  // Dirección generada aleatoriamente
                materiasCursadas        // Lista de materias cursadas generada según el semestre
            );
           
        calcularYGuardarNumeroInscripcion(alumno);    
        alumnosGenerados.add(alumno);
        } 

        return alumnosGenerados;
    }
    /**
     * Metodo estatico que genera todas las materias que ha cursado el alumno hasta el semestre que se la haya indicado
     * @param materias Lista de materias disponibles acorde a los semestres cursados
     * @param semestre El ultimo semestre que el alumno curso
     * @return Lista de materias cursadas por el alumno hasta el semestre indicado
     */
    public static List<Materia> obtenerMateriasCursadas(List<Materia> materias, int semestre) {
        List<Materia> materiasCursadas = new ArrayList<>();

        for (int i = 1; i <= semestre; i++) {
            materiasCursadas.addAll(materias.subList((i - 1) * 5, i * 5));
        }

        return materiasCursadas;
    }
    /**
     * Metodo estatico que le asigna aleatoriamente al alumno las materias del semestre indicado
     * @param semestre Semestre actual del estudiante 
     * @param materias Lista de materias disponibles 
     * @return Lista de materias asignadas
     */
    public static List<Materia> asignarMaterias(int semestre, List<Materia> materias) {
    // Filtrar las materias disponibles para el semestre actual
    List<Materia> materiasDisponibles = materias.stream()
            .filter(materia -> materia.getClave() <= semestre * 100) // Evitar materias de semestres superiores
            .collect(Collectors.toList());

    // Asignar aleatoriamente un número de materias al estudiante (entre 3 y 5)
    int cantidadMaterias = (int) (Math.random() * 3) + 3;
    List<Materia> materiasAsignadas = new ArrayList<>();

    for (int i = 0; i < cantidadMaterias; i++) {
        // Se elige una materia al azar de la lista de materias disponibles
        Materia materia = materiasDisponibles.get((int) (Math.random() * materiasDisponibles.size()));
        // Se agrega la materia a la lista de materias asignadas al estudiante
        materiasAsignadas.add(materia);
        // Se marca la materia como asignada y se actualiza la lista de materias disponibles
        materia.setAprobada(true);
        materiasDisponibles.remove(materia);
    }

    asignarCalificacionesAleatorias(materiasAsignadas); // Asignar calificaciones aleatorias a las materias asignadas

    return materiasAsignadas;
    }
/**
 * Metodo estatico que le asigna las calificaciones a todas las materias que haya cursado el alumno
 * @param materias Lista de materias que ha llevado el alumno
 */
public static void asignarCalificacionesAleatorias(List<Materia> materias) {
    Random random = new Random();

    for (Materia materia : materias) {
        // Generar calificación aleatoria en el rango de 5 a 10
        int calificacion = random.nextInt(6) + 5;

        // Asignar calificación a la materia
        materia.setCalificacion(calificacion);

        // Determinar si la materia está aprobada
        materia.setAprobada(calificacion > 5);
    }
}

    /**
     * Metodo estatico que le asigna una edad al alumno creado acorde al semestre que haya cursado ultimamente
     * @param semestre El ultimo semestre que el alumno curso
     * @return La edad del alumno
     */
    public static int generarEdad(int semestre) {
        switch (semestre) {
            case 1:
                return 18;
            case 2:
                return (int) (Math.random() * 2) + 18; // Rango 18-19
            case 3:
                return (int) (Math.random() * 3) + 19; // Rango 19-21
            case 4:
                return (int) (Math.random() * 3) + 20; // Rango 20-22
            case 5:
                return (int) (Math.random() * 3) + 21; // Rango 21-23
            case 6:
                return (int) (Math.random() * 3) + 22; // Rango 22-24
            case 7:
                return (int) (Math.random() * 3) + 23; // Rango 23-25
            case 8:
                return (int) (Math.random() * 3) + 24; // Rango 24-26
            case 9:
                return (int) (Math.random() * 3) + 25; // Rango 25-27
            case 10:
                return (int) (Math.random() * 2) + 26; // Rango 26-27
            default:
                return 18;
        }
    }
    /**
     * Metodo estatico que genera un numero de cuenta para el alumno creado
     * @return Numero de cuenta del alumno
     */
    public static String generarNumeroCuenta() {
        // El número de cuenta debe tener 9 dígitos
        return "4230" + String.format("%05d", (int) (Math.random() * 10000));
    }
    /**
     * Metodo estatico que pide un numero para poder utilizarlo en diferentes operaciones dependiendo en que parte del programa se llame
     * @param mensaje La oracion que se imprime para conforme a ello ingresar un valor y se realice una accion determinada
     * @return Entero obtenido al convertir la entrada del usuario
     */
    public static int pedirEntero(String mensaje) {
        try {
            BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
            System.out.print(mensaje);
            return Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }
    /**
     * Metodo estatico que imprime el historial academico del alumno, es decir, toda la informacion de todas las materias que ha llevado el alumno
     * @param alumno La instancia de un alumno donde contiene la informacion necesaria para imprimir
     */
    public static void mostrarHistorialAcademico(Alumno alumno) {
        System.out.println("\nHistorial Académico de " + alumno.getNombre() + " " + alumno.getApellidoPaterno() + ":");
        for (Materia materia : alumno.getMateriasCursadas()) {
            System.out.println("Semestre: " + alumno.getSemestre());
            System.out.println("Clave de la materia: " + materia.getClave());
            System.out.println("Materia cursada: " + materia.getNombre());
            System.out.println("Aprobada: " + (materia.isAprobada() ? "Sí" : "No"));
            System.out.println("Calificación: " + materia.getCalificacion());
            System.out.println("Créditos de la materia: " + materia.getCreditos());
            System.out.println("-----------------------------");
        }
    }
    /**
     * Metodo estatico que busca el registro de un alumno por medio de su numero de cuenta
     * @param alumnos La lista de todos los registros de los alumnos para buscar
     * @param numeroCuenta Numero de cuenta del alumno
     * @return El alumno que se ha estado buscando
     */
    public static Alumno buscarAlumnoPorNumeroCuenta(List<Alumno> alumnos, String numeroCuenta) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNumeroCuenta().equals(numeroCuenta)) {
                return alumno;
            }
        }
        return null;
    }
    /**
     * Metodo estatico que lee el archivo que contiene todos los posibles nombres que puede tener el alumno
     * @param archivo Archivo que contiene los nombres que puede llegar a tener el alumno
     * @return Lista de arreglos de cadenas que representan nombres
     */
    public static List<String[]> leerArchivoCSV(String archivo) {
        List<String[]> nombres = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] tokens = linea.split(",");
                nombres.add(tokens);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return nombres;
    }
    /**
     * Metodo estatico que lee los domicilios contenidos en el archivo
     * @param archivo Archivo que contine 1000 direcciones para asignar
     * @return Lista de arreglos de cadenas que representan direcciones
     */
    public static List<String[]> leerArchivoCSV2(String archivo) {
        List<String[]> direcciones = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] tokens = linea.split(",");
                direcciones.add(tokens);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return direcciones;
    }
    /**
     * Metodo estatico que lee el archivo donde esta la informacion de las materias 
     * @param archivo Contiene las materias que puede cursar un alumno
     * @return Lista de arreglos de cadenas que representan materias
     */
    public static List<Materia> leerArchivoMaterias(String archivo) {
        List<Materia> materias = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] tokens = linea.split(",");
                String nombre = tokens[0];
                int clave = Integer.parseInt(tokens[1]);
                int creditos = Integer.parseInt(tokens[2]);
                boolean aprobada = Boolean.parseBoolean(tokens[3]);

                Materia materia = new Materia(nombre, clave, 0, aprobada, creditos);
                materias.add(materia);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        asignarCalificacionesAleatorias(materias);
        
        return materias;
    }
    /**
     * Metodo estatico que guarda los registros de los alumnos creados en un archivos csv
     * @param alumnos La lista de todos los registros de los alumnos para buscar
     * @param nombreArchivo El nombre que se le quiere asignar al archivo 
     */
    public static void guardarAlumnosEnCSV(List<Alumno> alumnos, String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            // Escribir encabezados
            writer.write("Nombre,Apellido Paterno,Apellido Materno,Edad,Semestre,Número de Inscripción,Número de Cuenta,Dirección\n");

            for (Alumno alumno : alumnos) {
                // Escribir datos del alumno
                writer.write(alumno.getNombre() + "," +
                        alumno.getApellidoPaterno() + "," +
                        alumno.getApellidoMaterno() + "," +
                        alumno.getEdad() + "," +
                        alumno.getSemestre() + "," +
                        alumno.getNumInscripcion() + "," +
                        alumno.getNumeroCuenta() + "," +
                        alumno.getDireccion() + "\n");
            }

            System.out.println("Datos de alumnos guardados en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Metodo estatico que cambia la informacion que se le pida del registro de un alumno o directamente se elimina 
     * @param alumnosGenerados La lista que contiene a los alumnos generados 
     */
    public static void gestionarCuentaAlumno(List<Alumno> alumnosGenerados) {
        System.out.print("Ingrese el número de cuenta del alumno a buscar: ");
        String numeroCuentaBusqueda = sc.nextLine();

        Alumno alumnoBuscado = buscarAlumnoPorNumeroCuenta(alumnosGenerados, numeroCuentaBusqueda);

        if (alumnoBuscado != null) {
            mostrarHistorialAcademico(alumnoBuscado);
            System.out.println("\nOpciones para el alumno " + alumnoBuscado.getNombre() + " " + alumnoBuscado.getApellidoPaterno() + ":");
            System.out.println("1. Modificar historial académico");
            System.out.println("2. Eliminar de la base de datos");
            System.out.println("3. Volver al menú anterior");

            int opcion = pedirEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    modificarHistorialAcademico(alumnoBuscado);
                    break;
                case 2:
                    eliminarAlumnoDeBaseDatos(alumnoBuscado);
                    break;
                case 3:
                    // No se hace nada, simplemente sale del menú de gestión de cuenta de alumno
                    break;
                default:
                    System.out.println("Opción no válida. Volviendo al menú principal.");
                    break;
            }
        } else {
            System.out.println("No se encontró ningún alumno con el número de cuenta especificado.");
        }
    }
    /**
     * Metodo estatico que modifica el historial academico (su informacion) del alumno ya sea su calificacion en una materia o su direccion
     * @param alumno La instancia de la clase alumno que especificamente queremos modificar
     */
    public static void modificarHistorialAcademico(Alumno alumno) {
        System.out.println("\nOpciones de modificación de historial académico:");
        System.out.println("1. Modificar calificación de una materia");
        System.out.println("2. Modificar datos personales (dirección)");

        int opcion = pedirEntero("Seleccione una opción: ");

        switch (opcion) {
            case 1:
                modificarCalificacion(alumno);
                break;
            case 2:
                modificarDireccion(alumno);
                break;
            default:
                System.out.println("Opción no válida. Volviendo al menú anterior.");
                break;
        }
    }
    /**
     * Metodo estatico que se encarga de cambiar la calificacion del alumno en cierta materia
     * @param alumno La instancia de la clase alumno que especificamente queremos modificar
     */
    public static void modificarCalificacion(Alumno alumno) {
        System.out.print("Ingrese la clave de la materia a modificar: ");
        int claveMateria = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea después de leer el entero

        Materia materia = buscarMateriaPorClave(alumno.getMateriasCursadas(), claveMateria);

        if (materia != null) {
            System.out.print("Ingrese la nueva calificación para la materia " + materia.getNombre() + ": ");
            int nuevaCalificacion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después de leer el entero

            materia.setCalificacion(nuevaCalificacion);
            materia.setAprobada(nuevaCalificacion > 5);

            System.out.println("Calificación modificada con éxito.");
        } else {
            System.out.println("No se encontró ninguna materia con la clave especificada.");
        }
    }
    /**
     * Metodo estatico que modifica la direccion del alumno
     * @param alumno La instancia de la clase alumno que especificamente queremos modificar
     */
    public static void modificarDireccion(Alumno alumno) {
        System.out.print("Ingrese la nueva dirección para el alumno " + alumno.getNombre() + " " + alumno.getApellidoPaterno() + ": ");
        String nuevaDireccion = sc.nextLine();

        alumno.setDireccion(nuevaDireccion);

        System.out.println("Dirección modificada con éxito.");
    }
    /**
     * Metodo estatico que busca una materia por medio de su clave
     * @param materias Lista de materias que ha cursado el alumno
     * @param clave La clave de la materia
     * @return 
     */
    public static Materia buscarMateriaPorClave(List<Materia> materias, int clave) {
        for (Materia materia : materias) {
            if (materia.getClave() == clave) {
                return materia;
            }
        }
        return null;
    }
    /**
     * Metodo que borrar el registro del alumno que se indico de la lista generada
     * @param alumno La instancia de la clase alumno que especificamente queremos modificar
     */
    public static void eliminarAlumnoDeBaseDatos(Alumno alumno) {
        alumnosGenerados.remove(alumno);
        System.out.println("Alumno eliminado de la base de datos con éxito.");
    }
    /**
     * Metodo estatico que calcula el numero de inscripcion del alumno
     * @param alumno La instancia de la clase alumno que especificamente queremos modificar
     * @return 
     */
    public static double calcularNumeroInscripcion(Alumno alumno) {
    // Calcular el promedio de todas las calificaciones del alumno
    double promedioCalificaciones = calcularPromedioCalificaciones(alumno.getMateriasCursadas());

    // Calcular la escolaridad (materias aprobadas / total de materias) * 100
    double escolaridad = calcularEscolaridad(alumno.getMateriasCursadas());

    // Calcular la velocidad (creditos que lleva el alumno / creditos totales) * 100
    double velocidad = calcularVelocidad(alumno.getMateriasCursadas(), alumno.getSemestre());

    // Calcular el número de inscripción según la fórmula
    double numInscripcion = promedioCalificaciones * escolaridad * velocidad;
    
    return numInscripcion;
    }
    /**
     * Metodo estatico que manda a llamar un metodo para calcular el numero de inscripcion para guardarlo en un atributo de la instancia Alumno
     * @param alumno La instancia de la clase alumno que especificamente queremos modificar
     */
    public static void calcularYGuardarNumeroInscripcion(Alumno alumno) {
        // Calcular el número de inscripción
        double numInscripcion = calcularNumeroInscripcion(alumno);

        // Guardar el número de inscripción en el objeto Alumno
        alumno.setNumInscripcion(numInscripcion);
    }
    /**
     * Metodo estatico que calcula el promedio de un alumno 
     * @param materiasCursadas Lista de materias que ha cursado un alumno
     * @return El promedio del alumno por medio de una division
     */
    public static double calcularPromedioCalificaciones(List<Materia> materiasCursadas) {
        // Calcular el promedio de las calificaciones de todas las materias cursadas
        double sumaCalificaciones = 0;
        int cantidadMateriasAprobadas = 0;

        for (Materia materia : materiasCursadas) {
            if (materia.isAprobada()) {
                sumaCalificaciones += materia.getCalificacion();
            cantidadMateriasAprobadas++;
            }
        }

        // Evitar la división por cero
        if (cantidadMateriasAprobadas > 0) {
            return sumaCalificaciones / cantidadMateriasAprobadas;
        } else {
            return 0;
        }
    }
    /**
     * Metodo estatico que calcula la escolaridad conforme a lo indicado en la formula de la pagina de la universidad
     * @param materiasCursadas Lista de materias que ha cursado un alumno
     * @return El valor de la escolaridad a traves de una division
     */
    public static double calcularEscolaridad(List<Materia> materiasCursadas) {
        // Calcular la escolaridad (materias aprobadas / total de materias) * 100
        long materiasAprobadas = materiasCursadas.stream().filter(Materia::isAprobada).count();
        long totalMaterias = materiasCursadas.size();

        // Evitar la división por cero
        if (totalMaterias > 0) {
            return (double) materiasAprobadas / totalMaterias * 100;
        } else {
            return 0;
        }
    }
    /**
     * Metodo estatico que calcula la velocidad del alumno conforme a lo indicado en la formula de la pagina de la universidad
     * @param materiasCursadas Lista de materias que ha cursado un alumno
     * @param semestreActual El numero del semestre que acaba de cursar
     * @return El valor de la velocidad a traves de una division
     */
    public static double calcularVelocidad(List<Materia> materiasCursadas, int semestreActual) {
        // Calcular la velocidad (creditos que lleva el alumno / creditos totales hasta el semestre en el que va) * 100
        int creditosAprobados = 0;
        int totalCreditosHastaSemestre = 0;

        for (int i = 1; i <= semestreActual; i++) {
            List<Materia> materiasHastaSemestre = obtenerMateriasCursadas(materiasCursadas, i);

            for (Materia materia : materiasHastaSemestre) {
                if (materia.isAprobada()) {
                    creditosAprobados += materia.getCreditos();
                }
                totalCreditosHastaSemestre += materia.getCreditos();
            }
        }

        // Evitar la división por cero
        if (totalCreditosHastaSemestre > 0) {
            return (double) creditosAprobados / totalCreditosHastaSemestre * 100;
        } else {
            return 0;
        }
    }
    
}
    

