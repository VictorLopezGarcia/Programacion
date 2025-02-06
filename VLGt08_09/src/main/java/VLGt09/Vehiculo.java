package VLGt09;

public class Vehiculo {
    private String matricula;

    public Vehiculo(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                '}';
    }
}
