/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivobryan;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calificaciones {
    


    private Formatter salida; // objeto usado para enviar texto al archivo

    // permite al usuario abrir el archivo
    public void abrir_archivo() {
        try {
            salida = new Formatter("calificaciones.txt");
        } // fin de try
        catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrir_archivo

    // agrega registros al archivo
    public void agregar_informacion() {
        // el archivo permite el ingreso
        // de edad, nombre, apellido de una persona
        
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) // itera hasta que bandera sea false
        {
            try // envía valores al archivo
            {
                // obtiene los datos que se van a enviar
                //System.out.println("Ingrese la edad de la persona (debe ser entero)");
                //int edad = entrada.nextInt(); // lee la edad 
                System.out.println("Ingrese el nombre de la persona");
                String nombre = entrada.next(); // lee el nombre
                System.out.println("Ingrese el apellidos de la persona");
                String apellido = entrada.next(); // lee el apellido
                System.out.println("Ingrese la calificacion 1 de la persona");
                double calificacion1 = entrada.nextDouble(); // lee el apellido
                System.out.println("Ingrese la calificacion 2 de la persona");
                double calificacion2 = entrada.nextDouble(); // lee el apellido

                // escribe el nuevo registro (escribe en el archivo
                salida.format("%s;%s;%.2f;%.2f\n",nombre, apellido, calificacion1, calificacion2);

                System.out.println("Desea ingresar más datos si (1), no(2)");
                int valor = entrada.nextInt();
                if (valor == 2) {
                    bandera = false;
                }

            } // fin de try
            catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escribir en el archivo.");
                return;
            } // fin de catch
            catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
            } // fin de catch

        } // fin de while
    } // fin del método agregarRegistros

    // cierra el arrchivo
    public void cerrar_archivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del método cerrarArchivo
} // fin de la clase ArchivoTexto

