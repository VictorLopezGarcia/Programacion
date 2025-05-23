package VLGt05;

import java.util.Scanner;

public class VLGt05e05 {
    public static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        int num;
        do{
            System.out.println("Introduce un numero entre 1 y 20 para calcular su factorial: ");
            System.out.println("(Diferente para salir)");
            num = Integer.parseInt(teclado.nextLine());
            if (num >= 1 && num <= 20){
                System.out.println("El factorial de " + num + " es: " + factorial(num));
            }else System.out.println("Adios");
        }while (num >= 1 && num <= 20);
    }

    public static long factorial(int num){
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
