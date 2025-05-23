package VLGt10;

import java.time.LocalDate;

public class Termostato implements Dispositivo{

    private int temperatura;
    private final int min = 15;
    private final int max = 80;
    private LocalDate fecha;

    public Termostato() {
        this.temperatura = 20;
    }


    @Override
    public boolean subir() {
        if(temperatura < max){
            temperatura++;
            return true;
        }
        return false;
    }

    @Override
    public boolean bajar() {
        if(temperatura > min){
            temperatura--;
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        temperatura = 20;
    }

    @Override
    public String verEstado() {
        return "Termostato:\n" +
                "Temperatura: " + temperatura;
    }

    public void revisar(){
        fecha = LocalDate.now();
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
