package VLGt10;

import java.util.ArrayList;

public class VLGt10e10 {
    public static void main(String[] args) {
        Nadador d = new Delfin("Flipper", 5, "macho");
        Nadador b = new BallenaAzul("Willy", 10, "macho");
        Nadador t = new TriAtleta("Rafa", 30, "macho");

        ArrayList<Nadador> nadadores = new ArrayList<>();
        nadadores.add(d);
        nadadores.add(b);
        nadadores.add(t);

        for (Nadador nadador : nadadores) {
            System.out.println("El nadador nada 1km en: "+nadador.nadar(1000)+" segundos");
        }
    }
}
