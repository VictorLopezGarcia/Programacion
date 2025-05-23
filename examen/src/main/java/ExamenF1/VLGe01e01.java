package ExamenF1;

import java.util.Scanner;

public class VLGe01e01 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int entrada, divCount=0, sumCount=0;
        double raiz, division;
        do{
            System.out.println("Introduce un numero menor que 50:");
            entrada = Integer.parseInt(teclado.nextLine());
            if(entrada>50){
                System.out.println("El numero ha de ser menor que 50");
            }
        }while(entrada>50);

        for (int i = 0; i <= entrada; i++) {
            if(i%7==0) {
                divCount++;
                sumCount+=i;
            }
        }
        raiz =Math.sqrt(sumCount);
        division = raiz/divCount;
        System.out.println("Hay "+ divCount +" multiplos de 7 entre 0 y "+ entrada);
        System.out.println("La suma de los multiplos de 7 entre 0 y "+ entrada + " es de "+ sumCount);
        System.out.println("La raiz de dicha suma es: "+ raiz);
        System.out.println(raiz + " entre "+ divCount + " es "+ division);
        System.out.printf("Redondeando a 3 decimales: %.3f", division);
    }
}
