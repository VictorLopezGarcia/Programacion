package VLGt06;

public class VLGt06e14 {
    public static void main(String[] args) {
        int saldo = 10000;
        System.out.println("Bienvenido a la ruleta");
        Ruleta ruleta = new Ruleta();
        System.out.println("juego de 1 euro 10000 veces:");
        for (int i = 0; i < 10000; i++) {
            saldo += ruleta.jugar(1, true);
            System.out.println(saldo);
        }
    }
}
