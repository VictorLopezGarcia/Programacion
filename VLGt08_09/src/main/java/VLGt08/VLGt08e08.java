package VLGt08;

import java.util.ArrayList;

public class VLGt08e08 {
    public static void main(String[] args) {
        ArrayList<Rectangulo_V8> rectangulos = new ArrayList<>();
        rectangulos.add(new Rectangulo_V8(8.0, 12.0, "rectangulo"));
        rectangulos.add(new Rectangulo_V8(10.0, 15.0, "rectangulo"));
        rectangulos.add(new Rectangulo_V8(12.0, "rectangulo"));
        rectangulos.add(new Rectangulo_V8(10.0, "rectangulo"));
        TrianColor_V8 triangulo = new TrianColor_V8(10.0, 15.0, "triangulo", "azul", "triangulo");

        int cont=0;
        for(Rectangulo_V8 rectangulo : rectangulos){
            if (rectangulo.esCuadrado()) cont++;
        }
        System.out.println("Hay "+ cont +" cuadrados.");
        System.out.println("Area del triangulo: "+(triangulo.getAncho()*triangulo.getAlto())/2);
    }
}
