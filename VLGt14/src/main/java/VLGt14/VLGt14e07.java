package VLGt14;

import java.util.HashMap;
import java.util.Scanner;

public class VLGt14e07 {

    private  static final int MAX_JUGADORES = 25;

    public static void main(String[] args) {
        HashMap<String, Double> jugadores = new HashMap<>();
        HashMap<String, Integer> jugadoresEdad = new HashMap<>();
        String nombre;
        double salario;
        char opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Escoge una opción:");
            System.out.println("a) Añadir jugador");
            System.out.println("b) Eliminar jugador");
            System.out.println("c) Listar jugadores con su salario");
            System.out.println("d) Mostrar por salario (rango de +- 6000)");
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
                    else if (jugadores.size() >= MAX_JUGADORES) {
                        System.out.println("El equipo está completo");
                        break;
                    }
                    System.out.println("Introduce el salario del jugador:");
                    salario = Double.parseDouble(teclado.nextLine());
                    jugadores.put(nombre, salario);
                    System.out.println("Introduce la edad del jugador:");
                    int edad = Integer.parseInt(teclado.nextLine());
                    jugadoresEdad.put(nombre, edad);
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
                    for (String jugador : jugadores.keySet()) {
                        System.out.println("Jugador: " + jugador + ", Salario: " + jugadores.get(jugador) + ", Edad: " + jugadoresEdad.get(jugador));
                    }
                    break;
                case 'd':
                    System.out.println("Introduce el salario del jugador:");
                    salario = Double.parseDouble(teclado.nextLine());
                    System.out.println("Jugadores con salario en el rango de " + (salario - 6000) + " a " + (salario + 6000) + ":");
                    for (String jugador : jugadores.keySet()) {
                        if (jugadores.get(jugador) >= salario - 6000 && jugadores.get(jugador) <= salario + 6000) {
                            System.out.println("Jugador: " + jugador + ", Salario: " + jugadores.get(jugador) + ", Edad: " + jugadoresEdad.get(jugador));
                        }
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
