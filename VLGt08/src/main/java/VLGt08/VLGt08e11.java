package VLGt08;

import java.util.ArrayList;
import java.util.Calendar;


public class VLGt08e11 {
    public static void main(String[] args) {

        float total=0;

        Calendar calendar = Calendar.getInstance();
        calendar.set(1990, Calendar.JUNE, 3);
        Asalariado t1 = new Asalariado("12345678A", "Juan", calendar.getTime(), 1000);
        calendar.set(1995, Calendar.JULY, 4);
        Asalariado t2 = new Asalariado("87654321B", "Ana", calendar.getTime(), 1200);
        calendar.set(1992, Calendar.AUGUST, 5);
        Asalariado t3 = new Asalariado("12348765C", "Luis", calendar.getTime(), 1100);

        calendar.set(1993, Calendar.OCTOBER, 4);
        ConsultorExterno t4 = new ConsultorExterno("12345678A", "Juan", calendar.getTime());
        calendar.set(1994, Calendar.NOVEMBER, 5);
        ConsultorExterno t5 = new ConsultorExterno("87654321B", "Ana", calendar.getTime());
        calendar.set(1995, Calendar.DECEMBER, 6);
        ConsultorExterno t6 = new ConsultorExterno("12348765C", "Luis", calendar.getTime());

        ArrayList<Asalariado> asalariados = new ArrayList<>();
        asalariados.add(t1);
        asalariados.add(t2);
        asalariados.add(t3);

        ArrayList<ConsultorExterno> consultorExternos = new ArrayList<>();
        consultorExternos.add(t4);
        consultorExternos.add(t5);
        consultorExternos.add(t6);

        asalariados.get(0).setHorasExtras(12);
        asalariados.get(1).setHorasExtras(15);
        asalariados.get(2).setHorasExtras(18);

        consultorExternos.get(0).setHorasTrabajadas(120);
        consultorExternos.get(1).setHorasTrabajadas(150);
        consultorExternos.get(2).setHorasTrabajadas(180);

        for (Asalariado asalariado : asalariados) {
            asalariado.calcularSalarioFinal(20);
        }

        for (ConsultorExterno consultorExterno : consultorExternos) {
            consultorExterno.calcularSalarioFinal(100);
        }

        for (Asalariado asalariado : asalariados) {
            total+=asalariado.getSalarioFinal();
        }

        for (ConsultorExterno consultorExterno : consultorExternos) {
            total+=consultorExterno.getSalarioFinal();
        }

        System.out.println("Total a pagar: " + total);
    }
}
