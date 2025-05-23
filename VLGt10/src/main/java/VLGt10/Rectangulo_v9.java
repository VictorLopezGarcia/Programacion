package VLGt10;



public class Rectangulo_v9 extends Figura2D_v9 {
    public Rectangulo_v9(double ancho, double alto, String nombre){
        super(ancho, alto, nombre);
    }

    public Rectangulo_v9(double x, String nombre){
        super(x, nombre);
    }

    @Override
    public double area() {
        return getAncho() * getAlto();
    }

    public boolean esCuadrado(){
        return getAncho() == getAlto();
    }
}
