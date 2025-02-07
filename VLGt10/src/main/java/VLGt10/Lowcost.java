package VLGt10;

import java.time.LocalDate;

public class Lowcost extends Habitacion{

    public Lowcost(int numero) {
        super(numero);
    }

    @Override
    public void checkOut() {
        int pvp = LocalDate.now().getDayOfYear() - this.getFechaIngreso().getDayOfYear();
        System.out.println("El precio total es de: " + pvp*50);
        this.setOcupada(false);
    }
}
