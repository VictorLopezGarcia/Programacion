package VLGt05;

import java.util.Scanner;
import static VLGt05.VLGt05e03.CalcularDiasMes;
import static VLGt05.VLGt05e03.esCorrecta;

public class VLGt05e04 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int dia, mes, ano, dia2, mes2, ano2, resultado;

        do{
            System.out.println("Introduce el dia1: ");
            dia = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce el mes1: ");
            mes = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce el año1: ");
            ano = Integer.parseInt(teclado.nextLine());
            if (!esCorrecta(dia, mes, ano)) {
                System.out.println("Introduzca una fecha valida");
            }

        }while (!esCorrecta(dia, mes, ano));

        do {
            System.out.println("Introduce el dia2: ");
            dia2 = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce el mes2: ");
            mes2 = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce el año2: ");
            ano2 = Integer.parseInt(teclado.nextLine());
            if (!esCorrecta(dia2, mes2, ano2) ||ano != ano2) {
                System.out.println("Introduzca una fecha valida");
            }
        }while (!esCorrecta(dia2, mes2, ano2) || ano != ano2);

        resultado = Math.abs((CalcularDiasMes(ano, mes) + dia)- (CalcularDiasMes(ano2, mes2) + dia2));

        System.out.println("Hay una diferencia de " + resultado + " dias entre las dos fechas");
    }
}
