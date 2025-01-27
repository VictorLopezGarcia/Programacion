package VLGt09;

import java.util.ArrayList;
import java.util.Date;

public class Recetas extends Paciente{

    private ArrayList<String> medicamentos = new ArrayList<String>();

    public Recetas(String nombre, Date fechaNacimiento, ArrayList<String> medicamentos) {
        super(nombre, fechaNacimiento);
        this.medicamentos = medicamentos;
    }

    public ArrayList<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public float facturar() {
        return medicamentos.size()*5;
    }
}
