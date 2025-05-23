package VLGt14;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class VLGt14e13 {
    static Scanner teclado;
    static Random random;
    static final int HORAS = 8;
    static LinkedList <Integer> cola;
    static LinkedList <Integer> cola2;
    static int instanteSiguCliente;
    static int t;
    static int clientesAtendidos = 0;
    static int clientesNoAtendidos = 0;

    //la cola contiene los minutos que va a requerir la atención del cajero
    // cuando le toque. Al primero de la cola se le va reduciendo en cada instante.
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        random = new Random();
        cola = new LinkedList<>();
        cola2 = new LinkedList<>();
        instanteSiguCliente = random.nextInt(5) + 3;

        //un bucle simula los minutos que van pasando
        for (t=1; t<=HORAS*60;t++){
            if (!cola.isEmpty()) {
                //reducir el tiempo de atencion del primero de la lista
                //que es el que está siendo atendido
                cola.set(0,cola.getFirst()-1);
                //si ese tiempo es cero, acabó de atenderlo. Sale de la cola
                if (cola.getFirst()==0) {
                    clientesAtendidos++;
                    cola.removeFirst();
                }

            }
            if (!cola2.isEmpty()) {
                cola2.set(0,cola2.getFirst()-1);
                if (cola2.getFirst()==0) {
                    cola2.removeFirst();
                    clientesAtendidos++;
                }
            }
            //se añade un nuevo cliente a a la lista (instante aleatorio)
            if (t == instanteSiguCliente) {
                if( cola.size() < 5 && cola.size() <= cola2.size()) {
                    cola.addLast(random.nextInt(9)+3);
                }else if (cola2.size() < 5) {
                    cola2.addLast(random.nextInt(9)+3);
                }
                else {
                    clientesNoAtendidos++;
                }
                instanteSiguCliente += random.nextInt(5) + 3;
            }
        }
        mostrarResultado();
    }

    static void mostrarResultado(){
        System.out.println("Fin de la simulación");
        System.out.println("Clientes atendidos: " + clientesAtendidos);
        System.out.println("Clientes no atendidos: " + clientesNoAtendidos);
    }

    static void mostrarCola(){
        System.out.print("Minuto: " + t);
        System.out.println("(Sig.cli llegará en minuto:" + instanteSiguCliente +")");
        for (int i=0;i<cola.size();i++) {
            System.out.printf("%02d",cola.get(i));
            if (i==0) System.out.println(" <<< Atendiendo (tiempo para terminar)");
            else
                System.out.println(" <<< Esperando (tiempo en caja cuando le toque)");
        }
        System.out.println("---------------\nPulsa");
        teclado.nextLine();
    }

}
