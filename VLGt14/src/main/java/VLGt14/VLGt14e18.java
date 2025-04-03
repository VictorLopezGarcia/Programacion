package VLGt14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class VLGt14e18 {
    public static void main(String[] args) {
        ArrayList<Persona_v3> personas = new ArrayList<>();

        Persona_v3 p1 = new Persona_v3("Pepe", 67212983, "3pepe@gmail.com", LocalDate.of(1990, 5, 20));
        Persona_v3 p2 = new Persona_v3("Pedro", 67212983, "4pedro@gmail.com", LocalDate.of(1995, 5, 20));
        Persona_v3 p3 = new Persona_v3("Juan", 67212983, "5juan@gmail.com", LocalDate.of(1999, 5, 20));
        Persona_v3 p4 = new Persona_v3("Fran", 67212983, "7fran@gmail.com", LocalDate.of(1985, 5, 20));
        Persona_v3 p5 = new Persona_v3("Jose", 67212983, "6jose@gmail.com", LocalDate.of(1991, 5, 20));
        Persona_v3 p6 = new Persona_v3("JOSE", 67212983, "jose@gmail.com", LocalDate.of(1991, 5, 20));

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        personas.add(p6);// No se añade porque ya existe

        Set<Persona_v3> set = new HashSet<>(personas);


        personas  = new ArrayList<>(set);

        for (Persona_v3 persona : personas) {
            System.out.println(persona); // Aquì se imprime la información de cada persona en el orden en que fueron añadidas
        }

    }
}
