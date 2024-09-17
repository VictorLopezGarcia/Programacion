
package vlgt02;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt02e03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota, trabajo, practica;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota del examen: ");
        nota = teclado.nextDouble();
        System.out.println("Introduce la valoración del trabajo: ");
        trabajo = teclado.nextDouble();
        System.out.println("Introduce la nota de practicas: ");
        practica = teclado.nextDouble();
        
        if(nota >= 5 || nota > 4 && trabajo > 5 && practica > 5 || 
                nota > 4 && trabajo > 8 || nota > 4 && practica > 8){
            System.out.println("Aprobado.");
        }
        System.out.println("Suspenso.");
    }
}
