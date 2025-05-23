package VLGt14;


import java.util.HashMap;
import java.util.Scanner;

public class VLGt14e06 {
    public static void main(String[] args) {
        HashMap <String, Double> jugadores = new HashMap<>();
        String nombre;
        char opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Escoge una opción:");
            System.out.println("a) Añadir jugador");
            System.out.println("b) Eliminar jugador");
            System.out.println("c) Consultar salario de un jugador");
            System.out.println("d) Incrementar salario en un 10%");
            System.out.println("e) Salir");
            opcion = teclado.nextLine().charAt(0);
            switch (opcion) {
                case 'a':
                    System.out.println("Introduce el nombre del jugador:");
                    nombre = teclado.nextLine();
                    if (jugadores.containsKey(nombre)) {
                        System.out.println("El jugador ya existe");
                        break;
                    }
                    System.out.println("Introduce el salario del jugador:");
                    double salario = Double.parseDouble(teclado.nextLine());
                    jugadores.put(nombre, salario);
                    break;
                case 'b':
                    System.out.println("Introduce el nombre del jugador:");
                    nombre = teclado.nextLine();
                    if (jugadores.containsKey(nombre)) {
                        jugadores.remove(nombre);
                        System.out.println("Jugador eliminado");
                    }else{
                        System.out.println("El jugador no existe");
                    }
                    break;
                case 'c':
                    System.out.println("Introduce el nombre del jugador:");
                    nombre = teclado.nextLine();
                    if (jugadores.containsKey(nombre)) {
                        System.out.println("El salario del jugador " + nombre + " es: " + jugadores.get(nombre));
                    }else{
                        System.out.println("El jugador no existe");
                    }
                    break;
                case 'd':
                    System.out.println("Introduce el nombre del jugador:");
                    nombre = teclado.nextLine();
                    if (jugadores.containsKey(nombre)) {
                        jugadores.put(nombre, jugadores.get(nombre)*1.1);
                        System.out.println("El nuevo salario del jugador " + nombre + " es: " + jugadores.get(nombre));
                    }else{
                        System.out.println("El jugador no existe");
                    }
                    break;
                case 'e':
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 'e');
    }
}
