package VLGt15;

import java.util.Scanner;

public class VLGt15e02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double metrosCuadrados;
        int cajas;
        Tipo tipo = null;

        System.out.println("Ingrese el ancho de la habitación:");
        metrosCuadrados = Double.parseDouble(teclado.nextLine());
        System.out.println("Ingrese el largo de la habitación:");
        metrosCuadrados *= Double.parseDouble(teclado.nextLine());
        System.out.println("El área de la habitación es: " + metrosCuadrados + " m2");
        cajas = (int) Math.ceil(metrosCuadrados / 2.5);
        System.out.println("Número de cajas necesarias: " + cajas);

        do{
            try{
                System.out.println("Ingrese el tipo de madera (Roble, Sapelly, Nogal, Cerezo, Bambú):");
                String tipoMadera = teclado.nextLine();
                tipo = Tipo.fromString(tipoMadera);
                System.out.println("El precio por m2 de " + tipo + " es: " + tipo.getPrecio() + " €");
                System.out.println("EL precio total de la madera es: " + (tipo.getPrecio() * cajas) + " €, quieres cambiarlo? (S/N)");
                String respuesta = teclado.nextLine();
                if (respuesta.equalsIgnoreCase("S")) {
                    tipo = null;
                } else if (!respuesta.equalsIgnoreCase("N")) {
                    System.out.println("Respuesta no válida, por favor ingrese S o N.");
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }while (tipo == null);
        System.out.println("Madera seleccionada: " + tipo);
        System.out.println("Gracias por usar el programa.");

    }
}
