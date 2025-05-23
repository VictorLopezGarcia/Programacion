package VLGt07;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private final int iva = 21;
    private int id;
    private String fecha;
    private int idCliente;
    private double total=0;
    private ArrayList<LineaFactura> lineas = new ArrayList<>();

    public Factura(int id, int idCliente) {
        this.id = id;
        this.fecha = new Date().toInstant().toString();
        this.idCliente = idCliente;
    }

    public void addLinea(String descripcion, double precio, int unidades){
        LineaFactura linea = new LineaFactura(descripcion, precio, unidades);
        lineas.add(linea);
        total+=linea.getTotal();
    }

    public void eliminarLinea(int num){
        lineas.remove(num);
    }

    public String mostrar(){

        String factura = "Factura: "+id+" Fecha: "+fecha+" Cliente: "+idCliente+"\n";
        for (int i = 0; i < lineas.size(); i++) {
            factura += i + " " + lineas.get(i).toString()+"\n";
        }
        factura+="Total: "+total;
        return factura;
    }
}
