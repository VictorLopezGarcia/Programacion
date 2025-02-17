package VLGexamen;

public class Juguete {

    private String nombre;
    private double precio;

    public Juguete(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrar(){
        System.out.println("Nombre: "+ this.nombre + "\nprecio: "+ this.precio);
    }

    public void aplicarDescuento(double descuento){
        this.precio *= ((100-descuento)/100);
    }
}
