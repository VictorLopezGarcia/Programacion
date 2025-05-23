package VLGt05;

import java.util.Scanner;

import static VLGt05.VLGt05e06.cantidadDivisores;

public class VLGt05e08 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2, div1, div2;

        System.out.println("Introduce un numero: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce otro numero: ");
        num2 = Integer.parseInt(teclado.nextLine());

        div1 = cantidadDivisores(num1);
        div2 = cantidadDivisores(num2);
        if (div1 == div2) {
            System.out.println("Tienen la misma cantidad de divisores");
        }else if (div1 > div2) {
            System.out.println(num1+ " tiene mas divisores que "+num2);
        }else System.out.println(num2+ " tiene mas divisores que "+num1);
    }
}
