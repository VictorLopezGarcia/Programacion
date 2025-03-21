package VLGexamen;

public class AlarmaLuminosa extends Alarma{

    Luz luz;

    public AlarmaLuminosa(double umbral) {
        super(umbral);
        this.luz = new Luz();
    }

    @Override
    public void reiniciarEstado() {
        super.reiniciarEstado();
        luz.setActivo(false);
        System.out.println("Luz apagada.");
    }

    @Override
    public void desactivarAlarma() {
        super.desactivarAlarma();
        luz.setActivo(false);
        System.out.println("Luz apagada.");
    }

    @Override
    public void activarAlarma() {
        super.activarAlarma();
        luz.setActivo(true);
        System.out.println("Luz encendida.");
    }
}
