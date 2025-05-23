package VLGt03;

import java.util.Scanner;

public class VLGt03e08 {
    public static void main(String[] args) {
        int num, sum=0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = teclado.nextInt();
        for (int i = num+1; i <= num + 100; i++) {
            sum += i;
        }
        System.out.println("La suma de los siguientes 100 es: "+ sum);
    }
}
