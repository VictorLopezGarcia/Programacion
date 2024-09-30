package VLGt06;

public class VLGt06e06 {

    static Nim nim = new Nim();

    public static void main(String[] args) {
        System.out.println("Nim:");

        juego();

    }

    private static void juego(){
        do{
            Consola.pintarTablero(nim);
            System.out.println("Juega la máquina: ");
            if(logicaMaquina()){
                System.out.println("Ha ganado la máquina");
                break;
            }
            Consola.pintarTablero(nim);
            System.out.println("Juega el jugador: ");
            if(logicaJugador()){
                System.out.println("Ha ganado el jugador");
            }
        }while(!nim.fin());
        Consola.pintarTablero(nim);
    }

    private static boolean logicaMaquina(){
        int fila = nim.piensa()/10;
        int palos = nim.piensa()%10;
        nim.juega(fila, palos);
        return nim.fin();
    }

    private static boolean logicaJugador(){
        int fila = Consola.leerEntero("Fila: ");
        int palos = Consola.leerEntero("Palos: ");
        nim.juega(fila-1, palos);
        return nim.fin();
    }
}
