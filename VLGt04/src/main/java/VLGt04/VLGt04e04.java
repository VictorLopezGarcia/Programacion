package VLGt04;

import java.util.Scanner;

public class VLGt04e04 {
    public static void main(String[] args) {
        String cadena = "";
        int random1 = (int) (Math.random() * 5)+5;
        int random2;
        for (int i = 0; i < random1; i++) {
            random2  = (int) (Math.random() * 9)+97;
            cadena = cadena + (char) random2;
        }
        System.out.println(cadena);
    }
}
