package VLGt08;

import java.util.Scanner;

public class VLGt08e09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float cantidad;
        char opcion;
        CuentaPlazo cp = new CuentaPlazo("ES6621000418401234567892");

        System.out.println("Bienvenido a tu cuenta");

        do {
            System.out.println("Escoge una opción:");
            System.out.println("a) Mostrar el saldo");
            System.out.println("b) Realizar un ingreso");
            System.out.println("c) Realizar una retirada");
            System.out.println("d) Salir");
            opcion = teclado.next().charAt(0);


            switch (opcion) {
                case 'a':
                    System.out.println("Saldo: " + cp.getSaldo());
                    break;
                case 'b':
                    System.out.println("Introduce la cantidad a ingresar:");
                    cantidad = teclado.nextFloat();
                    cp.ingresar(cantidad);
                    System.out.println("Saldo: " + cp.getSaldo());
                    break;

                case 'c':
                    System.out.println("Introduce la cantidad a retirar:");
                    cantidad = teclado.nextFloat();
                    if (cp.retirar(cantidad)) {
                        System.out.println("Saldo: " + cp.getSaldo());
                    } else {
                        System.out.println("No se ha podido retirar la cantidad");
                    }
                    break;
                case 'd':
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 'd');
    }
}
