package VLGt07;

import java.util.ArrayList;
import java.util.Scanner;

public class VLGt07e18 {
    public static void main(String[] args) {
        int entrada;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inserte un entero: ");
        entrada = Integer.parseInt(teclado.nextLine());
        ArrayList<Integer> divisores = getDivisores(entrada);
        for (Integer divisore : divisores) {
            System.out.println(divisore);
        }

    }

    public static ArrayList<Integer> getDivisores(int n) {
        ArrayList<Integer> divisores = new ArrayList<>();
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }
}
