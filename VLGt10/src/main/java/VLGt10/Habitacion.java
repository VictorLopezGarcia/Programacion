package VLGt10;

import java.time.LocalDate;

public abstract class Habitacion {

    private int numero;
    private boolean ocupada;
    private LocalDate fechaIngreso;

    public Habitacion() {
        this.ocupada = false;
    }

    public Habitacion(int numero) {
        this.numero = numero;
        this.ocupada = false;
    }

    public Habitacion(int numero, boolean ocupada) {
        this.numero = numero;
        this.ocupada = ocupada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void checkIn(){
        this.ocupada = true;
        this.fechaIngreso = LocalDate.now();
    }

    public abstract void checkOut();

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", ocupada=" + ocupada;
    }


}
