package VLGt10;

public class Rectangulo_v10 extends Figura2D_v10 {
    public Rectangulo_v10(double ancho, double alto, String nombre){
        super(ancho, alto, nombre);
    }

    public Rectangulo_v10(double x, String nombre){
        super(x, nombre);
    }

    @Override
    public double area() {
        return getAncho() * getAlto();
    }

    public boolean esCuadrado(){
        return getAncho() == getAlto();
    }


    @Override
    public double calcularPerimetro() {
        return 2*getAncho() + 2*getAlto();
    }
}
