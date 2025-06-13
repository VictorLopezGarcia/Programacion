package VLGt10;

import java.util.Scanner;

public class VLGt10e05 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0, fila, columna;
        PiezaAjedrez pieza;

        do {
            System.out.println("1. Alfil");
            System.out.println("2. Torre");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();
        }  while (opcion != 3);

        if (opcion == 1) {
            pieza = new AlfilAjedrez(0, 0);
        } else if (opcion == 2) {
            pieza = new TorreAjedrez(0, 0);
        }else {
            return;
        }
        do {
            imprimirTablero(pieza);
            System.out.println("Introduce fila y columna");
            fila = teclado.nextInt();
            columna = teclado.nextInt();
            if (pieza.mover(fila, columna)) {
                pieza.setFila(fila);
                pieza.setColumna(columna);
            } else {
                System.out.println("Movimiento no válido");
            }
        }while (fila != -1);
    }


    public static void imprimirTablero(PiezaAjedrez pieza){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++){
                if (pieza.getFila() == i && pieza.getColumna() == j){
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}
