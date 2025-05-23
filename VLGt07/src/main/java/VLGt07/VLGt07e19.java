package VLGt07;


import java.util.Scanner;

public class  VLGt07e19 {

    public static CarritoCompra2 carrito = new CarritoCompra2();
    public static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        char entrada;

        do{
            System.out.println("--------------------");
            System.out.println("Selecciona una opción: ");
            System.out.println("a) Mostrar por consola el estado actual del carrito. ");
            System.out.println("b) Vaciar carrito. ");
            System.out.println("c) Añadir producto. ");
            System.out.println("d) Eliminar producto ");
            System.out.println("e) salir.");
            entrada = teclado.nextLine().charAt(0);

            switch (entrada){
                case 'a' -> carrito.imprimir();
                case 'b' -> carrito.vaciar();
                case 'c' -> anadir();
                case 'd' -> eliminar();
                case 'e' -> System.out.println("Adios");
            }
            System.out.println();
        }while (entrada != 'e');
    }

    public static void anadir(){
        System.out.println("Ingrese el codigo: ");
        String codigo = teclado.nextLine();
        System.out.println("Ingrese la  descripcion: ");
        String descripcion = teclado.nextLine();
        System.out.println("Ingrese el precio: ");
        String precio = teclado.nextLine();
        System.out.println("Ingrese las unidades: ");
        String unidades = teclado.nextLine();
        carrito.anadir(codigo, descripcion, precio, unidades);
    }

    public static void eliminar(){
        System.out.println("Ingrese el codigo: ");
        String codigo = teclado.nextLine();
        carrito.eliminar(codigo);
    }
}
