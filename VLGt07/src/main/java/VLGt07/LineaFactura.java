package VLGt07;

public class LineaFactura {
    private String descripcion;
    private double precio;
    private int unidades;
    private final double descuento = 5;
    private double total;

    public LineaFactura(String descripcion, double precio, int unidades) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidades = unidades;
        if(unidades<=10) this.total =precio*unidades;
        else this.total = precio*unidades*(1-(descuento/100));
    }

    public double getTotal() {
        return total;
    }

    public String toString(){
        return "Descripcion: "+descripcion+" Precio: "+precio+" Unidades: "+unidades+" Total: "+total;
    }

}
