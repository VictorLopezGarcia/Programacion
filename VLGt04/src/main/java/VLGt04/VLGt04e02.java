package VLGt04;

import java.util.Scanner;

public class VLGt04e02 {
    public static void main(String[] args) {
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu dni: ");
        dni = Integer.parseInt (teclado.nextLine());
        System.out.println("La letra de tu dni es: " + letra.charAt(dni % 23));
    }
}
