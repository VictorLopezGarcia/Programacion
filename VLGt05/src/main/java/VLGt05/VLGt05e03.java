package VLGt05;

import java.util.Scanner;

public class VLGt05e03 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int dia, mes, ano, resultado = 0;

        do{
            System.out.println("Introduce el dia: ");
            dia = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce el mes: ");
            mes = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce el año: ");
            ano = Integer.parseInt(teclado.nextLine());
            if (!esCorrecta(dia, mes, ano)) {
                System.out.println("Introduzca una fecha valida");
            }

        }while (!esCorrecta(dia, mes, ano));


        for (int i = 1; i < mes; i++) {
            resultado += CalcularDiasMes(ano, i);
        }
        resultado += dia;

        System.out.println("han pasado " + resultado + " dias desde el inicio del año");

    }

    public static int CalcularDiasMes(int ano, int mes) {
        return switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0) ? 29 : 28;
            default -> 0;
        };
    }

    public static boolean esCorrecta(int d, int m, int a) {
        if(d >= 0 && d <= 31 && m > 0 && m <= 12 && a >= 0){
            if(m == 2){
                if (a % 4 != 0 && a % 100 == 0 || a % 400 == 0) {
                    return d <= 29;
                }
                else return d <= 28;
            }else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
                return true;
            }else return d <= 30;
        }
        return false;
    }
}
