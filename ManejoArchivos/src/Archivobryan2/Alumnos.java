/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivobryan2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Alumnos {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {

        try {
            entrada = new Scanner(new File("datoss.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {

        int e = 0;
        double es = 0;

        double promedio[] = new double[4];
        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));

                System.out.println(linea_partes);

                for (int i = 2; i < linea_partes.size() - 1; i++) {
                    e = 0;
                    promedio[e] = 0;
                    promedio[e] = (Double.parseDouble(linea_partes.get(i)) + Double.parseDouble(linea_partes.get(i + 1))) / 2;
                    System.out.println("promedio es:" + promedio[e]);
                    if (es < promedio[e]) {
                        es = promedio[e];
                    }
                    e = e + 1;

                }
            } // fin de while
            System.out.println("El promedio mas alto es : " + es);
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

    private double DoubleparseDouble(String get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} // fin de la clase LeerArchivoTexto

