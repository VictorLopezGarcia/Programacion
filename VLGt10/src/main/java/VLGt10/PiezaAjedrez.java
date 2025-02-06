package VLGt10;

public abstract class PiezaAjedrez {
    private int fila;
    private int columna;

    public PiezaAjedrez(int fila, int columna) {
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
}
