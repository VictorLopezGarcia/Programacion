package VLGt04;

import java.util.Scanner;

public class VLGt04e10 {
    public static void main(String[] args) {
        String cadenaF="", cadena;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce la cadena " + (i + 1) + ": ");
            cadena = teclado.nextLine();
            cadenaF += cadena.charAt(0);
        }
        System.out.println(cadenaF);
    }
}
