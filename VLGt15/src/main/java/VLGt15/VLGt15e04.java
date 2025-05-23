package VLGt15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VLGt15e04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        do{
        try{
            System.out.println("Introduce un numero entero:");
            numero = Integer.parseInt(teclado.nextLine());
        }catch (NumberFormatException e){
            System.out.println("El valor introducido no es un numero entero.");
        }catch (InputMismatchException e){
            System.out.println("El valor introducido es demasido grande o pequeño.");
        }
        catch (Exception e){
            System.out.println("Error inesperado: " + e.getMessage());
        }
        }while (numero == 0);
        System.out.println("El numero " + numero +" en hexadecimal es: " + Integer.toHexString(numero));
    }
}
