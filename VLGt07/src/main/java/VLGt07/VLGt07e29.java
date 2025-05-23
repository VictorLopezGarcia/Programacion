package VLGt07;

import java.util.Scanner;

public class VLGt07e29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posición " + i + ": ");
            array[i] = teclado.nextInt();
        }

        System.out.println("El array está ordenado: " + ascendente(array));
    }

    public static boolean ascendente(int [] array){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
}
