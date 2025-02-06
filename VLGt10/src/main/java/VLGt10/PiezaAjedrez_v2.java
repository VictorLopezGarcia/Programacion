package VLGt10;

import java.util.Scanner;

public abstract class PiezaAjedrez_v2 {
    private int fila;
    private int columna;
    private static Scanner teclado = new Scanner(System.in);

    public PiezaAjedrez_v2(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public abstract boolean mover(int fila, int columna);

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public static int pedirColumna() {
        char columna;
        do {
            System.out.print("Introduce columna: ");
            columna = teclado.next().charAt(0);
            if (columna < 'a' || columna > 'h') {
                System.out.println("Columna no válida");
            }
        }while (columna < 'a' || columna > 'h');
        return columna - 'a';
    }

    public static int pedirFila() {
        int fila;
        do {
            System.out.print("Introduce fila: ");
            fila = teclado.nextInt();
            if (fila < 1 || fila > 8) {
                System.out.println("Fila no válida");
            }
        }while (fila < 1 || fila > 8);
        return fila - 1;
    }

}
