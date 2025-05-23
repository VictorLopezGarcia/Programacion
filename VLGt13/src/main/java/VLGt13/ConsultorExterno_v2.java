package VLGt13;

import java.io.Serializable;
import java.util.Date;

public class ConsultorExterno_v2 extends Trabajador_v2 {
    private int horasTrabajadas;
    private float salarioFinal;

    public ConsultorExterno_v2(String id, String nombre, Date fechaNacimiento) {
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
