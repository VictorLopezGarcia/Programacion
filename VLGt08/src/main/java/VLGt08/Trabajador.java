package VLGt08;

import java.util.Date;
import java.util.Objects;

public class Trabajador {
    private String id;
    private String nombre;
    private Date fechaNacimiento;
    private float salarioBase;

    public Trabajador(String id, String nombre, Date fechaNacimiento, float salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.salarioBase = salarioBase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

class Asalariado extends Trabajador {

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

}

class ConsultorExterno extends Trabajador {
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


}