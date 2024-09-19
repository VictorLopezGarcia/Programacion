package src.main.java.vlgt02;

import java.util.Scanner;

public class VLGt02e13 {
    public static void main(String[] args) {
        int nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la nota: ");
        nota = teclado.nextInt();
        if (nota >= 0 && nota <= 10) {
            if (nota <= 2) {
                System.out.println("Muy deficiente.");
            } else if (nota == 3 || nota == 4) {
                System.out.println("Insuficiente.");
            }else if (nota == 5 || nota == 6) {
                System.out.println("Aprobado.");
            }else if (nota == 7 || nota == 8) {
                System.out.println("Notable.");
            }else {
                System.out.println("Sobresaliente.");
            }
        }else System.out.println("Introduzca una nota válida.");
    }
}
