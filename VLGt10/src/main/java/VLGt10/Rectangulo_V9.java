package VLGt10;



public class Rectangulo_V9 extends Figura2D_V9 {
    public Rectangulo_V9(double ancho, double alto, String nombre){
        super(ancho, alto, nombre);
    }

    public Rectangulo_V9(double x, String nombre){
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
