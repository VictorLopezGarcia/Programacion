package VLGexamen;

public class Munheca extends Juguete{
    public Munheca(String nombre, double precio) {
        super(nombre, precio);
    }

    public void peinar(){
        System.out.println("Se está peinando a la muñeca");
    }

    @Override
    public void aplicarDescuento(double descuento) {
        super.aplicarDescuento(descuento + 10);
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }
}
