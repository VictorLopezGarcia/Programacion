package VLGt14;

import java.time.LocalDate;
import java.util.HashSet;

public class VLGr14e03 {
    public static void main(String[] args) {
        HashSet<Persona> personas = new HashSet<>();

        Persona p1 = new Persona("Pepe", 67212983, "pepe@gmail.com", LocalDate.of(1990, 5, 20));
        Persona p2 = new Persona("Pedro", 67212983, "pedro@gmail.com", LocalDate.of(1995, 5, 20));
        Persona p3 = new Persona("Juan", 67212983, "juan@gmail.com", LocalDate.of(1999, 5, 20));
        Persona p4 = new Persona("Fran", 67212983, "fran@gmail.com", LocalDate.of(1985, 5, 20));
        Persona p5 = new Persona("Jose", 67212983, "jose@gmail.com", LocalDate.of(1991, 5, 20));
        Persona p6 = new Persona("Jose", 67212983, "jose@gmail.com", LocalDate.of(1991, 5, 20));

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        personas.add(p5);// No se añade porque ya existe

        double media = 0;
        for (Persona persona : personas) {
            media += persona.calcularEdad();
        }

        media = media / personas.size();

        System.out.println("Media de edad: " + media);
        System.out.println();

        for (Persona persona : personas) {
            System.out.println(persona); // Imprime la información de cada persona sin orden
        }

    }
}
