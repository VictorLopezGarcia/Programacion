package VLGt06;

public class VLGt06e08 {
    public static void main(String[] args) {
        EjemplarLibro ejemplar1 = new EjemplarLibro("El Quijote");
        EjemplarLibro ejemplar2 = new EjemplarLibro(ejemplar1);
        EjemplarLibro ejemplar3 = new EjemplarLibro("Mortadelo y Filemón");
        EjemplarLibro ejemplar4 = new EjemplarLibro(ejemplar1);

        ejemplar1.prestar();
        ejemplar1.devolver();
        ejemplar4.prestar();

        System.out.println(ejemplar1);
        System.out.println(ejemplar2);
        System.out.println(ejemplar3);
        System.out.println(ejemplar4);
    }
}
