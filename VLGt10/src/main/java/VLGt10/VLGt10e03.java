package VLGt10;

public class VLGt10e03 {
    public static void main(String[] args) {
        Figura3D_v2 f1 = new PrismaRectangular_v2(2, 3, 4);
        Figura3D_v2 f2 = new Esfera_v2(5);
        Figura3D_v2 f3 = new Cilindro_v2(5, 10);

        System.out.println("Superficie de f1: " + f1.superficie());
        System.out.println("Superficie de f2: " + f2.superficie());
        System.out.println("Superficie de f3: " + f3.superficie());

    }
}
