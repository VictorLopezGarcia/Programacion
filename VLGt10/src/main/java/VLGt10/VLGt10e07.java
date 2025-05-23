package VLGt10;

public class VLGt10e07 {
    public static void main(String[] args) {
        Figura2D_v10 f1 = new Rectangulo_v10(10, 20, "rectangulo");
        Figura2D_v10 f2 = new TrianColor_v10(10, 20, "equilatero", "rojo", "triangulo");
        Figura2D_v10 f3 = new Triangulo_v10(10, 20, "escaleno", "triangulo");

        System.out.println("Superficie del rectangulo: "+f1.calcularPerimetro());
        System.out.println("Superficie del triangulo: "+f2.calcularPerimetro());
        System.out.println("Superficie del triangulo: "+f3.calcularPerimetro());


    }
}
