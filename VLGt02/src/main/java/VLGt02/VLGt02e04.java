
package VLGt02;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt02e04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x1, x2, y1, y2, l1, l2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor x1: ");
        x1 = teclado.nextInt();
        System.out.println("Introduce el valor y1: ");
        y1 = teclado.nextInt();
        System.out.println("Introduce el valor x2: ");
        x2 = teclado.nextInt();
        System.out.println("Introduce el valor y2: ");
        y2 = teclado.nextInt();
        
        l1 = Math.abs(x1-x2);
        l2 = Math.abs(y1-y2);
        
        if(l1 == l2){
            System.out.println("Es un cuadrado de area " + l1 * l2);
        }else{
            System.out.println("Es un rectangulo de area " + l1 * l2);
        }
    }
    
}
