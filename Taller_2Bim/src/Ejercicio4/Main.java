/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author SALAS
 */
public class Main {
    public static void main(String[] args) {
        
        Factura aplicacion = new Factura();
        
        aplicacion.crear_archivo();
        aplicacion.agregar_informacion();
        aplicacion.cerrar_archivo2();
        
    }
}
