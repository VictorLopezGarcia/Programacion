
package VLGt01;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt01e10 {

    public static void main(String[] args) {
        double var1, var2, sol;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce var1: ");
        var1 = Math.abs(teclado.nextDouble());
        System.out.print("Introduce var2: ");
        var2 = Math.abs(teclado.nextDouble());
        sol = var1*var2;
        System.out.printf("El area encerrada por las coordenadas introducidas es de %.2f.", sol);
    }
    
}
