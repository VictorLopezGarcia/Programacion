package VLGt10;

public class AlfilAjedrez_v2 extends PiezaAjedrez_v2 {
    public AlfilAjedrez_v2(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public boolean mover(int fila, int columna) {
        return Math.abs(fila - getFila()) == Math.abs(columna - getColumna());
    }
}
