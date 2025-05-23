package VLGt09;

public class Furgoneta extends Vehiculo{

    private int metros;

    public Furgoneta(String matricula, int metros) {
        super(matricula);
        this.metros = metros;
    }

    public int getMetros() {
        return metros;
    }

    @Override
    public String toString() {
        return "Furgoneta{" +
                "matricula= " + getMatricula() + '\'' +
                "metros=" + metros +
                '}';
    }
}
