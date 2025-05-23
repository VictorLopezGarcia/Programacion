package VLGt06;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class VLGt06e09 {

    static Scanner teclado;

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        teclado = new Scanner(System.in);

        MovilPrepago movil = new MovilPrepago(654845389,0.23f, 0.23f, 0.03f, 10.00f);

        boolean salir = false;
        int opcion;
        do {
            opcion=pintarMenu ();
            switch (opcion) {
                case 1: a(); break;
                case 2: b(); break;
                case 3: c(); break;
                case 4: d(); break;
                case 5: e(); break;
                case 6: f(); break;
                case 7: g(); break;
                case 8: h(); break;
                case 0: salir=true; break;
                default: System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu (){
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1-a)");
        System.out.println("2-b)");
        System.out.println("3-c)");
        System.out.println("4-d)");
        System.out.println("5-e)");
        System.out.println("6-f)");
        System.out.println("7-g)");
        System.out.println("8-h)");
        System.out.println("0 Salir del programa");
        try {
            return Integer.parseInt (teclado.nextLine());
        } catch (Exception e ) {return 999;}
    }


    public static void a() {
        System.out.println("Introduce tu fecha de nacimiento (dd/MM/yyyy): ");
        String fechaStr = teclado.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Calendar fecha = Calendar.getInstance();
            fecha.setTime(sdf.parse(fechaStr));
            Calendar hoy = Calendar.getInstance();
            long milisegundos = hoy.getTimeInMillis() - fecha.getTimeInMillis();
            System.out.println("Han pasado " + milisegundos / (24 * 60 * 60 * 1000) + " dias desde tu nacimiento.");
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto.");
        }
    }

    public static void b(){
        System.out.println("Introduce una fecha (dd/MM/yyyy): ");
        String fechaStr = teclado.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Calendar fecha = Calendar.getInstance();
            fecha.setTime(sdf.parse(fechaStr));
            System.out.println("Introduce un número de días: ");
            int dias = Integer.parseInt(teclado.nextLine());
            fecha.add(Calendar.DAY_OF_YEAR, dias);
            System.out.println("La fecha resultante es: " + sdf.format(fecha));
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto.");
        }
    }

    public static void c(){
        System.out.println("Introduce una hora de reloj (HH:mm): ");
        String horaStr = teclado.nextLine();
        System.out.println("Introduce otra hora de reloj (HH:mm): ");
        String horaStr2 = teclado.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date hora = sdf.parse(horaStr);
            Date hora2 = sdf.parse(horaStr2);
            System.out.println("Han pasado " + ((hora2.getTime() - hora.getTime()) / 1000 ) + " segundos entre las dos horas.");
        } catch (ParseException e) {
            System.out.println("Formato de hora incorrecto.");
        }
    }

    public static void d(){
        int cont = 0;
        for (int i = 1; i < 2024; i++) {
            if (Year.isLeap(i)) {
                cont++;
            }
        }
        System.out.println("Hay "+ cont +" años bisiestos desde el 1 dC");
    }

    public static void e(){
        System.out.println("Introduce una fecha (dd/MM/yyyy): ");
        String fechaStr = teclado.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fecha = sdf.parse(fechaStr);
            SimpleDateFormat sdf2 = new SimpleDateFormat("E");
            System.out.println("Esa fecha corresponde a " + sdf2.format(fecha) );
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto.");
        }
    }

    public static void f(){
        System.out.println("Introducir un tipo de producto (1- perecedero, 2-electrónica, 3-ropa)");
        int tipo = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce la fecha de compra (dd/MM/yyyy): ");
        String fechaStr = teclado.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Calendar fecha = Calendar.getInstance();
            fecha.setTime(sdf.parse(fechaStr));
            switch (tipo){
                case 1: {
                    Calendar fecha2 = Calendar.getInstance();
                    fecha2.setTime(fecha.getTime());
                    fecha2.add(Calendar.HOUR, 5);
                    if(fecha.before(fecha2.getTime())){
                        System.out.println("El producto se puede devolver a día de hoy.");
                    } else {
                        System.out.println("El producto no se puede devolver a día de hoy.");
                    }
                    break;
                }
                case 2: {
                    Calendar fecha2 = Calendar.getInstance();
                    fecha2.setTime(fecha.getTime());
                    fecha2.add(Calendar.MONTH, 6);
                    if(fecha2.before(new Date())){
                        System.out.println("El producto se puede devolver a día de hoy.");
                    } else {
                        System.out.println("El producto no se puede devolver a día de hoy.");
                    }
                    break;
                }
                case 3: {
                    Calendar fecha2 = Calendar.getInstance();
                    fecha2.setTime(fecha.getTime());
                    fecha2.add(Calendar.DAY_OF_YEAR, 15);
                    if(fecha2.before(new Date())){
                        System.out.println("El producto se puede devolver a día de hoy.");
                    } else {
                        System.out.println("El producto no se puede devolver a día de hoy.");
                    }
                    break;
                }
            }
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto.");
        }
    }

    public static void g(){
        System.out.println("Introduce un año: ");
        int ano = Integer.parseInt(teclado.nextLine());
        Calendar fecha = Calendar.getInstance();
        fecha.set(ano, Calendar.JANUARY, 1);
        int cont = 0;
        for (int i = 0; i < 365; i++) {
            if (fecha.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                cont++;
            }
            fecha.add(Calendar.DAY_OF_YEAR, 1);
        }
        System.out.println("El año " + ano + " tiene " + cont + " domingos.");
    }

    public static void h(){
        Calendar fecha = Calendar.getInstance();
        fecha.set(2019, Calendar.DECEMBER, 31);
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE", new Locale("gl", "ES"));
        for (int i = 0; i < 5; i++) {
            System.out.println("O ano "+ fecha.get(Calendar.YEAR) +" o 31 de decembro foi "+sdf2.format(fecha.getTime()));
            fecha.add(Calendar.YEAR, 1);
        }
    }
}
