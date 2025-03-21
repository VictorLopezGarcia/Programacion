import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VLGt13e06 {
    public static void main(String[] args) {
        int[] datos = leerFichero("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\fich02.txt");
        assert datos != null;
        System.out.println("Numero de caracteres: ");
        System.out.println(datos[0]);
        System.out.println("Numero de lineas: ");
        System.out.println(datos[1]);
        System.out.println("Numero de palabras: ");
        System.out.println(datos[2]);
    }

    public static int[] leerFichero(String ruta) {
        int[] numeros = new int[3];
        numeros[0] = 0;
        numeros[1] = 0;
        numeros[2] = 0;
        try {
            Path path = Paths.get(ruta);
            Files.readAllLines(path).forEach(Line -> {
                numeros[0] += Line.length();
                numeros[1]++;
                numeros[2] += Line.split(" ").length;
            });
        } catch (IOException ex) {
            System.err.printf("%nError:%s", ex.getMessage());
            return null;
        }catch (FileSystemNotFoundException e){
            return null;
        }
        return numeros;
    }
}

