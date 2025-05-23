package VLGt08;

public class Figura2D_V5 {
    private double ancho;
    private double alto;

    public Figura2D_V5(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    public Figura2D_V5(double alto){
        this.alto = alto;
        this.ancho = alto;
    }

    public Figura2D_V5(){
        this.ancho = 0;
        this.alto = 0;
    }

    public double getAncho(){
        return ancho;
    }

    public double getAlto(){
        return alto;
    }

    public void setAncho(double ancho){
        this.ancho = ancho;
    }

    public void setAlto(double alto){
        this.alto = alto;
    }

    public void verDim(){
        System.out.printf("ancho: %.2f, alto: %.2f",ancho, alto);
    }
}

class Triangulo_V5 extends Figura2D_V5 {
    public String estilo;

    public Triangulo_V5(double ancho, double alto, String estilo){
        super(ancho, alto);
        this.estilo = estilo;
    }

    public Triangulo_V5(double x){
        super(x);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_V5(){
        super();
        this.estilo = "null";
    }
    public void verEstilo(){
        System.out.println(" Estilo: "+estilo);
    }

    public void area(){
        System.out.println("Area: "+(getAncho()*getAlto())/2);
    }
}



