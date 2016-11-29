/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivobryan2;

/**
 *
 * @author Usuario
 */
public class Ejecutorcalificaciones2 {
    

   public static void main( String args[] )
   {
      Alumnos aplicacion = new Alumnos();

      aplicacion.abrirArchivo();
      aplicacion.leer_informacion();
      aplicacion.cerrarArchivo();
   } // fin de main
} // fin de la clase PruebaLeerArchivoTexto
