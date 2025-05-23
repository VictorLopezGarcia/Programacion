package VLGt04;

import java.util.Scanner;

public class VLGt04e08b {
    public static void main(String[] args) {
        StringBuilder cadena;
        int pos;
        char letra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu cadena: ");
        cadena = new StringBuilder(teclado.nextLine());
        System.out.println("Introduce la letra por la que quieres cambiar: ");
        letra = teclado.nextLine().charAt(0);
        System.out.println("Introduce la posicion de la letra que quieres cambiar: ");
        pos = Integer.parseInt(teclado.nextLine());
        cadena.setCharAt(pos, letra);
        System.out.println(cadena);
    }
}
