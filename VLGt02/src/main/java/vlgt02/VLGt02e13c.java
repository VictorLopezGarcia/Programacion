package src.main.java.vlgt02;

import java.util.Scanner;

public class VLGt02e13c {
    public static void main(String[] args) {
        int nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        nota = teclado.nextInt();
        switch (nota) {
            case 0, 1, 2 : {
                System.out.println("Muy deficiente");
                break;
            }
            case 3, 4 : {
                System.out.println("Insuficiente");
                break;
            }
            case 5, 6 : {
                System.out.println("Aprobado");
                break;
            }
            case 7, 8 : {
                System.out.println("Notable");
                break;
            }
            case 9, 10 : {
                System.out.println("Sobresaliente");
                break;
            }
            default : {
                System.out.println("Introduce una nota valida.");
                break;
            }
        }
    }
}
