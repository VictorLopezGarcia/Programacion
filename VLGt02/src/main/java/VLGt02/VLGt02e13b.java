package VLGt02;

import java.util.Scanner;

public class VLGt02e13b {
    public static void main(String[] args) {
        int nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        nota = teclado.nextInt();
        switch (nota) {
            case 0, 1, 2 -> System.out.println("Muy deficiente");
            case 3, 4 -> System.out.println("Insuficiente");
            case 5, 6 -> System.out.println("Aprobado");
            case 7, 8 -> System.out.println("Notable");
            case 9, 10 -> System.out.println("Sobresaliente");
            default -> System.out.println("Introduce una nota valida.");
        }
    }
}
