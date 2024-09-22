
package VLGt01;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt01e01 {
    public static void main(String[] args) {
        double eur;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el valor en euros: ");
        eur = teclado.nextDouble();
        System.out.println(eur + "€ son " + eur*1.14 + "$");
    }
}
