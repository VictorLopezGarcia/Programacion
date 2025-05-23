package VLGt03;

import java.util.Scanner;

public class VLGt03e33 {
    public static void main(String[] args) {
        int x;
        char base;
        Scanner teclado = new java.util.Scanner(System.in);
        System.out.print("Introduce un número: ");
        x = teclado.nextInt();
        System.out.println("A que base quieres convertir el número? (b, t, o)");
        base = teclado.next().charAt(0);
        switch (base){
            case 'b'-> binario(x);
            case 't'-> ternario(x);
            case 'o'-> octal(x);
            default -> System.out.println("Base no válida");
        }
    }

    public static void binario(int x){
        int cont=1;
        long bin=0;
        do{
            bin += (x%2) * cont;
            x = x/2;
            cont *= 10;
        }while(x!=0);
        System.out.println("El número en binario es: "+bin);
    }

    public static void ternario(int x){
        int cont=1;
        long ter=0;
        do{
            ter += (x % 3) * cont;
            x = x/3;
            cont *= 10;
        }while(x!=0);
        System.out.println("El número en ternario es: "+ter);
    }

    public static void octal(int x){
        int cont=1;
        long oct=0;
        do{
            oct += (x % 8) * cont;
            x = x/8;
            cont *= 10;
        }while(x!=0);
        System.out.println("El número en octal es: "+oct);
    }

}
