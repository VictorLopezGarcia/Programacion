import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class VLGt13e05 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:"+ File.separator+"Users"+File.separator+"victor.lopezgarcia"+File.separator+"IdeaProjects"+File.separator+"DAM"+File.separator+"VLGt13"+File.separator+"src"+File.separator+"main"+File.separator+"archivos"+File.separator+"fich02.txt");
            Files.readAllLines(path).forEach(System.out::println);
        }
        catch (IOException ex) {System.err.printf("%nError:%s",ex.getMessage());
        }
    }
}
