/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VLGt01;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt01e08b {

    public static void main(String[] args) {
        double p , sol;
        sol = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la edad de la primera persona: ");
        p = teclado.nextInt();
        sol += p;
        System.out.print("Introduce la edad de la segunda persona: ");
        p = teclado.nextInt();
        sol += p;
        System.out.print("Introduce la edad de la tercera persona: ");
        p = teclado.nextInt();
        sol += p;
        System.out.print("Introduce la edad de la cuarta persona: ");
        p = teclado.nextInt();
        sol += p;
        sol /= 4;
        System.out.println(String.format("La media de edades de las 4 personas es de %.2f años.", sol));
    }
}
