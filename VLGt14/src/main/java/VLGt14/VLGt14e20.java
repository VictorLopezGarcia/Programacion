package VLGt14;

import java.util.Random;
import java.util.TreeSet;

public class VLGt14e20 {
    public static void main(String[] args) {
        TreeSet<Integer> boleto = new TreeSet<>();

        for (int i = 0; i < 6; i++) {
            boleto.add (new Random().nextInt(49));
        }

        for (Integer b : boleto){
            System.out.println(b);
        }
    }
}