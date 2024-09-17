package VLGt01;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt01e11 {

    public static void main(String[] args) {
        double var1, var2, sol;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce var1: ");
        var1 = Math.abs(teclado.nextInt());
        System.out.print("Introduce var2: ");
        var2 = Math.abs(teclado.nextInt());
        sol = Math.sqrt(Math.pow(var1, 2) + Math.pow(var2, 2));
        System.out.println(String.format("La longitud de la hipotenusa del triangulo formado por ese cateto es de %.2f.", sol));
    }
}