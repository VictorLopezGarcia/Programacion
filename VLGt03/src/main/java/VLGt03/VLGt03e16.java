package VLGt03;

import java.util.Scanner;

public class VLGt03e16 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100), guess, cont = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Intente adivinar un numero entre 0 y 99: ");
            guess = teclado.nextInt();
            if(guess < randomNumber) System.out.println("El numero es mayor.");
            else if(guess > randomNumber) System.out.println("El numero es menor.");
            else System.out.println("Has acertado!");
        } while (guess != randomNumber&&cont++<4);
        if(cont>=4) System.out.println("Has agotado tus intentos.");
    }
}
