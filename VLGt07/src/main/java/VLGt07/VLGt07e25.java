package VLGt07;

import java.util.Scanner;

public class VLGt07e25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + ": ");
            array[i] = teclado.nextInt();
        }

        System.out.println("Introduce el número a buscar: ");
        int num = teclado.nextInt();
        System.out.println("El número " + num + " aparece " + cont(array, num) + " veces en el array.");
    }

    public static int cont(int[] array, int num) {
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if(num==array[i]) {
                cont++;
            }
        }
        return cont;
    }
}
