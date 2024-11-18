package VLGt08;

import java.util.ArrayList;

public class VLGt08e08 {
    public static void main(String[] args) {
        ArrayList<Rectangulo_V8> rectangulos = new ArrayList<Rectangulo_V8>();
        rectangulos.add(new Rectangulo_V8(8.0, 12.0, "rectangulo"));
        rectangulos.add(new Rectangulo_V8(10.0, 15.0, "rectangulo"));
        rectangulos.add(new Rectangulo_V8(12.0, "rectangulo"));
        rectangulos.add(new Rectangulo_V8(10.0, "rectangulo"));
        int cont=0;
        for(Rectangulo_V8 rectangulo : rectangulos){
            cont++;
        }
    }
}
