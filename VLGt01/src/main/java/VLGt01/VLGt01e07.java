
package VLGt01;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt01e07 {
    public static void main(String[] args) {
        double k1, k2, l1, l2, sol;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el kilometraje de la última vez que se repostó: ");
        k1 = teclado.nextInt();
        System.out.print("Introduce el kilometraje actual: ");
        k2 = teclado.nextInt();
        System.out.print("Introduce los litros de gasolina que tenía al finalizar la última vez que repostó: ");
        l1 = teclado.nextInt();
        System.out.print("Introduce la cantidad de gasolina actual: ");
        l2 = teclado.nextInt();
        sol = (l1-l2)*100/(k2 - k1);
        System.out.println(String.format("El gasto del vehículo cada 100km es de %.2f litros.", sol));
    }
}
