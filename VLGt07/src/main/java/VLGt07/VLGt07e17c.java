package VLGt07;

import java.util.ArrayList;

public class VLGt07e17c {
    public static void main(String[] args) {
        Primitiva2 primitiva = new Primitiva2();
        boolean acertado = false;
        int intentos = 0;
        do {
            ArrayList<Integer> apuesta = primitiva.crearBoleto();
            if(primitiva.aciertos(apuesta)==6){
                acertado = true;
            }
            System.out.println("Intento " + ++intentos);
        }while (!acertado);
        System.out.println("Has necesitado " + intentos + " intentos para acertar los 6 números");
    }
}
