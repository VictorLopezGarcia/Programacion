package VLGt07;

import java.util.Calendar;
import java.util.Scanner;

public class VLGt07e04 {
    private static final int[] temperaturaMeses = new int[12];

    public static void main(String[] args) {
        char opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Escoge una opción:");
            System.out.println("a) Llenar el Array con valores al azar para todos los meses");
            System.out.println("b) Mostrar la temperatura");
            System.out.println("c) Mostrar la temperatura más alta");
            System.out.println("d) Mostrar el mes más frío");
            System.out.println("e) Desplazar valores a la derecha");
            System.out.println("f) Salir");
            opcion = teclado.next().charAt(0);
            switch (opcion) {
                case 'a':
                    llenarArray();
                    break;
                case 'b':
                    b();
                    break;
                case 'c':
                    c();
                    break;
                case 'd':
                    d();
                    break;
                case 'e':
                    e();
                    break;
                case 'f':
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 'f');
    }

    public static void llenarArray() {
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = (int) (Math.random() * 30);
            if(i<=2 || i>=10){
                temperaturaMeses[i] -= 10;
            }
            else temperaturaMeses[i] += 10;
        }
    }

    public static void b() {
        for (int i = 0; i < temperaturaMeses.length; i++) {

            System.out.println("Mes " + intToMes(i) + ": " + temperaturaMeses[i]);
        }
    }

    public static String intToMes(int mes){
        Calendar mesCalendar =  Calendar.getInstance();
        mesCalendar.set(Calendar.MONTH, mes);
        return mesCalendar.getDisplayName(Calendar.MONTH, Calendar.LONG, new java.util.Locale("es", "ES"));
    }

    public static void c() {
        double max = 0;
        for (int temperaturaMese : temperaturaMeses) {
            if (temperaturaMese > max) {
                max = temperaturaMese;
            }
        }
        System.out.printf("La temperatura máxima del año es: %+.1f\n", max);
    }

    public static void d() {
        int min = Integer.MAX_VALUE;
        int mes=0;
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (temperaturaMeses[i] < min) {
                min = temperaturaMeses[i];
                mes = i;
            }
        }
        System.out.println("El mes más frío es: " + intToMes(mes));
    }

    public static void e() {
        int ultimo = temperaturaMeses[temperaturaMeses.length-1];
        for (int i = temperaturaMeses.length-1; i >= 1; i--) {
            temperaturaMeses[i] = temperaturaMeses[i-1];
        }
        temperaturaMeses[0] = ultimo;
    }

}
