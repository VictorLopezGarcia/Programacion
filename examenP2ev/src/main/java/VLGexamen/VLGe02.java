package VLGexamen;

import java.util.ArrayList;

public class VLGe02 {
    public static void main(String[] args) {
        Instrumento instrumento1 = new Instrumento("V1", "Flauta travesera", 201.95, Tipo.viento);
        Instrumento instrumento2 = new Instrumento("V2", "Clarinete", 305.95, Tipo.viento);
        Instrumento instrumento3 = new Instrumento("C1", "Guitarra Alhambra 3C", 435, Tipo.cuerda);

        Instrumento instrumento4 = new Instrumento("C2", "Mandolina", 260.60, Tipo.cuerda);
        Instrumento instrumento5 = new Instrumento("P1", "Maracas", 35, Tipo.Percusion);
        Instrumento instrumento6 = new Instrumento("P2", "Pandereta", 45, Tipo.Percusion);

        ArrayList<Instrumento> instrumentos1 = new ArrayList<>();
        ArrayList<Instrumento> instrumentos2 = new ArrayList<>();

        instrumentos1.add(instrumento1);
        instrumentos1.add(instrumento2);
        instrumentos1.add(instrumento3);

        instrumentos2.add(instrumento4);
        instrumentos2.add(instrumento5);
        instrumentos2.add(instrumento6);

        Sucursal sucursal1 = new Sucursal("Sucursal A Coruña", instrumentos1);
        Sucursal sucursal2 = new Sucursal("Sucursal Pontevedra", instrumentos2);

        Fabrica fabrica = new Fabrica();

        fabrica.anhadirSucursal(sucursal1);
        fabrica.anhadirSucursal(sucursal2);

        System.out.println("Imprimiendo listado instrumentos sucursal 1");
        sucursal1.listarInstrumentos();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Imprimiendo listado instrumentos sucursal 2");
        sucursal2.listarInstrumentos();
        System.out.println("-----------------------------------------------------------");

        System.out.println("Borrando elemento con id V1");
        System.out.println("-----------------------------------------------------------");

        fabrica.borrarInstrumento("V1");
        System.out.println("-----------------------------------------------------------");

        System.out.println("Borrando elemento con id C2");
        System.out.println("-----------------------------------------------------------");

        fabrica.borrarInstrumento("C2");
        System.out.println("Imprimiendo listado instrumentos sucursal 1");

        sucursal1.listarInstrumentos();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Imprimiendo listado instrumentos sucursal 2");
        sucursal2.listarInstrumentos();
        System.out.println("-----------------------------------------------------------");
        System.out.println(fabrica);
        System.out.println("-----------------------------------------------------------");

        fabrica.borrarSucursal("2");

        System.out.println(fabrica);
        System.out.println("-----------------------------------------------------------");


    }
}
