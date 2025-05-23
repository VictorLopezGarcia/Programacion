package VLGt07;

import java.util.Scanner;

public class VLGt07e32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        int[] array2 = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + ": ");
            array[i] = teclado.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + " del segundo array: ");
            array2[i] = teclado.nextInt();
        }

        System.out.println("Los arrays son iguales: " + funct(array, array2));

    }

    public static boolean funct (int [] arr, int [] arr2){
        if (arr.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]){
                return false;
            }
        }
        return true;

    }
}
