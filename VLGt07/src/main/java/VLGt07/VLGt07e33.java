package VLGt07;

import java.util.Scanner;

public class VLGt07e33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + ": ");
            array[i] = teclado.nextInt();
        }

        System.out.println("El mismo array con los ceros movidos a la derecha:");

        int [] array2 = funct(array);
        System.out.println("\n"+ java.util.Arrays.toString(array2));

    }

    public static int [] funct (int [] arr){
        int []  arr2 = new int [arr.length];
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr2[cont] = arr[i];
                cont++;
            }
        }
        for (int i = cont; i < arr.length; i++) {
            arr2[i] = 0;
        }
        return arr2;
    }
}
