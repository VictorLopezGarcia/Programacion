package VLGt03;

import java.util.Scanner;

public class VLGt03e02 {
    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de enteros a imprimir: ");
        n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
