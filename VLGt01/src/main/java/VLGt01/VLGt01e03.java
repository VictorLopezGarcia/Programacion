
package VLGt01;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt01e03 {

    public static void main(String[] args) {
        int a, b;
        double sol;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el valor de a: ");
        a = teclado.nextInt();
        System.out.print("Introduce el valor de b: ");
        b = teclado.nextInt();
        sol = a + b;
        System.out.println(a + " + " + b + " = "+ sol);
        sol = a - b;
        System.out.println(a + " - " + b + " = "+ sol);
        try {
            sol =  (double) a / b;
        } catch (Exception e){
            sol = 0;
        }
        System.out.println(a + " / " + b + " = " + sol);        
    }
}
