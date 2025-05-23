package VLGt06;

import java.util.Scanner;

public class VLGt06e02 {

    static Scanner teclado;

    public static void main(String[] args) {
      menu();
    }


    private static void menu(){
        teclado = new Scanner(System.in);

        MovilPrepago movil = new MovilPrepago(654845389,0.23f, 0.23f, 0.03f, 10.00f);

        boolean salir = false;
        int opcion;
        do {
            opcion=pintarMenu ();
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es de: "+ movil.consultarSaldo() + "€"); break;
                case 2: recargar(movil); break;
                case 3: hacerLlamada(movil); break;
                case 4: navegar(movil); break;
                case 0: salir=true; break;
                default: System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu (){
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 consultar saldo");
        System.out.println("2 recarga");
        System.out.println("3 hacer llamada");
        System.out.println("4 navegar");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt (teclado.nextLine());
        } catch (Exception e ) {return 999;}
    }

    private static void recargar(MovilPrepago movil) {
        System.out.println("Introduce la cantidad a recargar: ");
        int cantidad = Integer.parseInt(teclado.nextLine());
        if (movil.recargar(cantidad)) {
            System.out.println("Recarga realizada con éxito");
        } else {
            System.out.println("La cantidad a recargar debe ser múltiplo de 5");
        }
    }

    private static void hacerLlamada(MovilPrepago movil) {
        System.out.println("Introduce la duración de la llamada en segundos: ");
        int duracion = Integer.parseInt(teclado.nextLine());
        movil.efectuarLlamada(duracion);
    }

    private static void navegar(MovilPrepago movil) {
        System.out.println("Introduce la cantidad de MB a navegar: ");
        int mb = Integer.parseInt(teclado.nextLine());
        movil.navegar(mb);
    }

}
