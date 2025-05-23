package VLGt04;

import java.util.Scanner;

public class VLGt04e03 {
    public static void main(String[] args) {
        String cadena;
        char letra;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu cadena: ");
        cadena = teclado.nextLine();
        System.out.print("Introduce la letra que quieres buscar: ");
        letra = teclado.nextLine().charAt(0);
        if(cadena.contains(String.valueOf(letra))){
            System.out.println("La letra " + letra + " aparece en la cadena.");
        } else {
            System.out.println("La letra " + letra + " no aparece en la cadena.");
        }
    }
}