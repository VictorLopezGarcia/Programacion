package VLGt14;

public class Jugador {
    private String nombre;
    private double salario;

    public Jugador(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", salario=" + salario + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Jugador jugador = (Jugador) obj;
        return Double.compare(jugador.salario, salario) == 0 && nombre.equals(jugador.nombre);
    }

}
