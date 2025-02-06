package VLGt10;

import java.util.ArrayList;

public class Clinica {

    private ArrayList<Paciente> pacientes;
    private float totalFacturado;

    public Clinica() {
        pacientes = new ArrayList<Paciente>();
        totalFacturado = 0;
    }

    public Clinica(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
        totalFacturado = 0;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public float getTotalFacturado() {
        return totalFacturado;
    }

    public void addPaciente(Paciente paciente){
        pacientes.add(paciente);
    }

    public void llamarConsulta(){
        if (!pacientes.isEmpty()){
            totalFacturado += pacientes.getFirst().facturar();
        }
    }



}
