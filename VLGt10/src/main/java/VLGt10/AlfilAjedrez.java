package VLGt10;

public class AlfilAjedrez extends PiezaAjedrez {
    public AlfilAjedrez(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public boolean mover(int fila, int columna) {
        return Math.abs(fila - getFila()) == Math.abs(columna - getColumna());
    }
}
