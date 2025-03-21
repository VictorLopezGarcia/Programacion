package VLGexamen;

import java.util.Random;

public class Sensor {
    private double valorActual;

    public Sensor(){
        this.valorActual = 0;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void medir(){
        Random random = new Random();
        this.valorActual = random.nextDouble(0,101);
    }

}
