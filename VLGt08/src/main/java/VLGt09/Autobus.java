package VLGt09;

public class Autobus extends Vehiculo{

    private int plazas;

    public Autobus( String matricula, int plazas) {
        super(matricula);
        this.plazas = plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "matricula= " + getMatricula() + '\'' +
                "plazas=" + plazas +
                '}';
    }
}
