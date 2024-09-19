package VLGt03;

import java.util.Scanner;

public class VLGt03e09 {
    public static void main(String[] args) {
        int num, sum=0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduce un número: ");
            num = teclado.nextInt();
            sum += num;
        }while (sum <= 100);
        System.out.println("la suma es: "+ sum);
    }
}
