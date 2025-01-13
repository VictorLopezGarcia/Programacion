package VLGt07;

import java.util.Scanner;

public class VLGt07e35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + ": ");
            array[i] = teclado.nextInt();
        }

        System.out.println("El array es palíndromo: " + esPalindromo(array));

    }

    public static boolean esPalindromo (int [] array){
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
