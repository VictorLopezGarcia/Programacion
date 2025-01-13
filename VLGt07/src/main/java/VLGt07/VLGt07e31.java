package VLGt07;

import java.util.Scanner;

public class VLGt07e31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + ": ");
            array[i] = teclado.nextInt();
        }

        System.out.println("El segundo número más grande del array es: " + funct(array));
    }

    public static int funct (int[] array){
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            } else if (array[i] > max2) {
                max2 = array[i];
            }
        }
        return max2;
    }
}
