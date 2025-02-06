package VLGt08;

public class Triangulo_V8 extends Figura2D_V8 {
    public String estilo;

    public Triangulo_V8(double ancho, double alto, String estilo, String nombre){
        super(ancho, alto, nombre);
        this.estilo = estilo;
    }

    public Triangulo_V8(double x, String nombre){
        super(x, nombre);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_V8(){
        super();
        this.estilo = "null";
    }

    public Triangulo_V8(Triangulo_V8 triangulo){
        super(triangulo);
        this.estilo = triangulo.estilo;
    }

    public void verEstilo(){
        System.out.println(" Estilo: "+estilo);
    }

    public void area(){
        System.out.println("Area: "+(getAncho()*getAlto())/2);
    }

    public double getArea(){
        return (getAncho()*getAlto())/2;
    }
}
