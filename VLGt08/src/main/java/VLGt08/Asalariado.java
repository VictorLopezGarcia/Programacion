package VLGt08;

import java.util.Date;

public class Asalariado extends Trabajador {

    private float salarioFinal;
    private int horasExtras;

    public Asalariado(String id, String nombre, Date fechaNacimiento, float salarioBase) {
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
