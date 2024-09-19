package VLGt03;

import java.util.Scanner;

public class VLGt03e11 {
    public static void main(String[] args) {
        int n1, n2, mayor, menor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        n1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        n2 = teclado.nextInt();
        if(n1 > n2){
            mayor = n1;
            menor = n2;
        }else {
            mayor = n2;
            menor = n1;
        }
        for (int i = menor+1; i < mayor; i++) {
            System.out.println(i +"^2 = "+ i*i);
        }
    }
}
