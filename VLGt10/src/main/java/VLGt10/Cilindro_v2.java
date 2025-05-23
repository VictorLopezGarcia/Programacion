package VLGt10;

public class Cilindro_v2 extends Figura3D_v2 {
    private double radio;
    private double altura;

    public Cilindro_v2(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio(){
        return radio;
    }

    public double getAltura(){
        return altura;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double volumen(){
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public double superficie(){
        return 2 * Math.PI * radio * (radio + altura);
    }

}
