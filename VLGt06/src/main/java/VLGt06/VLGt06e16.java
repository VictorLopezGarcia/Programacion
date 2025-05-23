package VLGt06;


import java.util.Scanner;

public class VLGt06e16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean seguir;
        TableroGatoRaton tablero = new TableroGatoRaton(20, 20);
        Gato gato = new Gato(19, 19);
        Raton raton = new Raton(0, 0);
        tablero.colocarGato(gato);
        tablero.colocarRaton(raton);
        System.out.println("Tablero inicial");
        tablero.mostrar();
        do {
            System.out.println("--------------------");
            System.out.println("Turno de raton, pulsa enter para jugar");
            System.out.println("--------------------");
            teclado.nextLine();
            seguir =raton.mover(tablero);
            tablero.mostrar();
            if (!seguir) break;
            System.out.println("--------------------");
            System.out.println("turno del gato, pulsa enter para jugar");
            System.out.println("--------------------");
            teclado.nextLine();
            seguir =gato.mover(tablero);
            tablero.mostrar();
        }while (seguir);
    }
}
