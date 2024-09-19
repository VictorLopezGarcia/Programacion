
package src.main.java.vlgt02;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt02e02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        int a, b, c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor 1: ");
        a = teclado.nextInt();
        System.out.println("Introduce el valor 2: ");
        b = teclado.nextInt();
        System.out.println("Introduce el valor 3: ");
        c = teclado.nextInt();
        if (a < 0 && b < 0 && c < 0) {
            System.out.println("Solucion: "+ (a*b*c));
        } else if (a < 0 || b < 0 || c < 0){
            System.out.println("Solucion: " + (a+b+c));
        }else{
            System.out.println("Solucion: " + ((a + b) * c));
        }
    }
    
}
