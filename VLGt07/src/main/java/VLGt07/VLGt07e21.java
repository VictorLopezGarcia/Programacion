package VLGt07;

import java.util.Scanner;

public class VLGt07e21 {
    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce la longitud del array: ");
        int longitud = new Scanner(System.in).nextInt();

        int[] array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + ": ");
            array[i] = new Scanner(System.in).nextInt();
        }

        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        System.out.println("La suma de los valores del array es: " + suma);
    }
}
