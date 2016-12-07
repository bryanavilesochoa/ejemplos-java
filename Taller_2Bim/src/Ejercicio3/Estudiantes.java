package Ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Estudiantes {
private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {

        try {
            entrada = new Scanner(new File("estudiantes.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {
        int edad = 0, resultado = 0;
        String nombre, apellido;
        try // lee registros del archivo, usando el objeto Scanner
        {
            // Crear un objeto de Crear Archivo
            CrearArchivo archivo = new CrearArchivo();
            archivo.crear_archivo();
            System.out.println("ESTUDIANTES\n");
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split("\\|")));
                String clave = linea_partes.get(0);
                System.out.println(linea_partes);
                
                apellido = linea_partes.get(0);
                nombre = linea_partes.get(1);
                
                edad = Integer.parseInt(linea_partes.get(2));
                resultado = 2016 - edad;
                // Envia datos a Crear Archivo
                archivo.agregar_informacion(nombre, apellido, resultado);
            } // fin de while
//            System.out.println("");
            archivo.cerrar_archivo2();
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicación

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo

} // fin de la clase Estudiantes

