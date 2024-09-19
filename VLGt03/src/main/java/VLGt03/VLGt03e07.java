package VLGt03;

import java.util.Scanner;

public class VLGt03e07 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número natural entre 1 y 1000: ");
        num = teclado.nextInt();
        if (num <0 || num > 1000)
            System.out.println("Numero incorrecto.");
        else
            for (int i=num;i>=1;i--)
                if (num % i == 0) System.out.println(i);
    }
}
//Muestra los numeros divisibles por el introducido
//El if es redundante
//El for está mal formulado

