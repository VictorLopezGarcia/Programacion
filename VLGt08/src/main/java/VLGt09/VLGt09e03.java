package VLGt09;

import VLGt08.*;

import java.util.Scanner;

public class VLGt09e03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Figura2D_V8 figura;
        System.out.println("Indicar tipo de figura: ");
        System.out.println("1. Triangulo");
        System.out.println("2. Triancolor");
        System.out.println("3. Rectangulo");


        int opcion = Integer.parseInt(teclado.nextLine());

        if (opcion == 1) {
            System.out.println("Triangulo");
            System.out.println("Indicar estilo: ");
            String estilo = teclado.nextLine();
            System.out.println("Indicar alto: ");
            double alto = Double.parseDouble(teclado.nextLine());
            System.out.println("Indicar ancho: ");
            double ancho = Double.parseDouble(teclado.nextLine());
            System.out.println("Indicar nombre: ");
            String nombre = teclado.nextLine();
            figura = new Triangulo_V8(ancho, alto, estilo, nombre);
        } else if (opcion == 2) {
            System.out.println("Triancolor");
            System.out.println("Indicar estilo: ");
            String estilo = teclado.nextLine();
            System.out.println("Indicar alto: ");
            double alto = Double.parseDouble(teclado.nextLine());
            System.out.println("Indicar ancho: ");
            double ancho = Double.parseDouble(teclado.nextLine());
            System.out.println("Indicar nombre: ");
            String nombre = teclado.nextLine();
            System.out.println("Indicar color: ");
            String color = teclado.nextLine();
            figura = new TrianColor_V8(ancho, alto, estilo, color, nombre);

        } else {
            System.out.println("Rectangulo");
            System.out.println("Indicar alto: ");
            double alto = Double.parseDouble(teclado.nextLine());
            System.out.println("Indicar ancho: ");
            double ancho = Double.parseDouble(teclado.nextLine());
            System.out.println("Indicar nombre: ");
            String nombre = teclado.nextLine();
            figura = new Rectangulo_V8(ancho, alto, nombre);
        }

        if (figura instanceof Triangulo_V8) {
            ((Triangulo_V8) figura).area();
            if (figura instanceof TrianColor_V8) {
                System.out.println("Color: " + ((TrianColor_V8) figura).getColor());
            } else {
                System.out.println("Es cuadrado: " + ((Rectangulo_V8) figura).esCuadrado());
            }
        }
    }
}
