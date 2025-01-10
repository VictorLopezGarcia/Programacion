package VLGt07;

import java.util.Scanner;

public class VLGt07e26 {
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
        int pos = buscar(array, num);
        if(pos!=-1) {
            System.out.println("El número " + num + " está en la posición " + pos + " del array.");
        } else {
            System.out.println("El número " + num + " no está en el array.");
        }
    }

    public static int buscar(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if(num==array[i]) {
                return i;
            }
        }
        return -1;
    }
}
