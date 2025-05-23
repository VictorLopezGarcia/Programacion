package VLGt06;

import java.util.Scanner;

public class VLGt06e05 {

    static Scanner teclado;
    static Ahorcado ahorcado;

    public static void main(String[] args) {
        System.out.println("Ahorcado:");
        menu();
    }

    private static void menu(){
        teclado = new Scanner(System.in);

        boolean salir = false;
        int opcion;
        do {
            opcion=pintarMenu ();
            switch (opcion) {
                case 1: ahorcadoSinPista(); break;
                case 2: ahorcadoConPista(); break;
                case 0: salir=true; break;
                default: System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu (){
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 jugar sin pistas");
        System.out.println("2 jugar con pistas");
        System.out.println("0 Salir del programa");
        try {
            return Integer.parseInt (teclado.nextLine());
        } catch (Exception e ) {return 999;}
    }

    private static void ahorcadoSinPista(){
        System.out.println("Jugando sin pistas");
        System.out.println("Introduce la palabra a adivinar: ");
        String palabra = teclado.nextLine();
        ahorcado = new Ahorcado(palabra);
        jugar();
    }

    private static void ahorcadoConPista(){
        System.out.println("Jugando con pistas");
        System.out.println("Introduce la palabra a adivinar: ");
        String palabra = teclado.nextLine();
        System.out.println("Introduce la pista: ");
        String pista = teclado.nextLine();
        ahorcado = new Ahorcado(palabra, pista);
        jugar();
    }

    private static void jugar(){
        do{
            if(ahorcado.probarLetra(ahorcado.leerLetra())){
                System.out.println("¡Enhorabuena! Has adivinado una letra");
            }else{
                System.out.println("¡Has fallado!");
            }
            ahorcado.pintar();
            if(ahorcado.adivinada()){
                System.out.println("¡Enhorabuena! Has ganado");
                break;
            }
        }while (!ahorcado.perdio());
        if(ahorcado.perdio()){
            System.out.println("¡Lo siento! Has perdido");
        }
    }
}
