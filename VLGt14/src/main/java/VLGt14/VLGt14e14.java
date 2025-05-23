package VLGt14;

import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeMap;

public class VLGt14e14 {

    private static TreeMap<String, String> paisesCapital = new TreeMap<>();
    private static TreeMap<String, Integer> paisesPoblacion = new TreeMap<>();

    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt14\\src\\main\\java\\VLGt14\\paises2019.csv");
            List<String> lineas = Files.readAllLines(path);
            String nombre = "", capital = "";
            int poblacion = 0;
            for (String linea : lineas) {
                String[] datos = linea.split(";");
                nombre = datos[0];
                capital = datos[1];
                poblacion = Integer.parseInt(datos[2]);
                paisesCapital.put(nombre, capital);
                paisesPoblacion.put(nombre, poblacion);
            }
            mostrarPoblacion();
            mostrarCapitales();
        } catch (
                IOException ex) {
            System.err.printf("%nError:%s", ex.getMessage());

        }catch (
                FileSystemNotFoundException e){
            System.err.println("Archivo no encontrado");
        }


    }

    private static void mostrarPoblacion() {
        System.out.println("Poblacion de los paises:");
        for (String pais : paisesPoblacion.keySet()) {
            System.out.printf("%s: %d%n", pais, paisesPoblacion.get(pais));
        }
    }

    private static void mostrarCapitales() {
        System.out.println("Capitales de los paises:");
        for (String pais : paisesCapital.keySet()) {
            System.out.printf("%s: %s%n", pais, paisesCapital.get(pais));
        }
    }
}
