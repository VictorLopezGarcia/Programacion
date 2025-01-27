package VLGt08;

public class TrianColor_V8 extends Triangulo_V8 {
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
