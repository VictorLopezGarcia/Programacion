package VLGt09;

public class VLGt09e12 {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta("Orbea", "H50", 300, 10);
        System.out.println(bici.calcularPrecio());
        bici.fijarDescuento();
        System.out.println(bici.calcularPrecio());
        bici.fijarDescuento(20);
        System.out.println(bici.calcularPrecio());

    }
}
