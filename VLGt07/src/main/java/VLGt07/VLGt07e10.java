package VLGt07;

import java.util.Scanner;

public class VLGt07e10 {

    private static int[][] temperaturaDia = new int[12][30];

    public static void main(String[] args) {
        char entrada;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("--------------------");
            System.out.println("Selecciona una opción: ");
            System.out.println("a) Llenar temperaturas");
            System.out.println("b) Mostrar temperaturas");
            System.out.println("c) Media anual");
            System.out.println("d) Media mensual");
            System.out.println("e) Temperaturas mínimas");
            System.out.println("f) Salir");
            System.out.println("--------------------");

            entrada = teclado.nextLine().charAt(0);

            switch (entrada){
                case 'a' -> llenarTemperaturas();
                case 'b' -> mostrar();
                case 'c' -> mediAnual();
                case 'd' -> mediaMensual();
                case 'e' -> minimas();
                case 'f' -> System.out.println("Adios");
            }
            System.out.println();
        }while (entrada != 'f');

    }

    public static void llenarTemperaturas(){
        for (int i = 0; i < temperaturaDia.length; i++) {
            for (int j = 0; j < temperaturaDia[i].length; j++) {
                if (i<3 || i>9){
                    temperaturaDia[i][j] = (int) (Math.random()*30-10);
                } else {
                    temperaturaDia[i][j] = (int) (Math.random()*35+10);
                }
            }
        }
    }

    public static void mostrar(){
        for (int i = 0; i < temperaturaDia.length; i++) {
            for (int j = 0; j < temperaturaDia.length; j++) {
                System.out.printf("%+3d", temperaturaDia[i][j]);
            }
            System.out.println();
        }
    }

    public static void mediAnual(){
        double media=0;
        for (int[] temperatura : temperaturaDia) {
            for (int j = 0; j < temperaturaDia.length; j++) {
                media += temperatura[j];
            }
        }
        media = media/(temperaturaDia.length*temperaturaDia[0].length);
        System.out.println("La media anual de las temperaturas es: "+ media);
    }

    public static void mediaMensual(){
        for (int[] temperatura : temperaturaDia) {
            double media=0;
            for (int j = 0; j < temperaturaDia.length; j++) {
                media += temperatura[j];
            }
            media = media/(temperaturaDia[0].length);
            System.out.println("La temperatura media mensual es: "+ media);
        }
    }

    public static void minimas(){
        int[] min = new int[temperaturaDia.length];
        for (int i = 0; i < temperaturaDia.length; i++) {
            min[i] = temperaturaDia[i][0];
            for (int j = 0; j < temperaturaDia[i].length; j++) {
                if (temperaturaDia[i][j]<min[i]){
                    min[i] = temperaturaDia[i][j];
                }
            }
            System.out.println("La temperatura mínima del mes "+(i+1)+" es: "+min[i]);
        }
    }
}
