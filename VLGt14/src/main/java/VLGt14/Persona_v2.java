package VLGt14;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class Persona_v2 {
    private String nombre;
    private int telefono;
    private String correo;
    private LocalDate fechaNacimiento;

    public Persona_v2(String nombre, int telefono, String correo, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        return  (hoy.getYear() - fechaNacimiento.getYear());
    }

    @Override
    public String toString() {
        return String.format(Locale.ROOT, "Nombre: %s, Teléfono: %d, Correo: %s, Fecha de Nacimiento: %s",
                nombre, telefono, correo, fechaNacimiento);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona_v2 that = (Persona_v2) obj;
        return this.nombre.equalsIgnoreCase(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase() ); // Convertir a minúsculas para evitar duplicados
    }



}
