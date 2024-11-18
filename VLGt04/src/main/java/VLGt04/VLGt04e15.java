package VLGt04;

import java.util.Scanner;

public class VLGt04e15 {
    public static void main(String[] args){
        String cadena;

        System.out.println("Introduce tu cadena:");
        Scanner teclado = new Scanner(System.in);
        cadena = teclado.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            if(i%2!=0){
                System.out.print("*");
            }else System.out.print(cadena.charAt(i));
        }
    }
}
