package VLGt08;

public class VLGt08e07 {
    public static void main(String[] args) {
        Triangulo_V7 t1 = new Triangulo_V7(8.0, 12.0, "rectangulo");
        Triangulo_V7 t2 = new Triangulo_V7(t1);
        t1.area();
        t2.area();
    }
}
