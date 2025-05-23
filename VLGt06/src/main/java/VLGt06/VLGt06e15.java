package VLGt06;

public class VLGt06e15 {
    public static void main(String[] args) {
        Examen examen = new Examen(new char[]{'a', 'b', 'c', 'd', 'e', 'a', 'b', 'c', 'd', 'e', 'a', 'b', 'c', 'd', 'e', 'a', 'b', 'c', 'd', 'e'});
        examen.mostrar();
        System.out.println("Nota: " + examen.corregir(new char[]{'z', 'b', 'c', 'a', 'e', 'z', 'b', 'z', 'z', 'd', 'a', 'a', 'a', 'a', 'e', 'a', 'b', 'c', 'd', 'e'}));
    }
}
