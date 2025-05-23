package VLGt10;

public class VLGt10e11 {
    public static void main(String[] args) {
        TriAtleta_v2 triAtleta = new TriAtleta_v2("Pepe", 20, "H");
        TriAtleta_v2b triAtletaB = new TriAtleta_v2b("Pepe2", 20, "H");

        System.out.println("100 centimetros: ");
        System.out.println("TriAtleta_v2: " + triAtleta.saltaPertiga(100));
        System.out.println("TriAtleta_v2b: " + triAtletaB.saltaPertiga(100));
        System.out.println("550 centimetros: ");
        System.out.println("TriAtleta_v2: " + triAtleta.saltaPertiga(550));
        System.out.println("TriAtleta_v2b: " + triAtletaB.saltaPertiga(550));
        System.out.println("560 centimetros: ");
        System.out.println("TriAtleta_v2: " + triAtleta.saltaPertiga(560));
        System.out.println("TriAtleta_v2b: " + triAtletaB.saltaPertiga(560));
        System.out.println("580 centimetros: ");
        System.out.println("TriAtleta_v2: " + triAtleta.saltaPertiga(580));
        System.out.println("TriAtleta_v2b: " + triAtletaB.saltaPertiga(580));
        System.out.println("700 centimetros: ");
        System.out.println("TriAtleta_v2: " + triAtleta.saltaPertiga(700));
        System.out.println("TriAtleta_v2b: " + triAtletaB.saltaPertiga(700));


    }
}
