package VLGt03;

import java.util.Scanner;

public class VLGt03e05 {
    public static void main(String[] args) {
        int x, sum = 0;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Introduce el numero a sumar: ");
            x = teclado.nextInt();
            if(x>=0){
                sum += x;
                System.out.println(sum);
            }
        }while(x!=-1);
    }
}
