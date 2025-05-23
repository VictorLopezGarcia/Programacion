package VLGt10;

import java.util.ArrayList;

public class VLGt10e01 {
    public static void main(String[] args) {
       Figura2D_v9 t1 = new Triangulo_v9(8, 12, "rectangulo", "t1");
       Figura2D_v9 t2 = new Triangulo_v9(4, "t2");
       Figura2D_v9 t3 = new Triangulo_v9(8, "t3");

       Figura2D_v9 r1 = new Rectangulo_v9(8, 12, "r1");
       Figura2D_v9 r2 = new Rectangulo_v9(4, "r2");
       Figura2D_v9 r3 = new Rectangulo_v9(6, "r3");



        ArrayList<Figura2D_v9> figuras = new ArrayList<>();

        figuras.add(t1);
        figuras.add(t2);
        figuras.add(t3);
        figuras.add(r1);
        figuras.add(r2);
        figuras.add(r3);

        for (Figura2D_v9 figura : figuras) {
            System.out.println("Precio de " + figura.getNombre() + ": " + figura.precio(10));
        }


    }
}
