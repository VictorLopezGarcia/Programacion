package VLGt12;

import java.util.Scanner;

public class VLGt12e04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double[] temperaturas = new Double[7];
        double media = 0;
        int menor, mayor;

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Math.random() * 40;
        }


        try {
            System.out.println("Introduce un día de la semana (0-6): ");
            menor = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce un día de la semana (0-6): ");
            mayor = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) { // si no se introduce un número
            System.out.println("No has introducido un número");
            return;
        }

        try{
            for (int i = menor; i < mayor; i++) {
                media += temperaturas[i];
            }
            media /= (mayor - menor);
        } catch (ArrayIndexOutOfBoundsException e) { // si se introduce un número fuera de rango del array
            media = 0;
        }

        System.out.println("La media de las temperaturas es: " + media);
    }
}
