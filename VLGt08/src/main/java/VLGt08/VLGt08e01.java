package VLGt08;

public class VLGt08e01 {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.ancho = 10;
        t.alto = 20;
        t.estilo = "isósceles";

        t.verDim();
        t.verEstilo();
        t.area();
    }
}
