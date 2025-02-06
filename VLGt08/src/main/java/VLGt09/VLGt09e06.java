package VLGt09;

import VLGt08.MovilPlus;
import VLGt08.MovilPrepago;
import VLGt08.MovilTarifaPlana;

import java.util.Scanner;

public class VLGt09e06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        MovilPrepago [] moviles = new MovilPrepago[5];

        MovilPrepago movil;

        for (int i = 0; i < 5; i++) {
            System.out.println("Movil "+(i+1));
            System.out.println("Indicar tipo de movil: ");
            System.out.println("1. MovilPrepago");
            System.out.println("2. MovilPlus");
            System.out.println("3. MovilTarifaPlana");

            int opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("MovilPrepago");
                    System.out.println("Indicar numero: ");
                    int numero = Integer.parseInt(teclado.nextLine());
                    System.out.println("Indicar saldo: ");
                    float saldo = Float.parseFloat(teclado.nextLine());
                    moviles[i] = new MovilPrepago(numero, 0.02f , 0.05f, 0.01f, saldo);
                    break;
                case 2:
                    System.out.println("MovilPlus");
                    System.out.println("Indicar numero: ");
                    numero = Integer.parseInt(teclado.nextLine());
                    System.out.println("Indicar saldo: ");
                    saldo = Float.parseFloat(teclado.nextLine());
                    moviles[i] = new MovilPlus(numero, 0.02f , 0.05f, 0.01f, saldo);
                    break;
                case 3:
                    System.out.println("MovilTarifaPlana");
                    System.out.println("Indicar numero: ");
                    numero = Integer.parseInt(teclado.nextLine());
                    System.out.println("Indicar saldo: ");
                    saldo = Float.parseFloat(teclado.nextLine());
                    moviles[i] = new MovilTarifaPlana(numero, 0.02f , 0.05f, saldo);
                    break;
                default:
                    moviles[i] = null;
                    System.out.println("Opcion no valida");
            }
        }


        int opcion;

        do {
            do {
                System.out.println("Indica el movil a usar: ");
                for (int i = 0; i < 5; i++) {
                    System.out.println((i+1)+". "+moviles[i].toString());
                }
                opcion = Integer.parseInt(teclado.nextLine());
                movil = moviles[opcion-1];
            }while (movil == null);

            System.out.println("Indicar operacion: ");
            System.out.println("1. Efectuar llamada");
            System.out.println("2. Navegar");
            System.out.println("3. Recargar");
            System.out.println("4. Mostrar saldo");
            if(movil instanceof MovilPlus){
                System.out.println("5. Videollamada");
                System.out.println("6. Salir");
            }else System.out.println("5. Salir");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("Indicar duracion de la llamada: ");
                    int duracion = Integer.parseInt(teclado.nextLine());
                    movil.efectuarLlamada(duracion);
                    break;
                case 2:
                    System.out.println("Indicar megas a navegar: ");
                    int megas = Integer.parseInt(teclado.nextLine());
                    movil.navegar(megas);
                    break;
                case 3:
                    System.out.println("Indicar cantidad a recargar: ");
                    int cantidad = Integer.parseInt(teclado.nextLine());
                    movil.recargar(cantidad);
                    break;
                case 4:
                    System.out.println("Saldo: "+movil.getSaldo());
                    break;
                case 5:
                    if(movil instanceof MovilPlus){
                        System.out.println("Indicar duracion de la videollamada: ");
                        duracion = Integer.parseInt(teclado.nextLine());
                        ((MovilPlus) movil).videollamada(duracion);
                    }
                    else return;
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
            }

        }while(opcion!=5);

    }

}
