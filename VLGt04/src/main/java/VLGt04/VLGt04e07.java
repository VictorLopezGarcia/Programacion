package VLGt04;

import java.util.Scanner;

public class VLGt04e07 {
    public static void main(String[] args) {
        String cadena, encriptada = "";

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu cadena a encriptar: ");
        cadena = teclado.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
           if(cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z' ){
               encriptada += (char) (cadena.charAt(i)%26 + 65);
           }
           else if (cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z') {
               encriptada += (char) ((cadena.charAt(i)-32)%26 + 97);
           }
           else encriptada += cadena.charAt(i);
        }
        System.out.println(encriptada);
    }
}
