package VLGt10;


public class Triangulo_V9 extends Figura2D_V9 {
    public String estilo;

    public Triangulo_V9(double ancho, double alto, String estilo, String nombre){
        super(ancho, alto, nombre);
        this.estilo = estilo;
    }

    public Triangulo_V9(double x, String nombre){
        super(x, nombre);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_V9(){
        super();
        this.estilo = "null";
    }

    public Triangulo_V9(Triangulo_V9 triangulo){
        super(triangulo);
        this.estilo = triangulo.estilo;
    }

    public void verEstilo(){
        System.out.println(" Estilo: "+estilo);
    }

    @Override
    public double area(){
        return (getAncho()*getAlto())/2;
    }

    public double getArea(){
        return (getAncho()*getAlto())/2;
    }
}
