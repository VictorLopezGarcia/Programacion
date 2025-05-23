package VLGt10;

import java.util.Scanner;

public class VLGt10e14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Habitacion h1 = new Doble(1);
        Habitacion h2 = new Doble(2);
        Habitacion h3 = new Doble(3);

        Habitacion h4 = new Suite(4);
        Habitacion h5 = new Suite(5);
        Habitacion h6 = new Suite(6);

        Habitacion h7 = new Lowcost(7);
        Habitacion h8 = new Lowcost(8);
        Habitacion h9 = new Lowcost(9);

        Habitacion h10 = new Lowcost(10);
        Habitacion h11 = new Lowcost(11);
        Habitacion h12 = new Lowcost(12);

        Habitacion h13 = new Doble(13);
        Habitacion h14 = new Doble(14);
        Habitacion h15 = new Doble(15);

        Habitacion h16 = new Suite(16);
        Habitacion h17 = new Suite(17);
        Habitacion h18 = new Suite(18);

        Hotel hotel = new Hotel();

        hotel.addHabitacion(h1);
        hotel.addHabitacion(h2);
        hotel.addHabitacion(h3);
        hotel.addHabitacion(h4);
        hotel.addHabitacion(h5);
        hotel.addHabitacion(h6);
        hotel.addHabitacion(h7);
        hotel.addHabitacion(h8);
        hotel.addHabitacion(h9);
        hotel.addHabitacion(h10);
        hotel.addHabitacion(h11);
        hotel.addHabitacion(h12);
        hotel.addHabitacion(h13);
        hotel.addHabitacion(h14);
        hotel.addHabitacion(h15);
        hotel.addHabitacion(h16);
        hotel.addHabitacion(h17);
        hotel.addHabitacion(h18);

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Check-in");
            System.out.println("2. Check-out");
            System.out.println("3. Listar habitaciones libres");
            System.out.println("4. Listar habitaciones ocupadas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int option = teclado.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Habitaciones libres:");
                    hotel.habitacionesLibres();
                    System.out.print("Ingrese el número de habitación para hacer check-in: ");
                    int checkInNumero = teclado.nextInt();
                    hotel.checkIn(checkInNumero);
                    break;
                case 2:
                    System.out.println("Habitaciones ocupadas:");
                    hotel.habitacionesOcupadas();
                    System.out.print("Ingrese el número de habitación para hacer check-out: ");
                    int checkOutNumero = teclado.nextInt();
                    hotel.checkOut(checkOutNumero);
                    break;

                case 3:
                    System.out.println("Habitaciones libres:");
                    hotel.habitacionesLibres();
                    break;

                case 4:
                    System.out.println("Habitaciones ocupadas:");
                    hotel.habitacionesOcupadas();
                    break;

                case 5:
                    exit = true;
                    break;

                default: System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
