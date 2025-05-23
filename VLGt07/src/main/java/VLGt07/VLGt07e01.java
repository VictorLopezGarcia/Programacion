package VLGt07;

import java.util.Scanner;

public class VLGt07e01 {

    private static final int[] temperaturaMeses = new int[12];
    public static void main(String[] args) {
        char opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Escoge una opción:");
            System.out.println("a) Llenar el Array con valores al azar para todos los meses (entre 0 y 40).");
            System.out.println("b) Mostrar por pantalla el contenido del Array");
            System.out.println("c) Mostrar por pantalla el contenido del Array en orden inverso. ");
            System.out.println("d) Salir");
            opcion = teclado.next().charAt(0);
            switch (opcion){
                case 'a':
                    llenarArray();
                    break;
                case 'b':
                    mostrarArray();
                    break;
                case 'c':
                    mostrarArrayInverso();
                    break;
                case 'd':
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while (opcion != 'd');
    }

    public static void llenarArray(){
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = (int)(Math.random()*41);
        }
    }

    public static void mostrarArray(){
        for (int i = 0; i < temperaturaMeses.length; i++) {
            System.out.println("Mes " + (i+1) + ": " + temperaturaMeses[i]);
        }
    }

    public static void mostrarArrayInverso(){
        for (int i = temperaturaMeses.length-1; i >= 0; i--) {
            System.out.println("Mes " + (i+1) + ": " + temperaturaMeses[i]);
        }
    }

}
