package VLGt07;

import java.util.Scanner;

public class VLGt07e20 {

    private static final Scanner teclado = new Scanner(System.in);
    private static Factura factura;

    public static void main(String[] args) {
        char entrada;
        do{
            System.out.println("--------------------");
            System.out.println("Selecciona una opción: ");
            System.out.println("a) Alta de factura ");
            System.out.println("b) Añadir linea. ");
            System.out.println("c) Eliminar linea. ");
            System.out.println("d) Mostrar factura. ");
            System.out.println("e) salir.");
            entrada = teclado.nextLine().charAt(0);

            switch (entrada){
                case 'a' -> alta();
                case 'b' -> anadir();
                case 'c' -> eliminar();
                case 'd' -> System.out.println(factura.mostrar());
                case 'e' -> System.out.println("Adios");
            }
            System.out.println();
        }while (entrada != 'e');
    }

    public static void alta(){
        System.out.println("Ingrese el id de la factura: ");
        int id = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el id del cliente: ");
        int idCliente = Integer.parseInt(teclado.nextLine());
        factura = new Factura(id, idCliente);
    }

    public static void anadir(){
        System.out.println("Ingrese la descripcion: ");
        String descripcion = teclado.nextLine();
        System.out.println("Ingrese el precio: ");
        double precio = Double.parseDouble(teclado.nextLine());
        System.out.println("Ingrese las unidades: ");
        int unidades = Integer.parseInt(teclado.nextLine());
        factura.addLinea(descripcion, precio, unidades);
    }

    public static void eliminar(){
        System.out.println("Ingrese el numero de la linea: ");
        int num = Integer.parseInt(teclado.nextLine());
        factura.eliminarLinea(num);
    }
}
