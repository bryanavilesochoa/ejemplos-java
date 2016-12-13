/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafactorial;

/**
 *
 * @author Usuario
 */
public class CalculoFactorial {

    public double factorial(double numero) {
        if (numero <= 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

    public void mostrarfactorial() {
        for (int cont = 0; cont <= 4; cont++) {
            System.out.printf("%d! = %.0f\n", cont, factorial(cont));
        }
    }
}
