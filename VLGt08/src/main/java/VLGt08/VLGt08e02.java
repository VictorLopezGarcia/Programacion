package VLGt08;

public class VLGt08e02 {
    public static void main(String[] args) {
        Triangulo_V2 t2 = new Triangulo_V2();

        t2.setAncho(10);
        t2.setAlto(20);
        t2.estilo = "isósceles";

        t2.verDim();
        t2.verEstilo();
        t2.area();
    }
}
