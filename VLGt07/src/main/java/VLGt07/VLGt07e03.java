package VLGt07;

import java.util.Scanner;

public class VLGt07e03 {
    private static final int[] temperaturaMeses = new int[12];

    public static void main(String[] args) {
        char opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Escoge una opción:");
            System.out.println("a) Llenar el Array con valores al azar para todos los meses (entre 0 y 40).");
            System.out.println("b) Mostrar la temperatura media del año.");
            System.out.println("c) Mostrar los meses en los que hizo más de 30 grados");
            System.out.println("d) Decir si hay algún mes con más de 30 grados");
            System.out.println("e) Decir si hay algún mes con más de 30 grados");
            System.out.println("f) Decir si hay alguna temperatura repetida en dos o más meses");
            System.out.println("g) Salir");
            opcion = teclado.next().charAt(0);
            switch (opcion) {
                case 'a':
                    llenarArray();
                    break;
                case 'b':
                    b();
                    break;
                case 'c':
                    c();
                    break;
                case 'd':
                    d();
                    break;
                case 'e':
                    e();
                    break;
                case 'f':
                    f();
                    break;
                case 'g':
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 'g');
    }

    public static void llenarArray() {
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = (int) (Math.random() * 41);
            for (int j = 0; j < i; j++) {
                if (temperaturaMeses[i] == temperaturaMeses[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    public static void b() {
        double media = 0;
        for (int temperaturaMese : temperaturaMeses) {
            media += temperaturaMese;
        }
        System.out.println("La temperatura media del año es: " + media / temperaturaMeses.length);
    }

    public static void c() {
        for (int temperaturaMese : temperaturaMeses) {
            if (temperaturaMese > 30) {
                System.out.println("Mes con más de 30 grados: " + temperaturaMese);
            }
        }
    }

    public static void d() {
        for (int temperaturaMese : temperaturaMeses) {
            if (temperaturaMese > 30) {
                System.out.println("Mes con más de 30 grados: " + temperaturaMese);
                return;
            }
        }
        System.out.println("No hay ningún mes con más de 30 grados");
    }

    public static void e() {
        boolean mayor30 = false;
        int cont=0;
        do {
            if (temperaturaMeses[cont] > 30) {
                mayor30 = true;
                System.out.println("Mes con más de 30 grados: " + temperaturaMeses[cont]);
            }
            cont++;
        }while (!mayor30 || cont < temperaturaMeses.length);
        System.out.println("No hay ningún mes con más de 30 grados");
    }

    public static void f() {
        for (int i = 0; i < temperaturaMeses.length; i++) {
            for (int j = i+1; j < temperaturaMeses.length; j++) {
                if (temperaturaMeses[i] == temperaturaMeses[j]) {
                    System.out.println("Temperatura repetida: " + temperaturaMeses[i]);
                }
            }
        }
    }
}
