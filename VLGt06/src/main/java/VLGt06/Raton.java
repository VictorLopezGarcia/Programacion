package VLGt06;

public class Raton {
    public int fila;
    public int columna;

    public Raton(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }
    public int getColumna() {
        return columna;
    }

    public boolean mover(TableroGatoRaton tablero) {
        int random = (int) (Math.random() * 4);
        switch (random) {
            case 0: {
                if (fila > 1) {
                    tablero.borrar(fila, columna);
                    fila -= 2;
                    if (tablero.getTablero()[fila][columna] == 'G') {
                        System.out.println("Gato ha ganado");
                        return false;
                    }
                    tablero.colocarRaton(this);
                } else {
                    mover(tablero);
                }
                break;
            }
            case 1: {
                if (fila < tablero.getFilas() - 2) {
                    tablero.borrar(fila, columna);
                    fila+=2;
                    if (tablero.getTablero()[fila][columna] == 'G') {
                        System.out.println("Gato ha ganado");
                        return false;
                    }
                    tablero.colocarRaton(this);
                } else {
                    mover(tablero);
                }
                break;
            }
            case 2: {
                if (columna > 1) {
                    tablero.borrar(fila, columna);
                    columna-=2;
                    if (tablero.getTablero()[fila][columna] == 'G') {
                        System.out.println("Gato ha ganado");
                        return false;
                    }
                    tablero.colocarRaton(this);
                } else {
                    mover(tablero);
                }
                break;
            }
            case 3: {
                if (columna < tablero.getColumnas() - 2) {
                    tablero.borrar(fila, columna);
                    columna+=2;
                    if (tablero.getTablero()[fila][columna] == 'G') {
                        System.out.println("Gato ha ganado");
                        return false;
                    }
                    tablero.colocarRaton(this);
                } else {
                    mover(tablero);
                }
                break;
            }
            default: {
                mover(tablero);
            }
        }
        return true;
    }
}
