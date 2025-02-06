package VLGt10;

import java.util.ArrayList;
import java.util.Arrays;

public class VLGt10e08 {
    public static void main(String[] args) {

        Figura2D_v10 f1 = new Rectangulo_v10(10, 20, "rectangulo");
        Figura2D_v10 f2 = new TrianColor_v10(10, 20, "equilatero", "rojo", "triangulo");
        Figura2D_v10 f3 = new Triangulo_v10(10, 20, "escaleno", "triangulo");
        PoligonoIrregular p1 = new PoligonoIrregular(new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)));

        System.out.println("Superficie del rectangulo: "+f1.calcularPerimetro());
        System.out.println("Superficie del triangulo: "+f2.calcularPerimetro());
        System.out.println("Superficie del triangulo: "+f3.calcularPerimetro());
        System.out.println("Superficie del poligono irregular: "+p1.calcularPerimetro());

    }
}
