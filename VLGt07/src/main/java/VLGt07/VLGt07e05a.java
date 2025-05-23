package VLGt07;

import java.util.Scanner;

public class VLGt07e05a {
    public static void main(String[] args) {
        int[] apuesta = new int[6];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primitiva");
        System.out.println("Introduce tu apuesta:");

        for (int i = 0; i < apuesta.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            apuesta[i] = teclado.nextInt();
        }
        Primitiva primitiva = new Primitiva();
        System.out.println("Aciertos: " + primitiva.aciertos(apuesta));
    }
}
