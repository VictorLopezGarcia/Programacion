package VLGexamen;

public class Main {
    public static void main(String[] args) {
        Alarma alarma = new Alarma(50.0);

        System.out.println("=========== PRUEBA DE ALARMA ===========");

        alarma.medir(1,0);

        System.out.println("Medicion independiente: "+ alarma.activarTimbre());

        alarma.medir(5,1000);

        alarma.ultimaActivacion();

        System.out.println(alarma);

        alarma.reiniciarEstado();

        System.out.println("Comprobacion despues del reset: ");
        alarma.ultimaActivacion();

        Alarma alarma2 = new AlarmaLuminosa(50.0);

        System.out.println("=========== PRUEBA DE ALARMA LUMINOSA===========");


        alarma2.medir(1,0);

        System.out.println("Medicion independiente: "+ alarma2.activarTimbre());

        alarma2.medir(5,1000);

        alarma2.ultimaActivacion();

        System.out.println(alarma2);

        alarma2.reiniciarEstado();

        System.out.println("Comprobacion despues del reset: ");
        alarma2.ultimaActivacion();
    }
}
