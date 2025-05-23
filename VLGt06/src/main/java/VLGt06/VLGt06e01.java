package VLGt06;

public class VLGt06e01 {
    public static void main(String[] args) {
        MovilPrepago movil = new MovilPrepago(654845389,0.23f, 0.23f, 0.03f, 0.00f);
        movil.recargar(10);
        System.out.println("Saldo: " + movil.consultarSaldo());
        movil.efectuarLlamada(120);
        System.out.println("Saldo: " + movil.consultarSaldo());
        movil.navegar(100);
        System.out.println("Saldo: " + movil.consultarSaldo());

    }
}
