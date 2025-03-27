package VLGt13;

import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class VLGt13e09 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\alumnos.txt");
            List<String> lineas = Files.readAllLines(path);
            String mejorAlumno = "";
            int aprobado = 0;
            double mejorNota = 0;
            for (String linea : lineas) {
                double nota1, nota2, nota3, notaFinal;

                String nombre = linea.substring(0, 99).trim();
                String notas = linea.substring(109);
                notas = notas.replace(",", ".");

                nota1 = Double.parseDouble(notas.substring(0, 4));
                nota2 = Double.parseDouble(notas.substring(7, 11));
                nota3 = Double.parseDouble(notas.substring(14, 18));
                notaFinal = nota1*0.2 + nota2*0.3 + nota3*0.5;
                if (notaFinal >= 5){
                    aprobado++;
                }
                if (notaFinal>mejorNota) {
                    mejorAlumno = nombre;
                    mejorNota = notaFinal;
                }
            }
            System.out.println("Mejor Alumno: " + mejorAlumno + " Numero de aprobados: " + aprobado);

        } catch (IOException ex) {
            System.err.printf("%nError:%s", ex.getMessage());

        }catch (FileSystemNotFoundException e){
            System.err.println("Archivo no encontrado");
        }
    }
}
