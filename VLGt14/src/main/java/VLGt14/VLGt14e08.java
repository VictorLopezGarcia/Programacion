package VLGt14;

import java.time.Year;
import java.util.HashMap;
import java.util.Scanner;

public class VLGt14e08 {
    public static void main(String[] args) {
        int anio, dias;

        Scanner teclado = new Scanner(System.in);
        HashMap<Integer, Integer> temperaturas = new HashMap<>();
        System.out.println("Introduce el año");
        anio = Integer.parseInt(teclado.nextLine());
        if(Year.of(anio).isLeap())
            dias = 366;
        else
            dias = 365;

        for(int i = 10; i <= 30; i++) temperaturas.put(i, 0);
        int[] temp = new int[dias];
        for (int i =0; i < dias; i++) {
            temp[i] = (int) (Math.random() * 21)+10;
        }
        for (int i = 0; i < dias; i++) {
            temperaturas.put(temp[i], temperaturas.get(temp[i]) + 1);
        }
        System.out.println("Temperaturas en el año " + anio);
        for (int i = 10; i <= 30; i++) {
            System.out.println(i + "ºC: " + temperaturas.get(i) + " días");
        }
    }
}
