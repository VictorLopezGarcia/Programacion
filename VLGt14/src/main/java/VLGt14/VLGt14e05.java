package VLGt14;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class VLGt14e05 {
    public static void main(String[] args) {
        LinkedHashSet<Persona_v2> personas = new LinkedHashSet<>();

        Persona_v2 p1 = new Persona_v2("Pepe", 67212983, "pepe@gmail.com", LocalDate.of(1990, 5, 20));
        Persona_v2 p2 = new Persona_v2("Pedro", 67212983, "pedro@gmail.com", LocalDate.of(1995, 5, 20));
        Persona_v2 p3 = new Persona_v2("Juan", 67212983, "juan@gmail.com", LocalDate.of(1999, 5, 20));
        Persona_v2 p4 = new Persona_v2("Fran", 67212983, "fran@gmail.com", LocalDate.of(1985, 5, 20));
        Persona_v2 p5 = new Persona_v2("Jose", 67212983, "jose@gmail.com", LocalDate.of(1991, 5, 20));
        Persona_v2 p6 = new Persona_v2("JOSE", 67212983, "jose@gmail.com", LocalDate.of(1991, 5, 20));

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        personas.add(p6);// No se añade porque ya existe

        double media = 0;
        for (Persona_v2 persona : personas) {
            media += persona.calcularEdad();
        }

        media = media / personas.size();

        System.out.println("Media de edad: " + media);
        System.out.println();

        for (Persona_v2 persona : personas) {
            System.out.println(persona); // Aquì se imprime la información de cada persona en el orden en que fueron añadidas
        }


    }
}
