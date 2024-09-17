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
public class VLGt01e08 {

    public static void main(String[] args) {
        double p1, p2, p3, p4, sol;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la edad de la primera persona: ");
        p1 = teclado.nextInt();
        System.out.print("Introduce la edad de la segunda persona: ");
        p2 = teclado.nextInt();
        System.out.print("Introduce la edad de la tercera persona: ");
        p3 = teclado.nextInt();
        System.out.print("Introduce la edad de la cuarta persona: ");
        p4 = teclado.nextInt();
        sol = (double)(p1+p2+p3+p4)/4;
        System.out.println(String.format("La media de edades de las 4 personas es de %.2f años.", sol));
    }
}
