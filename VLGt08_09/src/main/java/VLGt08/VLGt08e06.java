package VLGt08;

public class VLGt08e06 {
    public static void main(String[] args) {
        TrianColor_V6 t1 = new TrianColor_V6(8.0, 12.0, "rectangulo", "azul");

        System.out.println(t1.getColor());
        t1.setColor("rojo");
        System.out.println(t1.getColor());
    }
}
