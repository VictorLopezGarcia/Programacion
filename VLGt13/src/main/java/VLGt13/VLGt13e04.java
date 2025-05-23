package VLGt13;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VLGt13e04 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:"+ File.separator+"Users"+File.separator+"victor.lopezgarcia"+File.separator+"IdeaProjects"+File.separator+"DAM"+File.separator+"VLGt13"+File.separator+"src"+File.separator+"main"+File.separator+"archivos"+File.separator+"fich02.txt");
            Files.readAllLines(path).forEach(Line -> System.out.println(Line.toUpperCase()));
        }
        catch (IOException ex) {System.err.printf("%nError:%s",ex.getMessage());
        }
    }
}