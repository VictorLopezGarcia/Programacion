
package src.main.java.vlgt02;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt02e08 {

  
    public static void main(String[] args) {
        int dia, hora;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el dia: ");
        dia = teclado.nextInt();
       
        System.out.print("Introduce la hora: ");
        hora = teclado.nextInt();
        
        if(dia < 1 || dia > 7 || hora < 9 || hora > 14){
            System.out.println("Introduzca datos validos.");
        }else if(hora == 10 || dia == 7 || hora == 14 && dia != 6 || dia == 4 && hora == 12){
            System.out.println("Hay bus.");
        }else System.out.println("No hay bus.");
    }
}
