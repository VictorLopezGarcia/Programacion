package VLGt03;

import java.util.Scanner;

public class VLGt03e13 {
    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero positivo: ");
            n = teclado.nextInt();
        }while(n <= 0);
        System.out.println(n+" Es positivo.");
    }
}
