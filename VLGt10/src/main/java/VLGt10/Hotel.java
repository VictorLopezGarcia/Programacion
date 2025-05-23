package VLGt10;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Habitacion> habitaciones;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
    }

    public void addHabitacion(Habitacion h) {
        this.habitaciones.add(h);
    }

    public void checkIn(int numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero) {
                h.checkIn();
                break;
            }
        }
    }

    public void checkOut(int numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero) {
                h.checkOut();
                break;
            }
        }
    }

    public void habitacionesOcupadas() {
        for (Habitacion h : habitaciones) {
            if (h.isOcupada()) {
                System.out.println(h);
            }
        }
    }

    public void habitacionesLibres() {
        for (Habitacion h : habitaciones) {
            if (!h.isOcupada()) {
                System.out.println(h);
            }
        }
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
