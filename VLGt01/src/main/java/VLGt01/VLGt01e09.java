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
public class VLGt01e09 {

    public static void main(String[] args) {
        int var1, var2, temp;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();
        temp = var2;
        var2 = var1;
        var1 = temp;
        System.out.println("Ahora var1 es igual a "+ var1);
        System.out.println("Ahora var2 es igual a "+ var2);
    }
    
}
