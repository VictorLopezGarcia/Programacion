
package VLGt02;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt02e07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ano;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el ano: ");
        ano = teclado.nextInt();
        
        if(ano % 4 != 0 && ano % 100 == 0 || ano % 400 == 0){
            System.out.print("El ano introducido es bisiesto. ");
        }else{
            System.out.print("El ano introducido no es bisiesto. ");
        }
    }
}
