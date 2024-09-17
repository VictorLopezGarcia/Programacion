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
public class VLGt01e02 {

    public static void main(String[] args) {
        double dolar;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el valor en dólares: ");
        dolar = teclado.nextInt();
        System.out.println(dolar + "$ son " + dolar/1.14 + "€");
    }
    
}
