package VLGt14;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class VLGt14e15 {

    private static final int MAX_PARKING_SIZE = 10;

    public static void main(String[] args) {
        LinkedList<String> Parking = new LinkedList<>();
        String matricula;
        char opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Escoge una opción:");
            System.out.println("a) Aparcar");
            System.out.println("b) Desaparcar");
            System.out.println("c) Mostrar la lista de las matrículas de los coches");
            System.out.println("d) Salir");
            opcion = teclado.nextLine().charAt(0);
            switch (opcion) {
                case 'a':
                    if (Parking.size() >= MAX_PARKING_SIZE) {
                        System.out.println("El parking está lleno");
                        break;
                    }
                    System.out.println("Introduce la matrícula del coche:");
                    matricula = teclado.nextLine();
                    Parking.addFirst(matricula);
                    System.out.println("Coche aparcado: " + matricula);
                    break;
                case 'b':
                    if (Parking.isEmpty()) {
                        System.out.println("No hay coches aparcados");
                        break;
                    }
                    System.out.println("Coche desaparcado: " + Parking.getFirst());
                    Parking.removeFirst();
                    break;
                case 'c':
                    if (Parking.isEmpty()) {
                        System.out.println("No hay coches aparcados");
                        break;
                    }
                    Iterator<String> iterator = Parking.iterator();
                    System.out.println("Coches aparcados:");
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case 'd':
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 'd');
    }
}
