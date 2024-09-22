
package VLGt01;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt01e04 {

    public static void main(String[] args) {
        int susp, suf, not, sob;
        double sol;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero de suspensos: ");
        susp = teclado.nextInt();
        System.out.print("Introduce el numero de suficientes: ");
        suf = teclado.nextInt();
        System.out.print("Introduce el numero de notables: ");
        not = teclado.nextInt();
        System.out.print("Introduce el numero de sobresalientes: ");
        sob = teclado.nextInt();
        sol = (double)(suf+not+sob)/(susp+suf+not+sob)*100;
        System.out.printf("Han aprobado el %.2f de los alumnos.%n", sol);
        sol = (double)(not+sob)/(susp+suf+not+sob)*100;
        System.out.printf("El %.2f son notables y sobresalientes.%n", sol);
    }
    
}
