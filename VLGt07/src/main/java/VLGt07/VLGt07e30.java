package VLGt07;

import java.util.Arrays;
import java.util.Scanner;

public class VLGt07e30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + ": ");
            array[i] = teclado.nextInt();
        }

        System.out.println("Introduce el número de posiciones a desplazar: ");

        int num = teclado.nextInt();

        int [] array2 = funct(array, num);
        System.out.println("Array original:"+ Arrays.toString(array));


        System.out.println("\nArray desplazado " + num + " posiciones:");
        System.out.println("\n"+ Arrays.toString(array2));

    }

    public static int[] funct (int  [] array, int num){
        int [] array2 = new int[array.length];

        if (num > array.length){
            System.out.println("El número introducido es mayor que la longitud del array");
            return array;
        }

        for (int i = 0; i < array.length; i++) {
            if(i+num >= array.length){
                array2[i] = array[i-num];

            }
            else array2[i] = array[i+num];
        }

        return array2;
    }
}
