package VLGt06;

import java.util.Arrays;
import java.util.Scanner;

public class VLGt06e17 {
    public static void main(String[] args) {
        MasterMind masterMind = new MasterMind();
        Scanner teclado = new Scanner(System.in);

        do {
            int[] intento = new int[4];
            int num;
            do {
                System.out.println("Introduce el número: ");
                num = teclado.nextInt();
            }while (num < 0 || num > 9999);
            for (int i = 0; i < 4; i++) {
                intento[3-i] = num % 10;
                num /= 10;
            }
            masterMind.jugar(intento);
            System.out.println("Intentos: " + masterMind.getNumIntentos());
            System.out.println("Colocados: " + masterMind.getNumColocados());
            System.out.println("Descolocados: " + masterMind.getNumDescolocados());
        } while (!masterMind.haGanado() && masterMind.getNumIntentos() < masterMind.getMaxIntentos());
        System.out.println("Ha ganado: " + masterMind.haGanado());
        System.out.println("Solución: "+ Arrays.toString(masterMind.getCombinacion()));
    }
}
