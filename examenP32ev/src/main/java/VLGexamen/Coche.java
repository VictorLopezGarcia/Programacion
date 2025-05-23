package VLGexamen;

public class Coche extends Juguete{

    private boolean bateria;

    public Coche(String nombre, double precio, boolean bateria) {
        super(nombre, precio);
        this.bateria = bateria;
    }

    public boolean tieneBateria() {
        return bateria;
    }

    public void setBateria(boolean bateria) {
        this.bateria = bateria;
    }

    public void acelerar(){
        System.out.println("Se está acelerando el coche");
    }

    @Override
    public void mostrar() {
        super.mostrar();
        String bateriaPrint;
        if (this.bateria) bateriaPrint = "si";
        else bateriaPrint = "no";
        System.out.println("¿Tiene batería? " + bateriaPrint );
    }
}
