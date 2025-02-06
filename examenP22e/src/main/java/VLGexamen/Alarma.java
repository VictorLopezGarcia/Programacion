package VLGexamen;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Alarma {
    private Timbre timbre;
    private Sensor sensor;
    private ArrayList<LocalDateTime> registro;
    private double umbral;

    public Alarma(double umbral){
        this.umbral = umbral;
        this.timbre = new Timbre();
        this.sensor = new Sensor();
        this.registro = new ArrayList<>();
    }


    public boolean activarTimbre(){
        return sensor.getValorActual() > umbral;
    }

    public void ultimaActivacion(){
        if(registro.isEmpty()){
            System.out.println("No hay ningun registro de activación de la alarma");
        }else{
            System.out.println("Ultima activación de la alarma: ");
            System.out.println(registro.getLast());
        }
    }

    public void reiniciarEstado(){
        registro.clear();
        System.out.println("\nReseteando la alarma...");
        timbre.setActivo(false);
        System.out.println("Timbre desactivado!");
    }

    public void medir(int mediciones, long tiempo){
        System.out.println("Estado inicial de la alarma:");
        sensor.medir();
        System.out.printf("Valor medido: %.2f\n", sensor.getValorActual());

        System.out.println("\nSimulacion de mediciones automaticas: ");

        for (int i = 0; i < mediciones; i++) {
            System.out.println("--> Simulación #"+ (1+i));
            sensor.medir();
            System.out.printf("Valor medido: %.2f\n", sensor.getValorActual());
            if (activarTimbre() && !timbre.isActivo()){
                registro.add(LocalDateTime.now());
                activarAlarma();
                System.out.println("Tímbre activado!");
            }else if (!activarTimbre() && timbre.isActivo()){
                desactivarAlarma();
                System.out.println("Tímbre desactivado!");
            }
            System.out.println("\n");

            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void activarAlarma(){
        timbre.setActivo(true);
    }

    public void desactivarAlarma(){
        timbre.setActivo(false);
    }
    @Override
    public String toString() {
        return "Alarma{" +
                "registro=" + registro +
                '}';
    }
}
