package VLGt10;

import java.time.LocalDate;

public class Suite extends Habitacion{


    public Suite(int numero) {
        super(numero);
    }

    @Override
    public void checkOut() {
        double pvp = LocalDate.now().getDayOfYear() - this.getFechaIngreso().getDayOfYear()*200;
        if (pvp >= 10){
            pvp *= 0.8;
        }
        System.out.println("El precio total es de: " + pvp);
        this.setOcupada(false);
    }
}
