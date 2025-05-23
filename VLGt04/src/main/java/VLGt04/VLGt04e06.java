package VLGt04;

import java.util.Scanner;

public class VLGt04e06 {
    public static void main(String[] args) {
        String cadena;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu correo: ");
        cadena = teclado.nextLine();
        System.out.println("Tu dominio es "+cadena.substring(cadena.indexOf("@") + 1, cadena.lastIndexOf(".")));
    }
}
