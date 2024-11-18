package VLGt08;

public class Figura2D_V8 {
    private double ancho;
    private double alto;
    private String nombre;

    public Figura2D_V8(double ancho, double alto, String nombre){
        this.ancho = ancho;
        this.alto = alto;
        this.nombre = nombre;
    }

    public Figura2D_V8(double alto, String nombre){
        this.alto = alto;
        this.ancho = alto;
        this.nombre = nombre;
    }

    public Figura2D_V8(){
        this.ancho = 0;
        this.alto = 0;
        this.nombre = "null";
    }

    public Figura2D_V8(Figura2D_V8 figura){
        this.ancho = figura.getAncho();
        this.alto = figura.getAlto();
        this.nombre = figura.getNombre();
    }

    public double getAncho(){
        return ancho;
    }

    public double getAlto(){
        return alto;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
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

class Triangulo_V8 extends Figura2D_V8 {
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
}

class TrianColor_V8 extends Triangulo_V8 {
    private String color;

    public TrianColor_V8(double ancho, double alto, String estilo, String color, String nombre){
        super(ancho, alto, estilo, nombre);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}

class Rectangulo_V8 extends Figura2D_V8 {
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



