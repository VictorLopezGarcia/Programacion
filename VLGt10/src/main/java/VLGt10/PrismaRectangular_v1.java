package VLGt10;

public class PrismaRectangular_v1 extends Figura3D_v1 {
    private double ancho;
    private double alto;
    private double largo;

    public PrismaRectangular_v1(double ancho, double alto, double largo){
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho(){
        return ancho;
    }

    public double getAlto(){
        return alto;
    }

    public double getLargo(){
        return largo;
    }

    public void setAncho(double ancho){
        this.ancho = ancho;
    }

    public void setAlto(double alto){
        this.alto = alto;
    }

    public void setLargo(double largo){
        this.largo = largo;
    }

    @Override
    public double volumen(){
        return ancho * alto * largo;
    }
}
