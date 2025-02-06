package VLGt09;

import VLGt08.Asalariado;
import VLGt08.ConsultorExterno;
import VLGt08.Trabajador;

import java.util.ArrayList;
import java.util.Calendar;

public class VLGt09e07 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(1990, Calendar.JUNE, 3);
        Trabajador t1 = new Asalariado("Juan", "García", calendar.getTime(), 1000.0f);
        calendar.set(1981, Calendar.MAY, 23);
        Trabajador t2 = new Asalariado("Pedro", "Gómez", calendar.getTime(), 1200.0f);
        calendar.set(1982, Calendar.JUNE, 23);
        Trabajador t3 = new Asalariado("Ana", "Pérez", calendar.getTime(), 1100.0f);

        calendar.set(1983, Calendar.JUNE, 23);
        Trabajador t4 = new ConsultorExterno("Luis", "González", calendar.getTime());
        calendar.set(1984, Calendar.JUNE, 23);
        Trabajador t5 = new ConsultorExterno("María", "López", calendar.getTime());
        calendar.set(1985, Calendar.JUNE, 23);
        Trabajador t6 = new ConsultorExterno("Elena", "Martínez", calendar.getTime());

        ArrayList<Trabajador> trabajadores = new ArrayList<>();

        trabajadores.add(t1);
        trabajadores.add(t2);
        trabajadores.add(t3);
        trabajadores.add(t4);
        trabajadores.add(t5);
        trabajadores.add(t6);

        for (Trabajador trabajador : trabajadores) {
            if(trabajador instanceof Asalariado){
                 ((Asalariado) trabajador).setHorasExtras(1);
                ((Asalariado) trabajador).setHorasExtras(20);
            }else{
                ((ConsultorExterno) trabajador).setHorasTrabajadas(1);
                ((ConsultorExterno) trabajador).calcularSalarioFinal(100);
            }
        }

        float total = 0;

        for (Trabajador trabajador : trabajadores) {
            if(trabajador instanceof Asalariado){
                total+=((Asalariado) trabajador).getSalarioFinal();
            }else{
                total+=((ConsultorExterno) trabajador).getSalarioFinal();
            }
        }

        System.out.println("Total: " + total);


    }
}
