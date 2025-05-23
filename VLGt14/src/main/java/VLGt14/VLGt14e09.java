package VLGt14;

import java.util.TreeMap;

public class VLGt14e09 {
    public static void main(String[] args) {
        int[] temp = new int[365];
        TreeMap<Integer, Integer> temperaturas = new TreeMap<>();

        for(int i = 10; i <= 30; i++) temperaturas.put(i, 0);

        for (int i =0; i < 365; i++) {
            temp[i] = (int) (Math.random() * 21)+10;
        }

        for (int i =0; i < 365; i++) {
            temperaturas.put(temp[i], temperaturas.get(temp[i]) + 1);
        }

        System.out.println("Temperaturas en un año no bisiesto: ");
        System.out.println("Temperatura mínima "+ temperaturas.firstEntry().getKey() +"ºC " + temperaturas.firstEntry().getValue() + " días");
        System.out.println("Temperatura máxima "+ temperaturas.lastEntry().getKey() +"ºC " + temperaturas.lastEntry().getValue() + " días");
    }
}
