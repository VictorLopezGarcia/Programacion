package VLGt04;

import java.util.Scanner;

public class VLGt04e12 {
    public static void main(String[] args) {
        String cadena;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero de 6 digitos:");
        cadena = teclado.nextLine();
        while (cadena.length() != 6 || !cadena.matches("[0-9]+")) {
            System.out.println("El numero introducido no es valido.");
            System.out.println("Introduce un numero de 6 digitos:");
            cadena = teclado.nextLine();
        }

    }
}

