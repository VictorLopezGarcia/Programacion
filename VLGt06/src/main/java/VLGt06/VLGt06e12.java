package VLGt06;

import java.util.Calendar;

public class VLGt06e12 {
    public static void main(String[] args) {
        Calendar fecha = Calendar.getInstance();
        Calendar fecha2 = Calendar.getInstance();
        fecha.set(2003, Calendar.JUNE, 2);
        fecha2.set(2009, Calendar.JUNE, 2);

        Alumno a1 = new Alumno("Juan", "12345678A", fecha);
        Alumno a2 = new Alumno("Pedro", "87654321B", fecha2);
        System.out.println("Juan es mayor de edad: " + a1.esMayorDeEdad());
        System.out.println("Pedro es mayor de edad: " + a2.esMayorDeEdad());
        System.out.println("Juan es mayor que Pedro: " + a1.esMayor(a2));
        System.out.println("Pedro es mayor que Juan: " + a2.esMayor(a1));
        System.out.println("Juan es igual a Pedro: " + a1.esIgual(a2));
    }
}
