package VLGt03;

import java.util.Scanner;

public class VLGt03e10 {
    public static void main(String[] args) {
        int edad, sum=0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduce la edad de un alumno: ");
            edad = teclado.nextInt();
            if(edad<18)  sum++;
        }while (edad != -1);
        System.out.println("Hay un total de "+ sum +" alumnos menores de edad");
    }
}
