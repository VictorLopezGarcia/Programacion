package VLGt07;

import java.util.Scanner;

public class VLGt07e28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + ": ");
            array[i] = teclado.nextInt();
        }
        int num;
        System.out.println("Introduce el número a eliminar: ");
        num = teclado.nextInt();

        int[] array2 = eliminarNum(array, num);
        System.out.println("Array original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nArray sin el número " + num + ":");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

    public static int[] eliminarNum(int[] array, int num){
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                contador++;
            }
        }
        int[] array2 = new int[array.length - contador];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != num) {
                array2[j] = array[i];
                j++;
            }
        }
        return array2;
    }
}
