package VLGt15;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class VLGt15e01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada;
        HashSet<Persona_v4> personas = new HashSet<>();
        do {
            System.out.println("Entrada de datos de distintas personas.");
            System.out.println("Ingrese el nombre de la persona(Z para salir):");
            entrada = teclado.nextLine();
            if (Objects.equals(entrada, "Z")) break;
            System.out.println("Ingrese el telefono de la persona:");
            int telefono = Integer.parseInt(teclado.nextLine());
            System.out.println("Ingrese el correo de la persona:");
            String correo = teclado.nextLine();
            System.out.println("Ingrese la fecha de nacimiento de la persona (YYYY-MM-DD):");
            String fecha = teclado.nextLine();
            String[] fechaPartes = fecha.split("-");
            int anio = Integer.parseInt(fechaPartes[0]);
            int mes = Integer.parseInt(fechaPartes[1]);
            int dia = Integer.parseInt(fechaPartes[2]);
            LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
            String generoEntrada;
            Genero genero = null;
            do {
                try{
                    System.out.println("Ingrese el Genero de la persona M/F:");
                    generoEntrada = teclado.nextLine();
                    genero = Genero.fromString(generoEntrada);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } while (genero == null);
            Persona_v4 persona = new Persona_v4(entrada, telefono, correo, fechaNacimiento, genero);
            System.out.println("Persona creada: "+ persona);
            personas.add(persona);
        }while (!Objects.equals(entrada, "Z"));
        System.out.println("Lista de personas:");
        for (Persona_v4 persona : personas) {
            System.out.println(persona);
        }
    }
}
