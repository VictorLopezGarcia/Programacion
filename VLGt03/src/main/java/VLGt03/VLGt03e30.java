package VLGt03;

import java.util.Scanner;

public class VLGt03e30 {
    public static void main(String[] args) {
        int entradas, entradasCompradas, maxEntradas = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de entradas a vender: ");
        entradas = teclado.nextInt();
        do{
            System.out.println("Introduce el numero de entradas a comprar: ");
            entradasCompradas = teclado.nextInt();
            while(entradasCompradas > 10 || entradasCompradas <= 0){
                System.out.println("No puedes comprar mas de 10 entradas, ni negativas");
                System.out.println("Introduce el numero de entradas a comprar: ");
                entradasCompradas = teclado.nextInt();
            }
            if(entradasCompradas > entradas){
                System.out.println("No hay suficientes entradas");
                System.out.println("quedan "+entradas+" entradas");
            }else{
                entradas -= entradasCompradas;
                if(entradasCompradas > maxEntradas){
                    maxEntradas = entradasCompradas;
                }
                System.out.println("Quedan "+entradas+" entradas");
            }
        }while (entradas > 0);
        System.out.println("La venta ha finalizado");
        System.out.println("La venta maxima ha sido de "+maxEntradas+" entradas");
    }
}
