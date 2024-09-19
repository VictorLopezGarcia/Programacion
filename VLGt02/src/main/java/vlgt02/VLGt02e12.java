
package src.main.java.vlgt02;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt02e12 {

    public static void main(String[] args) {
        int d, m, a, d2, m2, a2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el dia 1: ");
        d = teclado.nextInt();
        System.out.println("Introduce el mes 1: ");
        m = teclado.nextInt();
        System.out.println("Introduce el ano 1: ");
        a = teclado.nextInt();
        System.out.println("Introduce el dia 2: ");
        d2 = teclado.nextInt();
        System.out.println("Introduce el mes 2: ");
        m2 = teclado.nextInt();
        System.out.println("Introduce el ano 2: ");
        a2 = teclado.nextInt();
        if(a>a2 || a==a2 && m > m2 || m==m2 && d > d2){
            System.out.println("La fecha: "+ d +"/"+ m +"/"+ a +" es mayor");
        }else if(d == d2){
            System.out.println("Las fechas son las mismas.");
        }else{
            System.out.println("La fecha: "+ d2 +"/"+ m2 +"/"+ a2 +" es mayor");
        }
    }
    
}
