package VLGexamen;

import java.util.ArrayList;

public class VLGe01 {
    public static void main(String[] args) {
        Juguete coche1 = new Coche("coche de carreras", 10, true);
        Juguete coche2 = new Coche("coche de tierra", 9, false);
        Juguete munheca1 = new Munheca("muñeca Barbie", 25.99);
        Juguete munheca2 = new Munheca("muñeca Cindy", 19.99);

        ArrayList<Juguete> juguetes = new ArrayList<>();

        juguetes.add(coche1);
        juguetes.add(coche2);
        juguetes.add(munheca1);
        juguetes.add(munheca2);

        for (Juguete juguete : juguetes) {
            juguete.mostrar();
            if (juguete instanceof Munheca) ((Munheca) juguete).peinar();
            else if (juguete instanceof  Coche) ((Coche) juguete).acelerar();
        }

        System.out.println("\n\nAplicando 15% de descuento a todos los juguetes...\n\n");

        for (Juguete juguete : juguetes) {
            juguete.aplicarDescuento(15);
            juguete.mostrar();
        }

    }
}
