package VLGt03;

import java.util.Scanner;

public class VLGt03e04 {
    public static void main(String[] args) {
        int x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        x = teclado.nextInt();
        if(x >= 1 && x <= 10){
            for (int i = 1; i <= 10; i++) {
                System.out.println(i+ " x "+ x +" = "+ x*i);
            }
        }else System.out.println("El numero no es valido");
    }
}
