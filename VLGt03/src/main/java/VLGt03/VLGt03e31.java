package VLGt03;


import java.util.Scanner;

public class VLGt03e31 {
    public static void main(String[] args) {
        int sum = 0, primero=0, segundo=0, tercero=0, antepenultimo=0, penultimo=0, ultimo=0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 30; i++) {
            System.out.println("Introduce un numero entre 0 y 1000");
            int num = teclado.nextInt();
            if (num < 0 || num > 1000) {
                System.out.println("Numero no valido");
                i--;
            } else {
                if (i == 0) {
                    primero = num;
                } else if (i == 1) {
                    segundo = num;
                } else if (i == 2) {
                    tercero = num;
                }
                if (i == 27) {
                    antepenultimo = num;
                } else if (i == 28) {
                    penultimo = num;
                } else if (i == 29) {
                    ultimo = num;
                }
                sum += num;
            }
        }
        if (sum % 2 == 0){
            System.out.println("Los 3 primeros numeros introducidos son: "+primero+", "+segundo+", "+tercero);
        }else{
            System.out.println("Los 3 ultimos numeros introducidos son: "+antepenultimo+", "+penultimo+", "+ultimo);
        }
    }
}
