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
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("\nArray sin el número " + num + ":");
        for (int j : array2) {
            System.out.print(j + " ");
        }
    }

    public static int[] eliminarNum(int[] array, int num){
        int contador = 0;
        for (int k : array) {
            if (k == num) {
                contador++;
            }
        }
        int[] array2 = new int[array.length - contador];
        int j = 0;
        for (int k : array) {
            if (k != num) {
                array2[j] = k;
                j++;
            }
        }
        return array2;
    }
}
