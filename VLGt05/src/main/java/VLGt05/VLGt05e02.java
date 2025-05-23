package VLGt05;

import java.util.Scanner;

public class VLGt05e02 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        char entrada;

        do{
            System.out.println("--------------------");
            System.out.println("Selecciona una opción: ");
            System.out.println("a) Area del circulo");
            System.out.println("b) Area del cuadrado");
            System.out.println("c) Area del triangulo");
            System.out.println("d) Salir");
            System.out.println("--------------------");

            entrada = teclado.nextLine().charAt(0);

            switch (entrada){
                case 'a' -> a();
                case 'b' -> b();
                case 'c' -> c();
                case 'd' -> System.out.println("Adios");
            }
            System.out.println();
        }while (entrada != 'd');

    }
    private static void a() {
        int radio, area;
        System.out.println("Introduce el radio del circulo: ");
        radio = Integer.parseInt(teclado.nextLine());
        area = (int) (Math.PI * Math.pow(radio, 2));
        System.out.println("El area del circulo es: " + area);
    }

    private static void b() {
        int lado, area;
        System.out.println("Introduce el lado del cuadrado: ");
        lado = Integer.parseInt(teclado.nextLine());
        area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }

    private static void c() {
        int base, altura, area;
        System.out.println("Introduce la base del triangulo: ");
        base = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce la altura del triangulo: ");
        altura = Integer.parseInt(teclado.nextLine());
        area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }

}
