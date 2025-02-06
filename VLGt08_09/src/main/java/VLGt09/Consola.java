package VLGt09;

import java.util.Scanner;

public class Consola {

    private static final Scanner teclado = new Scanner(System.in);

    public static int leerEntero() {
        return teclado.nextInt();
    }

    public static int leerEntero(String mensaje) {
        System.out.println(mensaje);
        return teclado.nextInt();
    }

    public static int leerEntero(String mensaje, int min, int max) {
        System.out.println(mensaje);
        int valor = teclado.nextInt();
        while (valor < min || valor > max) {
            System.out.println("Valor fuera de rango");
            System.out.println(mensaje);
            valor = teclado.nextInt();
        }
        return valor;
    }

    public static int leerEntero(int min, int max){
        int valor = teclado.nextInt();
        while (valor < min || valor > max) {
            System.out.println("Valor fuera de rango");
            valor = teclado.nextInt();
        }
        return valor;
    }
}
