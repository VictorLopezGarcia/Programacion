package VLGt09;

public class VLGt09e09 {
    public static void main(String[] args) {
        System.out.println("Leer entero sin parametros: ");
        System.out.println(Consola.leerEntero());

        System.out.println("Leer entero con mensaje: ");
        System.out.println(Consola.leerEntero("Introduce un entero: "));

        System.out.println("Leer entero con mensaje y rango: ");
        System.out.println(Consola.leerEntero("Introduce un entero entre 1 y 10: ", 1, 10));

        System.out.println("Leer entero con rango: ");
        System.out.println(Consola.leerEntero(1, 10));


    }
}
