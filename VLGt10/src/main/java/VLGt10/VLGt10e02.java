package VLGt10;

public class VLGt10e02 {
    public static void main(String[] args) {
        Figura3D_v1 f1 = new PrismaRectangular_v1(2, 3, 4);
        Figura3D_v1 f2 = new Esfera_v1(5);

        System.out.println("Volumen de f1: " + f1.volumen());
        System.out.printf("Volumen de f2: %.2f\n", f2.volumen());

        if (f1.volumen() > f2.volumen()) System.out.println("El volumen de f1 es mayor que el de f2");
        else if (f1.volumen() < f2.volumen()) System.out.println("El volumen de f2 es mayor que el de f1");
        else System.out.println("El volumen de f1 es igual al de f2");
    }
}
