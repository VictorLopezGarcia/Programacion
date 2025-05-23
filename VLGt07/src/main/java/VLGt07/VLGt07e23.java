package VLGt07;

import java.util.Scanner;

public class VLGt07e23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + ": ");
            array[i] = teclado.nextInt();
            suma += array[i];
        }

        System.out.println("El promedio de los elementos del array es: " + (double)suma/array.length);
    }
}
