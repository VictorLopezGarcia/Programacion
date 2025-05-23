package VLGt09;

import VLGt08.*;


public class VLGt09e01 {
    public static void main(String[] args) {
        Figura2D_V8 f1 = new Triangulo_V8(10, "triangulo");

        f1.verDim();
        System.out.println();
        ((Triangulo_V8) f1).area();
    }
}
