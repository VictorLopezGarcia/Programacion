
package src.main.java.vlgt02;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt02e09 {

    
    public static void main(String[] args) {
        int hora;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        hora = teclado.nextInt();
        
        if(hora >= 0 && hora <= 23){
            if(hora >= 9 && hora <= 14){
                System.out.println("Hay bus ");
                switch (hora) {
                    case 10 -> {
                        System.out.print("todos los dias.");
                        break;
                    }
                    case 12 -> {
                        System.out.print("el jueves y el domingo.");
                        break;
                    }
                    case 14 -> {
                        System.out.print("todos los dias menos el sabado.");
                        break;
                    }
                    default ->
                        System.out.print(" el domingo.");
                }
            }else{
                System.out.println("No hay bus ");
            }
        }
        else{
            System.out.println("Introduzca una hora valida.");
        }
    }
}
