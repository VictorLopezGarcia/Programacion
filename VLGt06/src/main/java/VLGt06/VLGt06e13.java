package VLGt06;

import java.io.IOException;

public class VLGt06e13 {
    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenidos a la ruleta rusa");
        Pistola pistola = new Pistola();
        pistola.cargar();
        System.out.println("Comienza el juego");
        do {
            System.out.println("Jugador1 pulsa intro para disparar");
            System.in.read();
            if(!pistola.jugar()) break;
            System.out.println("Quedan " + pistola.getDisparoRestante() + " disparos");
            System.out.println("Jugador2 pulsa intro para disparar");
            System.in.read();
            if(!pistola.jugar()) break;
            System.out.println("Quedan " + pistola.getDisparoRestante() + " disparos");

        } while (true);

        System.out.println("Fin del juego");

    }
}
