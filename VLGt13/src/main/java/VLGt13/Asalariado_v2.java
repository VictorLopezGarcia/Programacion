package VLGt13;

import java.io.Serializable;
import java.util.Date;

public class Asalariado_v2 extends Trabajador_v2 {

    private float salarioFinal;
    private int horasExtras;

    public Asalariado_v2(String id, String nombre, Date fechaNacimiento, float salarioBase) {
        super(id, nombre, fechaNacimiento, salarioBase);
        this.salarioFinal = salarioBase;
        this.horasExtras = 0;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void calcularSalarioFinal(float precioHoraExtra) {
        salarioFinal += horasExtras * precioHoraExtra;
    }

    public float getSalarioFinal() {
        return salarioFinal;
    }
}
