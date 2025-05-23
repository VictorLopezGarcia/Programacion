package VLGt13;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;


public class VLGt13e16 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1990, Calendar.JUNE, 3);

        ArrayList<Trabajador_v2> trabajadores = new ArrayList<>();

        trabajadores.add(new Asalariado_v2("1", "Juan", calendar.getTime(), 1000));
        calendar.set(1995, Calendar.JULY, 4);
        trabajadores.add(new ConsultorExterno_v2("2", "Pedro", calendar.getTime()));
        calendar.set(1994, Calendar.AUGUST, 24);
        trabajadores.add(new Asalariado_v2("3", "Ana", calendar.getTime(), 1200));
        calendar.set(1993, Calendar.MAY, 15);
        trabajadores.add(new ConsultorExterno_v2("4", "Pedro", calendar.getTime()));
        calendar.set(1992, Calendar.JULY, 15);
        trabajadores.add(new Asalariado_v2("5", "Luis", calendar.getTime(), 1500));


        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\fich16.dat",false);

            BufferedOutputStream bos = new BufferedOutputStream(fos);

            ObjectOutputStream oos = new ObjectOutputStream(bos) ){
            for (Trabajador_v2 trabajador : trabajadores) oos.writeObject(trabajador);
        }
        catch (IOException ex) {System.err.println("Error:"+ ex.getMessage()); }

    }
}
