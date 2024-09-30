package VLGt06;

public class VLGt06e07 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5);
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Superficie: " + c1.calcularSuperficie());
        System.out.println("Circunferencia: " + c1.calcularCircunferencia());
        System.out.println("Diametro: " + c1.calcularDiametro());
    }
}
