package VLGt07;

import java.util.Scanner;

public class VLGt07e34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + ": ");
            array[i] = teclado.nextInt();
        }

        int[] array2 = new int[longitud];

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + " del segundo array: ");
            array2[i] = teclado.nextInt();
        }

        int [] array3 = funct(array, array2);

        System.out.println("El array resultante es:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

    }

    public static int [] funct (int [] array, int [] array2){
        int [] array3 = new int[array.length];
        if (array.length != array2.length){
            return array3;
        }
        for (int i = 0; i < array.length; i++) {
            array3[i] = array[i] + array2[i];
        }
        return array3;
    }

}
