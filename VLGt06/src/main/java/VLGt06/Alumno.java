package VLGt06;

import java.util.Calendar;

public class Alumno {
    public final String escuela="IES Fernando Wirtz Suárez";

    private String nombre;
    private String dni;
    private Calendar fechaNacimiento;

    public Alumno(String nombre, String dni, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean esMayorDeEdad(){
        return (Calendar.getInstance().get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR)) >= 18;
    }

    public boolean esMayor(Alumno a){
        return (fechaNacimiento.compareTo(a.fechaNacimiento) < 0);
    }

    public boolean esIgual(Alumno a){
        return nombre.equals(a.nombre) && dni.equals(a.dni) && fechaNacimiento.equals(a.fechaNacimiento);
    }
}
