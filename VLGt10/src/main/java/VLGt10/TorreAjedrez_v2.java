package VLGt10;

public class TorreAjedrez_v2 extends PiezaAjedrez_v2 {
    public TorreAjedrez_v2(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public boolean mover(int fila, int columna) {
        return fila == getFila() || columna == getColumna();
    }
}
