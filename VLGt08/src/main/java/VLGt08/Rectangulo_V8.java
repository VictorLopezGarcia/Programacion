package VLGt08;

public class Rectangulo_V8 extends Figura2D_V8 {
    public Rectangulo_V8(double ancho, double alto, String nombre){
        super(ancho, alto, nombre);
    }

    public Rectangulo_V8(double x, String nombre){
        super(x, nombre);
    }

    public boolean esCuadrado(){
        return getAncho() == getAlto();
    }
}
