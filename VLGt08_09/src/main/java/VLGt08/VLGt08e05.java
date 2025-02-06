package VLGt08;

public class VLGt08e05 {
    public static void main(String[] args) {
        Triangulo_V5 t1 = new Triangulo_V5(8.0, 12.0, "rectangulo");
        Triangulo_V5 t2 = new Triangulo_V5(4.0);
        Triangulo_V5 t3 = new Triangulo_V5();
        t1.verDim();
        System.out.println("Estilo: " + t1.estilo);
        System.out.println();
        t2.verDim();
        System.out.println("Estilo: " + t2.estilo);
        System.out.println();
        t3.verDim();
        System.out.println("Estilo: " + t3.estilo);
    }
}
