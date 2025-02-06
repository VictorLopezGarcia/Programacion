package VLGt10;

public class Triangulo_v10 extends Figura2D_v10 {
    public String estilo;

    public Triangulo_v10(double ancho, double alto, String estilo, String nombre){
        super(ancho, alto, nombre);
        this.estilo = estilo;
    }

    public Triangulo_v10(double x, String nombre){
        super(x, nombre);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v10(){
        super();
        this.estilo = "null";
    }

    public Triangulo_v10(Triangulo_v10 triangulo){
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

    @Override
    public double calcularPerimetro() {
        return getAncho() + getAlto() + Math.sqrt(Math.pow(getAncho(), 2) + Math.pow(getAlto(), 2));
    }
}
