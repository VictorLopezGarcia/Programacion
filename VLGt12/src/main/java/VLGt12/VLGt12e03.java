package VLGt12;

import java.util.Scanner;

public class VLGt12e03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduce un número: ");
        try {
            num1 = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce otro número: ");
            num2 = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("No has introducido un número");
            return;
        }

        try {
            System.out.println("La división de los números es: " + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        }

    }
}
