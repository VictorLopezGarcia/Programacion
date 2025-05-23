package VLGt03;

import java.util.Scanner;

public class VLGt03e03 {
    public static void main(String[] args) {
        int x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        x = teclado.nextInt();
        while(x % 2 == 0){
            System.out.println("El numero introducido es par.");
            System.out.println("Introduce el numero: ");
            x = teclado.nextInt();
        }
        System.out.println("El numero introducido es impar.");
    }
}
