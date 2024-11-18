package VLGt08;

public class Figura2D_V4 {
    private double ancho;
    private double alto;

    public Figura2D_V4(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
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

class Triangulo_V4 extends Figura2D_V4{
    public String estilo;

    public Triangulo_V4(double ancho, double alto, String estilo){
        super(ancho, alto);
        this.estilo = estilo;
    }
    public void verEstilo(){
        System.out.println(" Estilo: "+estilo);
    }

    public void area(){
        System.out.println("Area: "+(getAncho()*getAlto())/2);
    }
}



