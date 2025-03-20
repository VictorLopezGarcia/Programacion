package VLGt12;

import java.util.Scanner;

public class VLGt12e06 {
    public static void main(String[] args) {
        int num = leerEntero("Introduzca su edad",0, 120);
        System.out.println("El número introducido es: " + num);
    }

    public static int leerEntero(String mensaje, int min, int max){
        Scanner teclado = new Scanner(System.in);
        int num;
        do{
            System.out.println(mensaje);
            try {
                num = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("No has introducido un número");
                num = min - 1;
            }
            if (num < min || num > max) System.out.println("El número debe estar entre " + min + " y " + max);
        } while (num < min || num > max);

        return num;
    }
}
