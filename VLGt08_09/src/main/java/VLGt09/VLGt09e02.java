package VLGt09;

import VLGt08.*;

import java.util.Scanner;

public class VLGt09e02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Figura2D_V8 figura;
        System.out.println("Indicar tipo de figura: ");
        System.out.println("1. Triangulo");
        System.out.println("2. Rectangulo");

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
        }
        else {
            System.out.println("Rectangulo");
            System.out.println("Indicar alto: ");
            double alto = Double.parseDouble(teclado.nextLine());
            System.out.println("Indicar ancho: ");
            double ancho = Double.parseDouble(teclado.nextLine());
            System.out.println("Indicar nombre: ");
            String nombre = teclado.nextLine();
            figura = new Rectangulo_V8(ancho, alto, nombre);
        }

        if(figura instanceof Triangulo_V8){
            ((Triangulo_V8) figura).area();
        }
        else {
            System.out.println("Es cuadrado: "+((Rectangulo_V8) figura).esCuadrado());
        }
    }
}
