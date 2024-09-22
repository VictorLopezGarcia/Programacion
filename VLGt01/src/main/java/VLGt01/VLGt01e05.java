
package VLGt01;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt01e05 {

    public static void main(String[] args) {
        double sol, c;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la temperatura en Celsius: ");
        c = teclado.nextDouble();
        sol = (double)9/5*c + 32;
        System.out.printf("%.2f grados Celsius son %.2f Fahrenheit.%n",c , sol);
    }   
}
