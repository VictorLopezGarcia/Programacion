package VLGt10;

public class Esfera_v2 extends Figura3D_v2 {
    private double radio;

    public Esfera_v2(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    @Override
    public double volumen(){
        return ((double) 4 /3) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public double superficie(){
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}
