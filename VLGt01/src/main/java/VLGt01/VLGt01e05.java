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
public class VLGt01e05 {

    public static void main(String[] args) {
        double sol, c;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la temperatura en Celsius: ");
        c = teclado.nextInt();
        sol = (double)9/5*c + 32;
        System.out.println(String.format("%.2f grados Celsius son %.2f Fahrenheit.",c , sol));
    }   
}
