package Ejercicio2;

/**
 *
 * @author SALAS
 */
public class Main {
    public static void main(String[] args) {
        Apellidos aplicacion = new Apellidos();
        
        aplicacion.abrirArchivo();
        aplicacion.leer_informacion();
        aplicacion.cerrarArchivo();
    }
}
