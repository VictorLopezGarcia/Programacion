package VLGt07;

import java.util.ArrayList;

public class VLGt07e17b {
    public static void main(String[] args) {
        int tres=0, cuatro=0, cinco=0, seis=0;
        Primitiva2 primitiva = new Primitiva2();
        for (int i = 0; i < 1000; i++) {
            ArrayList<Integer> apuesta = primitiva.crearBoleto();
            int aciertos = primitiva.aciertos(apuesta);
            switch (aciertos){
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                case 6:
                    seis++;
                    break;
            }
        }
        System.out.println("3 aciertos: " + tres);
        System.out.println("4 aciertos: " + cuatro);
        System.out.println("5 aciertos: " + cinco);
        System.out.println("6 aciertos: " + seis);

    }
}
