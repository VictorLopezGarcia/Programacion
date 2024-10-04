package VLGt06;

import java.util.Scanner;

public class VLGt06e17 {
    public static void main(String[] args) {
        MasterMind masterMind = new MasterMind();
        Scanner teclado = new Scanner(System.in);

        do {
            int[] intento = new int[4];
            for (int i = 0; i < 4; i++) {
                System.out.println("Introduce el número " + (i + 1) + ": ");
                intento[i] = teclado.nextInt();
            }
            masterMind.jugar(intento);
            System.out.println("Intentos: " + masterMind.getNumIntentos());
            System.out.println("Colocados: " + masterMind.getNumColocados());
            System.out.println("Descolocados: " + masterMind.getNumDescolocados());
        } while (!masterMind.haGanado() && masterMind.getNumIntentos() < 10);
        System.out.println("Ha ganado: " + masterMind.haGanado());
    }
}
