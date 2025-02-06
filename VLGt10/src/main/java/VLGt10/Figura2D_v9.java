package VLGt10;

public abstract class Figura2D_v9 {
    private double ancho;
    private double alto;
    private String nombre;

    public Figura2D_v9(double ancho, double alto, String nombre){
        this.ancho = ancho;
        this.alto = alto;
        this.nombre = nombre;
    }

    public Figura2D_v9(double alto, String nombre){
        this.alto = alto;
        this.ancho = alto;
        this.nombre = nombre;
    }

    public Figura2D_v9(){
        this.ancho = 0;
        this.alto = 0;
        this.nombre = "null";
    }

    public Figura2D_v9(Figura2D_v9 figura){
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

    public abstract double area();

    public double precio(float precioMetroCuadrado) {
        return area() * precioMetroCuadrado;
    }
}



