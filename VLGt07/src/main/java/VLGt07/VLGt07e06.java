package VLGt07;

import java.util.Scanner;

public class VLGt07e06 {
    public static void main(String[] args) {
        Parking parking = new Parking();
        char opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Escoge una opción:");
            System.out.println("a) Mostrar el estado del parking");
            System.out.println("b) Aparcar");
            System.out.println("c) Desaparcar");
            System.out.println("d) Mostrar la cantidad de plazas libres");
            System.out.println("e) Salir");
            opcion = teclado.next().charAt(0);
            switch (opcion) {
                case 'a':
                    parking.mostrar();
                    break;
                case 'b':

                    System.out.println("Introduce la matricula:");
                    String matricula = teclado.next();
                    int plaza = parking.aparcar(matricula);
                    if(plaza==0) {
                        System.out.println("No hay plazas libres");
                    } else {
                        System.out.println("Plaza " + plaza);
                    }
                    break;

                case 'c':

                    String coche = parking.desaparcar();
                    if (coche.isEmpty()) {
                        System.out.println("No hay coches");
                    } else {
                        System.out.println("Matricula: " + coche);
                    }
                    break;

                case 'd':
                    System.out.println("Plazas libres: " + parking.libre());
                    break;
                case 'e':
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 'e');
    }

}
