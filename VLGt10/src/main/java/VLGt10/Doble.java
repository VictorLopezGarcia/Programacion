package VLGt10;

import java.time.LocalDate;
import java.time.Month;

public class Doble extends Habitacion{

    public Doble(int numero) {
        super(numero);
    }

    @Override
    public void checkOut() {
        double pvp = LocalDate.now().getDayOfYear() - this.getFechaIngreso().getDayOfYear()*100;
        if (LocalDate.now().getMonth().equals(Month.APRIL)&&
                LocalDate.now().getMonth().equals(Month.AUGUST)&&
                LocalDate.now().getMonth().equals(Month.JULY)){
            pvp *= 1.2;
        }
        System.out.println("El precio total es de: " + pvp);
        this.setOcupada(false);
    }
}
