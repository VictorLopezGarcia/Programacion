package VLGt04;

import java.util.Scanner;

public class VLGt04e14 {
    public static void main(String[] args){
        String cadena;

        System.out.println("Introduce tu cadena:");
        Scanner teclado = new Scanner(System.in);
        cadena = teclado.nextLine();

        StringBuilder stringBuilder = new StringBuilder(cadena);
        if(stringBuilder.length() > 3)   {
            stringBuilder.deleteCharAt(3);
            System.out.println(stringBuilder);
        }
        if (stringBuilder.length() > 5) {
            stringBuilder.insert(5, 'x');
            System.out.println(stringBuilder);
        }
        if (stringBuilder.length() > 1) {
            stringBuilder.setCharAt(1,'z');
            System.out.println(stringBuilder);
        }
        if(stringBuilder.length() > 10) {
            stringBuilder.delete(5, 10);
            System.out.println(stringBuilder);
        }
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        cadena = stringBuilder.toString();
        System.out.println(cadena);
    }
}
