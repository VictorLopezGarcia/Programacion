package VLGt01;

import java.util.Scanner;

public class VLGt01e06 {

    final private static double gan = 1.1;
    final private static double imp = 1.2;
    
    public static void main(String[] args) {
        double cost, sol;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el importe del vehículo: ");
        cost = teclado.nextInt();
        sol = cost*gan*imp;
        System.out.println(String.format("El coste del vehiculo despues de impuestos es de: %.2f€"
                , sol));
    }
}
