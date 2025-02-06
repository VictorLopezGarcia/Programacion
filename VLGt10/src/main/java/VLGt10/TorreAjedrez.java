package VLGt10;

public class TorreAjedrez extends PiezaAjedrez {
    public TorreAjedrez(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public boolean mover(int fila, int columna) {
        return fila == getFila() || columna == getColumna();
    }
}
