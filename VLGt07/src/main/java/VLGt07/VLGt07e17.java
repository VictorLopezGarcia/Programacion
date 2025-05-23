package VLGt07;

import java.util.ArrayList;
import java.util.Scanner;

public class VLGt07e17 {
    public static void main(String[] args) {
        ArrayList<Integer> apuesta = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primitiva");
        System.out.println("Introduce tu apuesta:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            apuesta.add(teclado.nextInt());
        }
        Primitiva2 primitiva = new Primitiva2();
        System.out.println("Aciertos: " + primitiva.aciertos(apuesta));
    }
}
