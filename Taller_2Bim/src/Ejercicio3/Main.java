package Ejercicio3;

/**
 *
 * @author SALAS
 */
public class Main {
    public static void main(String[] args) {
        Estudiantes aplicacion = new Estudiantes();
        
        aplicacion.abrirArchivo();
        aplicacion.leer_informacion();
        aplicacion.cerrarArchivo();
        
    }
}
