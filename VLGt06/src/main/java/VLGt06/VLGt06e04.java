package VLGt06;

import java.util.Scanner;

public class VLGt06e04 {
    static Scanner teclado;
    static CuentaCorriente cuenta1 = new CuentaCorriente("ES6621000418401234567891", 0.01f);
    static CuentaCorriente cuenta2 = new CuentaCorriente("ES9581010410000234000091", 0.01f);
    static CuentaCorriente cuentaActiva = cuenta1;


    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        teclado = new Scanner(System.in);

        boolean salir = false;
        int opcion;
        do {
            opcion=pintarMenu ();
            switch (opcion) {
                case 1: System.out.println("Su saldo es de: "+ cuenta1.getSaldo() + "€"); break;
                case 2: ingresar(cuenta1); break;
                case 3: retirar(cuenta1); break;
                case 4: cambiarCuenta(); break;
                case 0: salir=true; break;
                default: System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu (){
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 consultar saldo");
        System.out.println("2 ingresar");
        System.out.println("3 retirar");
        System.out.println("4 Cambiar cuenta activa");
        System.out.println("0 Salir del programa");
        try {
            return Integer.parseInt (teclado.nextLine());
        } catch (Exception e ) {return 999;}
    }

    private static void ingresar(CuentaCorriente cuenta) {
        System.out.println("Introduce la cantidad a ingresar: ");
        float cantidad = Float.parseFloat(teclado.nextLine());
        cuenta.ingresar(cantidad);
    }

    private static void retirar(CuentaCorriente cuenta) {
        System.out.println("Introduce la cantidad a retirar: ");
        float cantidad = Float.parseFloat(teclado.nextLine());
        if (cuenta.retirar(cantidad)) {
            System.out.println("Retirada realizada con éxito");
        } else {
            System.out.println("No hay saldo suficiente");
        }
    }

    private static void cambiarCuenta() {
        if (cuentaActiva == cuenta1) {
            cuentaActiva = cuenta2;
        } else {
            cuentaActiva = cuenta1;
        }
        System.out.println("Cuenta activa cambiada con éxito");
    }
}
