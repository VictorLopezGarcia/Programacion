package VLGt08;

import java.util.Date;

public class ConsultorExterno extends Trabajador {
    private int horasTrabajadas;
    private float salarioFinal;

    public ConsultorExterno(String id, String nombre, Date fechaNacimiento) {
        super(id, nombre, fechaNacimiento, 0);
        this.horasTrabajadas = 0;
        this.salarioFinal = 0;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void calcularSalarioFinal(float precioHora) {
        salarioFinal = horasTrabajadas * precioHora;
    }

    public float getSalarioFinal() {
        return salarioFinal;
    }
}
