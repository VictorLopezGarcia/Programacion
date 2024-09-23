
package VLGt01;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt01e08c {

    public static void main(String[] args) {
        double sol;
        sol = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la edad de la primera persona: ");
        sol += teclado.nextDouble();
        System.out.print("Introduce la edad de la segunda persona: ");
        sol += teclado.nextDouble();
        System.out.print("Introduce la edad de la tercera persona: ");
        sol += teclado.nextDouble();
        System.out.print("Introduce la edad de la cuarta persona: ");
        sol += teclado.nextDouble();
        sol /= 4;
        System.out.printf("La media de edades de las 4 personas es de %.2f años.", sol);
    }
}
