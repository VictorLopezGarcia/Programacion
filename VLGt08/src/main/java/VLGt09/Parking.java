package VLGt09;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.MINUTES;

public class Parking {
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<LocalDateTime> fechas;
    private double precio;

    public Parking(){
        vehiculos = new ArrayList<>();
        fechas = new ArrayList<>();
        precio = 0.04;
    }

    public void addVehiculo(Vehiculo vehiculo){
        fechas.add(LocalDateTime.now());
        vehiculos.add(vehiculo);
    }

    public void sacarVehiculo(String matricula){
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getMatricula().equals(matricula)){
                int minutos = (int) fechas.get(i).until(LocalDateTime.now(), MINUTES);
                double importe = calcularImporte(vehiculos.get(i), minutos);
                System.out.println("Vehiculo con matricula " + matricula + " ha estado " + fechas.get(i).until(LocalDateTime.now(), MINUTES) + " minutos y el importe a pagar es " + importe);
                vehiculos.remove(i);
                break;
            }
        }
    }

    public void mostrarVehiculos(){
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i).toString() + " " + fechas.get(i));
        }
        System.out.println("Total vehiculos: " + vehiculos.size());
    }

    public double calcularImporte(Vehiculo vehiculo, int minutos){
        if (vehiculo instanceof Autobus) {
            return precio * minutos + 0.25 * ((Autobus) vehiculo).getPlazas();
        }else if (vehiculo instanceof Furgoneta) {
            return precio * minutos + 0.20 * ((Furgoneta) vehiculo).getMetros();
        }
        else return precio * minutos;
    }



}
