package VLGt04;

import java.util.Scanner;

public class VLGt04e13 {
    public static void main(String[] args) {
        int entrada;
        long hex;
        String hexadecimal = "";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        entrada = Integer.parseInt(teclado.nextLine());
        do{
            hex =  (entrada % 16);
            if(hex<=9) {
                hexadecimal = hex + hexadecimal;
            }else{
                hexadecimal = (char)(hex+55) + hexadecimal;
            }
            entrada = entrada/16;
            }while(entrada!=0);

        System.out.println("El número en hexadecimal es: "+hexadecimal);

    }
}
