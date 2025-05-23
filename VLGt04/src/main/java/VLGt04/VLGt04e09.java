package VLGt04;

import java.util.Scanner;

public class VLGt04e09 {
    public static void main(String[] args) {
        String nombre, edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Introduce tu edad: ");
        edad = teclado.nextLine();
        System.out.println(String.format("Hola, me llamo %s y tengo %s años.", nombre, edad));
        System.out.printf("Hola, me llamo %s y tengo %s años.", nombre, edad);
    }
}
