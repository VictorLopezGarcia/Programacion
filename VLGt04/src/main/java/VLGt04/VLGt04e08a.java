package VLGt04;

import java.util.Scanner;

public class VLGt04e08a {
    public static void main(String[] args) {
        String cadena, finalCadena = "";
        int pos;
        char letra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu cadena: ");
        cadena = teclado.nextLine();
        System.out.println("Introduce la letra por la que quieres cambiar: ");
        letra = teclado.nextLine().charAt(0);
        System.out.println("Introduce la posicion de la letra que quieres cambiar: ");
        pos = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < cadena.length(); i++) {
            if (i == pos) {
                finalCadena += letra;
            } else {
                finalCadena += cadena.charAt(i);
            }
        }
        System.out.println(finalCadena);
    }
}
