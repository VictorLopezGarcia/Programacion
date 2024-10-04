package VLGt06;

public class TableroGatoRaton {
    private int filas;
    private int columnas;
    private char[][] tablero;
    private int ratonf;
    private int ratonc;

    public TableroGatoRaton(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        tablero = new char[filas][columnas];
        inicializar();
    }

    public char[][] getTablero() {
        return tablero;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    private void inicializar() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = '.';
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void borrar(int  fila, int columna){
        tablero[fila][columna] = '.';
    }

    public void colocarGato(Gato gato) {
        tablero[gato.getFila()][gato.getColumna()] = 'G';
    }

    public void colocarRaton(Raton raton) {
        ratonf = raton.getFila();
        ratonc = raton.getColumna();
        if(tablero[raton.getFila()][raton.getColumna()] != 'G'){
            tablero[raton.getFila()][raton.getColumna()] = 'R';
        }
    }

    public int getRatonf(){
        return ratonf;
    }

    public int getRatonc(){
        return ratonc;
    }
}
