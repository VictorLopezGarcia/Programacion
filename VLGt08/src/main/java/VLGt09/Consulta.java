package VLGt09;

import java.util.Date;

public class Consulta extends Paciente{

    private String motivoConsulta;

    public Consulta(String nombre, Date fechaNacimiento, String motivoConsulta) {
        super(nombre, fechaNacimiento);
        this.motivoConsulta = motivoConsulta;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    @Override
    public float facturar(){
        return 100;
    }
}
