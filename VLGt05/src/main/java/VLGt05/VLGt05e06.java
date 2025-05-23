package VLGt05;

import java.util.Scanner;

public class VLGt05e06 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int num;

        System.out.println("Introduce un numero para calcular su cantidad de divisores: ");
        num = Integer.parseInt(teclado.nextLine());
        System.out.println("La cantidad de divisores de " + num + " es: " + cantidadDivisores(num));
    }

    public static int cantidadDivisores(int num){
        int contador = 0;
        if (num<0) return 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        return contador;
    }
}
