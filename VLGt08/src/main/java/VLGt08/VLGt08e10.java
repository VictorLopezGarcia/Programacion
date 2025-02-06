package VLGt08;

public class VLGt08e10 {
    public static void main(String[] args) {
        MovilPrepago movil = new MovilPrepago(666111222, 0.15f, 0.05f, 0.01f, 10);
        MovilPlus movilPlus = new MovilPlus(666111222, 0.15f, 0.05f, 0.01f, 10);
        MovilTarifaPlana movilTarifaPlana = new MovilTarifaPlana(666111222, 0.15f, 0.05f, 10);

        movil.efectuarLlamada(60);
        System.out.println(movil);
        movil.navegar(100);
        System.out.println(movil);
        movil.recargar(5);
        System.out.println(movil);

        movilPlus.videollamada(60);
        System.out.println(movilPlus);
        movilPlus.navegar(100);
        System.out.println(movilPlus);
        movilPlus.recargar(5);
        System.out.println(movilPlus);

        movilTarifaPlana.efectuarLlamada(60);
        System.out.println(movilTarifaPlana);
        movilTarifaPlana.navegar(100);
        System.out.println(movilTarifaPlana);
        movilTarifaPlana.recargar(5);
        System.out.println(movilTarifaPlana);
    }
}
