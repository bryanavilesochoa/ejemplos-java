/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutorejercicio;

/**
 *
 * @author Usuario
 */
public class EjecutorEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Ejercicio m = new Ejercicio();
        int arreglo[] = { 3, 4, 6, 10, 5, 7};
        // int arreglo[] = { 2500, 2600, 3200, 4600, 5200, 6600, 7200, 8600, 9200, 10600 };
         int resultado = m.misterio( arreglo, arreglo.length );
        System.out.printf( "El resultado es: %d\n", resultado );
        
    }
}
    
    

