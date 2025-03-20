package VLGt12;

import java.util.Scanner;

public class VLGt12e02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double num1, num2;

        System.out.println("Introduce un número: ");
        try {
            num1 = Double.parseDouble(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("No has introducido un número");
            return;
        }
        System.out.println("Introduce otro número: ");
        try {
            num2 = Double.parseDouble(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("No has introducido un número");
            return;
        }

        System.out.println("La suma de los números es: " + (num1 + num2));

    }
}
