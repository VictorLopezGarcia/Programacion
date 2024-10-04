package VLGt06;

public class Gato {
    private int fila;
    private int columna;

    public Gato(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public boolean mover(TableroGatoRaton tablero){
        int distanciaF = Math.abs(tablero.getRatonf() - fila);
        int distanciaC = Math.abs(tablero.getRatonc() - columna);
        if(fila > tablero.getRatonf() && distanciaF >= distanciaC){
            tablero.borrar(fila, columna);
            fila--;
            if (tablero.getTablero()[fila][columna] == 'R'){
                System.out.println("Gato ha ganado");
                return false;
            }
            tablero.colocarGato(this);
        }
        else if(fila < tablero.getRatonf() && distanciaF >= distanciaC){
            tablero.borrar(fila, columna);
            fila++;
            if (tablero.getTablero()[fila][columna] == 'R'){
                System.out.println("Gato ha ganado");
                return false;
            }
            tablero.colocarGato(this);
        }
        else if(columna > tablero.getRatonc() && distanciaC > distanciaF){
            tablero.borrar(fila, columna);
            columna--;
            if (tablero.getTablero()[fila][columna] == 'R'){
                System.out.println("Gato ha ganado");
                return false;
            }
            tablero.colocarGato(this);
        }
        else if(columna < tablero.getRatonc() && distanciaC > distanciaF){
            tablero.borrar(fila, columna);
            columna++;
            if (tablero.getTablero()[fila][columna] == 'R'){
                System.out.println("Gato ha ganado");
                return false;
            }
            tablero.colocarGato(this);
        }
        return true;
    }
}
