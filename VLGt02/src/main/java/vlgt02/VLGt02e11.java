package src.main.java.vlgt02;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt02e11 {


    public static void main(String[] args) {
        int d, m, a;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el dia: ");
        d = teclado.nextInt();
        System.out.println("Introduce el mes: ");
        m = teclado.nextInt();
        System.out.println("Introduce el ano: ");
        a = teclado.nextInt();
        
        if (d >= 0 && d <= 31 && m > 0 && m <= 12 && a >= 0) {
            if (m == 2) {
                if (a % 4 != 0 && a % 100 == 0 || a % 400 == 0) {
                    if (d == 29) {
                        System.out.println(1+"/"+m+1+"/"+a);
                    }
                } else if (d == 28) {
                    System.out.println(1 + "/" + m + 1 + "/" + a);
                }
            } else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 ) {
                if(d==31){
                    System.out.println(1 + "/" + m + 1 + "/" + a);
                }
            }else if(m == 12 && d == 31){
                System.out.println(1 + "/" + 1 + "/" + a+1);
            }
            else if (d == 30) {
                System.out.println(1 + "/" + m + 1 + "/" + a);
            } else {
                System.out.println(1 + "/" + m + "/" + a);
            }
        } else {
            System.out.println("Introduzca una fecha valida");
        }
    }
    
}
