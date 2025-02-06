package VLGt09;

import VLGt08.Figura2D_V8;
import VLGt08.Rectangulo_V8;
import VLGt08.TrianColor_V8;
import VLGt08.Triangulo_V8;

import java.util.ArrayList;

public class VLGt09e04 {
    public static void main(String[] args) {
        ArrayList<Figura2D_V8> figuras = new ArrayList<>();
        figuras.add(new Triangulo_V8(10, 5, "Estilo 1", "Triangulo 1"));
        figuras.add(new Triangulo_V8(10, 5, "Estilo 2", "Triangulo 2"));
        figuras.add(new Rectangulo_V8(2, 3, "Rectangulo 1"));
        figuras.add(new Rectangulo_V8(2, 3, "Rectangulo 2"));
        figuras.add(new TrianColor_V8(19, 3, "Estilo 3", "Rojo", "Triangulo 3"));
        figuras.add(new TrianColor_V8(10, 5, "Estilo 4", "Azul", "Triangulo 4"));

        double  areaTotal = 0;
        int triangulos = 0;

        for (Figura2D_V8 figura : figuras) {
            if (figura instanceof Triangulo_V8) {
                triangulos++;
                areaTotal += ((Triangulo_V8) figura).getArea();
            }
        }

        System.out.println("Area total de los triangulos: " + areaTotal);
        System.out.println("Cantidad de triangulos: " + triangulos);
    }
}
