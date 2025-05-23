package VLGt05;

import static VLGt05.VLGt05e06.cantidadDivisores;

public class VLGt05e07 {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1; i <= 1000; i++) {
            if(cantidadDivisores(i) == 2){
                contador++;
            }
        }
        System.out.println("Hay " + contador + " numeros primos entre 1 y 1000");
    }
}
