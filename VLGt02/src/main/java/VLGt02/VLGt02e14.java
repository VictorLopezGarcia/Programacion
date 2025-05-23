package VLGt02;

import java.util.Scanner;

public class VLGt02e14 {
    public static void main(String[] args) {
        int nota, result;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero del dni: ");
        nota = teclado.nextInt();
        result = nota % 23;
        switch (result) {
            case 0 -> System.out.println("La letra de tu dni es: T");
            case 1 -> System.out.println("La letra de tu dni es: R");
            case 2 -> System.out.println("La letra de tu dni es: W");
            case 3 -> System.out.println("La letra de tu dni es: A");
            case 4 -> System.out.println("La letra de tu dni es: G");
            case 5 -> System.out.println("La letra de tu dni es: M");
            case 6 -> System.out.println("La letra de tu dni es: Y");
            case 7 -> System.out.println("La letra de tu dni es: F");
            case 8 -> System.out.println("La letra de tu dni es: P");
            case 9 -> System.out.println("La letra de tu dni es: D");
            case 10 -> System.out.println("La letra de tu dni es: X");
            case 11 -> System.out.println("La letra de tu dni es: B");
            case 12 -> System.out.println("La letra de tu dni es: N");
            case 13 -> System.out.println("La letra de tu dni es: J");
            case 14 -> System.out.println("La letra de tu dni es: Z");
            case 15 -> System.out.println("La letra de tu dni es: S");
            case 16 -> System.out.println("La letra de tu dni es: Q");
            case 17 -> System.out.println("La letra de tu dni es: V");
            case 18 -> System.out.println("La letra de tu dni es: H");
            case 19 -> System.out.println("La letra de tu dni es: L");
            case 20 -> System.out.println("La letra de tu dni es: C");
            case 21 -> System.out.println("La letra de tu dni es: K");
            case 22 -> System.out.println("La letra de tu dni es: E");
            default -> System.out.println("El dni introducido no es valido.");
        }
    }
}
