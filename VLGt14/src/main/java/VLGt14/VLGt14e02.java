package VLGt14;

import java.util.LinkedList;
import java.util.Scanner;

public class VLGt14e02 {

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
                    Parking.push(matricula);
                    System.out.println("Coche aparcado: " + matricula);
                    break;
                case 'b':
                    if (Parking.isEmpty()) {
                        System.out.println("No hay coches aparcados");
                        break;
                    }
                    System.out.println("Coche desaparcado: " + Parking.pop());
                    break;
                case 'c':
                    if (Parking.isEmpty()) {
                        System.out.println("No hay coches aparcados");
                        break;
                    }
                    System.out.println("Coches aparcados:");
                    for (int i = 1; i <= Parking.size(); i++) {
                        System.out.println(i+ " " +Parking.get(i-1));
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
