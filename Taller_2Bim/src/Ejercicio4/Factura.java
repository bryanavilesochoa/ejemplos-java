package Ejercicio4;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Factura {
    private Scanner entrada = new Scanner(System.in);
    private Formatter salida; // objeto usado para enviar texto al archivo

    // permite al usuario abrir el archivo
    public void crear_archivo() {
        try {
            salida = new Formatter("Factura.txt");
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
        int opc, cantidad = 0;
        boolean bandera = true;
        String nombre, ciudad;
        String producto = "";
        double costoP = 0, subtotal = 0, iva, total = 0;
                  
        try // envía valores al archivo
        {
            System.out.println("Ingrese nombre del cliente:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la ciudad:");
            ciudad = entrada.nextLine();
            
            salida.format("**********Comercial Ventas y Reventas**********\n" 
                    + "Nombre: %s\nCiudad: %s", nombre, ciudad);
            salida.format("\n----------------------------------\n");
            salida.format("Producto\tCantidad\tPrecio\n");
            
            while(bandera){
                System.out.println("\t  SUPERMERCADO");
                System.out.println("\tMenú de compras\nProducto\t\tCosto Kilo");
                System.out.println("1.Arroz\t\t\t$2.50\n2.Azúcar\t\t$1.5\n3.Aceite\t\t$1.30"
                        + "\n4.Tallarines\t\t$1.50\n5.Sal\t\t\t$1.00");
                System.out.println("\nElija el producto que desea comprar:");
                opc = entrada.nextInt();
                    switch(opc){
                        case 1:
                            producto= "Arroz     ";
                            System.out.println("Ingrese la cantidad:");
                            cantidad = entrada.nextInt();
                            costoP = 2.50 * cantidad;
                            break;
                        case 2:
                            producto = "Azúcar   ";
                            System.out.println("Ingrese la cantidad:");
                            cantidad = entrada.nextInt();
                            costoP = 1.50 * cantidad;
                            break;
                        case 3:
                            producto = "Aceite    ";
                            System.out.println("Ingrese la cantidad:");
                            cantidad = entrada.nextInt();
                            costoP = 1.30 * cantidad;
                            break;
                        case 4:
                            producto = "Tallarines";
                            System.out.println("Ingrese la cantidad:");
                            cantidad = entrada.nextInt();
                            costoP = 1.50 * cantidad;
                            break;
                        case 5:
                            producto = "Sal        ";
                            System.out.println("Ingrese la cantidad:");
                            cantidad = entrada.nextInt();
                            costoP = 1.00 * cantidad;
                            break;
                    }
                    salida.format("%s\t\t%d\t\t%.2f\n", producto, cantidad, costoP);
                    subtotal += costoP;
                    
                    // Opcion sobre agregar datos
                    System.out.println("¿Desea ingresar más datos? Si (1), No(2)");
                    int valor = entrada.nextInt();
                    if (valor == 2) {
                        bandera = false;
                    }
                }
                iva = subtotal * 0.14;
                total = subtotal + iva;
                // Impresión factura
                salida.format("----------------------------------\n"
                    + "\t\tSubtotal: %.2f\n"
                    + "\t\tIVA: %.2f\n"
                    + "\t\tTOTAL: %.2f\n", subtotal, iva, total);
                } // fin de try
        
                catch (FormatterClosedException formatterClosedException) {
                    System.err.println("Error al escribir en el archivo.");
                    return;
                } // fin de catch
                catch (NoSuchElementException elementException) {
                    System.err.println("Entrada invalida. Intente de nuevo.");

                } // fin de catch
    } // fin del método agregar_informacion

    // cierra el arrchivo
    public void cerrar_archivo2() {
        if (salida != null) {
            salida.close();
        }
    } // fin del método cerrarArchivo
}