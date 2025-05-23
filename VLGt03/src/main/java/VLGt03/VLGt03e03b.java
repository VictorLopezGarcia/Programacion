package VLGt03;

import java.util.Scanner;

public class VLGt03e03b {
    public static void main(String[] args) {
        int x;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Introduce el numero: ");
            x = teclado.nextInt();

            if(x % 2 == 0)
                System.out.println("El numero introducido es par.");
        } while(x % 2 == 0);

        System.out.println("El numero introducido es impar.");
    }
}
