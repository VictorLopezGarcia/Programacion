package VLGt05;

import java.util.Scanner;

public class VLGt05e01 {

    public static void main(String[] args) {
        int num, num2;
        double a, b, c;
        long a2, b2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio 1: ");
        System.out.println("Inroduce un número: ");
        num = Integer.parseInt(teclado.nextLine());
        if(par(num)){
            System.out.println("El número es par.");
        }else System.out.println("El número es impar.");

        System.out.println("Ejercicio 2: ");
        System.out.println("Introduce tres números: ");
        a = Double.parseDouble(teclado.nextLine());
        b = Double.parseDouble(teclado.nextLine());
        c = Double.parseDouble(teclado.nextLine());

        System.out.println("El mayor de los tres números es: " + mayor(a, b, c));

        System.out.println("Ejercicio 3: ");
        System.out.println("Introduce dos números: ");
        a2 = Long.parseLong(teclado.nextLine());
        b2 = Long.parseLong(teclado.nextLine());

        System.out.println("La suma de los números en el intervalo es: " + sumaIntervalo(a2, b2));

        System.out.println("Ejercicio 4: ");
        System.out.println("Introduce un número: ");
        num = Integer.parseInt(teclado.nextLine());
        System.out.println("El número de ceros es: " + contarCeros(num));

        System.out.println("Ejercicio 5: ");
        System.out.println("Introduce dos números: ");
        num = Integer.parseInt(teclado.nextLine());
        num2 = Integer.parseInt(teclado.nextLine());
        System.out.println("El número aleatorio es: " + aleatorio(num, num2));

    }

    private static boolean par(int num){
        return num % 2 == 0;
    }

    private static double mayor(double a, double b, double c){
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else{
            return c;
        }
    }

    private static long sumaIntervalo(long a, long b){
        if(a >= b || a <= 0){
            return -1;
        }else{
            long suma = 0;
            for(long i = a+1; i < b; i++){
                suma += i;
            }
            return suma;
        }
    }

    private static int contarCeros(int num){
        int ceros = 0;
        while(num > 0){
            if(num % 10 == 0){
                ceros++;
            }
            num /= 10;
        }
        return ceros;
    }

    private static int aleatorio(int a, int b){
        if(a >= b || a <= 0){
            return -1;
        }
        else{
            return (int)(Math.random() * (b - a) + a);
        }
    }
}
