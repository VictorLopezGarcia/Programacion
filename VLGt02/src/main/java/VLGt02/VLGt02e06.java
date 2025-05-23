package VLGt02;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt02e06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c, d, e, f, x, y;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor a: ");
        a = teclado.nextDouble();
        System.out.println("Introduce el valor b: ");
        b = teclado.nextDouble();
        System.out.println("Introduce el valor c: ");
        c = teclado.nextDouble();
        System.out.println("Introduce el valor d: ");
        d = teclado.nextDouble();
        System.out.println("Introduce el valor e: ");
        e = teclado.nextDouble();
        System.out.println("Introduce el valor f: ");
        f = teclado.nextDouble();
        if((a * e - b * d) != 0){
            x = (c * e - b * f) / (a * e - b * d);
            y = (a * f - c * d) / (a * e - b * d);
            System.out.printf("\nX = %.2f \nY = %.2f", x, y);
        }else{
            System.out.println("No tiene solución");
        }
    }
    
}
