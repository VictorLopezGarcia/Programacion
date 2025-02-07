package VLGt10;

public class VLGt10e09 {
    public static void main(String[] args) {
        Delfin d = new Delfin("Flipper", 5, "macho");
        BallenaAzul b = new BallenaAzul("Willy", 10, "macho");
        TriAtleta t = new TriAtleta("Rafa", 30, "macho");

        System.out.println("El delfin "+d.getNombre()+" nada "+d.nadar(1000)+" segundos");
        System.out.println("La ballena "+b.getNombre()+" nada "+b.nadar(1000)+" segundos");
        System.out.println("El triatleta "+t.getNombre()+" nada "+t.nadar(1000)+" segundos");



    }
}
