package VLGt07;

import java.util.ArrayList;
import java.util.Scanner;

public class VLGt07e16 {
    public static void main(String[] args) {
        ArrayList<Integer> positivos = new ArrayList<>();
        ArrayList<Integer> negativos = new ArrayList<>();
        int val;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Introduce un número: ");
            val = Integer.parseInt(teclado.nextLine());
            if (val > 0){
                positivos.add(val);
            } else if (val < 0){
                negativos.add(val);
            }

        }while(val != 0);
        System.out.println("Media positivos: " + positivos.stream().mapToInt(Integer::intValue).average().orElse(0));
        System.out.println("Media negativos: " + negativos.stream().mapToInt(Integer::intValue).average().orElse(0));
    }
}
