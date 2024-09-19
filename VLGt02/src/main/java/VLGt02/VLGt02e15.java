package VLGt02;

import java.util.Scanner;

public class VLGt02e15 {
    public static void main(String[] args) {
        int a, b, r;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        a = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        b = teclado.nextInt();
        if (b !=0 && a/b==0) {
            r = a/b;
            System.out.println(r);
        }
        if (a/b==0 && b !=0) {
            r = a/b;
            System.out.println(r);
        }
        if (b !=0 & a/b==0) {
            r = a/b;
            System.out.println(r);
        }
    }
    // en el caso 'a' contempla primero el error por lo que es imposible que de error
    // en el caso 'b' como comprueba primero que la división sea 0 cuando introduzcas b==0 ya habra dado error debido a la comprobación
    // en el caso 'c' comprueba las 2 condiciones aunque la primera no se cumpla por lo tanto tampoco cubre de errores


}
