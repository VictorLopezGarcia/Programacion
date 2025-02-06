package VLGt10;


public class TrianColor_V9 extends Triangulo_V9 {
    private String color;

    public TrianColor_V9(double ancho, double alto, String estilo, String color, String nombre){
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
