package VLGt09;

import java.time.LocalDate;
import java.util.Objects;

public class Bicicleta {
    private String marca;
    private String modelo;
    private double precio;
    private double descuento;
    private LocalDate fecha;

    public Bicicleta(String marca, String modelo, double precio, double descuento){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularPrecio () {
        if(LocalDate.now().isAfter(fecha)){
            return this.precio;
        }
        else return this.precio - (this.precio * this.descuento / 100);
    }

    public void fijarDescuento () {
        this.descuento = 10;
        this.fecha = LocalDate.now().plusMonths(1);
    }

    public void fijarDescuento (double descuento) {
        this.descuento = descuento;
        this.fecha = LocalDate.now().plusMonths(1);
    }

    public void fijarDescuento (double descuento, int meses) {
        this.descuento = descuento;
        this.fecha = LocalDate.now().plusMonths(meses);
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", mnodelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", descuento=" + descuento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bicicleta bicicleta = (Bicicleta) o;
        return Objects.equals(marca, bicicleta.marca) && Objects.equals(modelo, bicicleta.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo);
    }
}
