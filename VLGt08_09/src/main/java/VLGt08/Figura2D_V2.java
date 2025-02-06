package VLGt08;

public class Figura2D_V2 {
    private double ancho;
    private double alto;

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

class Triangulo_V2 extends Figura2D_V2{
    public String estilo;

    public void verEstilo(){
        System.out.println(" Estilo: "+estilo);
    }

    public void area(){
        System.out.println("Area: "+(getAncho()*getAlto())/2);
    }
}



