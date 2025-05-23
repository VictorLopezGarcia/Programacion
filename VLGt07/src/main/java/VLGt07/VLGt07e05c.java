package VLGt07;

public class VLGt07e05c {
    public static void main(String[] args) {
        Primitiva primitiva = new Primitiva();
        boolean acertado = false;
        int intentos = 0;
        do {
            int[] apuesta = primitiva.crearBoleto();
            if(primitiva.aciertos(apuesta)==6){
                acertado = true;
            }
            System.out.println("Intento " + ++intentos);
        }while (!acertado);
        System.out.println("Has necesitado " + intentos + " intentos para acertar los 6 números");
    }
}
