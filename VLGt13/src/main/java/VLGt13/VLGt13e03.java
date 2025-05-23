package VLGt13;

import java.io.*;
import java.nio.file.Files;
import java.util.Objects;
import java.util.Scanner;

public class VLGt13e03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1");
        File f = new File("C:"+File.separator+"Users"+File.separator+"victor.lopezgarcia"+File.separator+"IdeaProjects"+File.separator+"DAM"+File.separator+"VLGt13"+File.separator+"src"+File.separator+"main"+File.separator+"archivos","fich02.txt");

        if (f.exists()) {
            File f2 = new File("C:"+File.separator+"Users"+File.separator+"victor.lopezgarcia"+File.separator+"IdeaProjects"+File.separator+"DAM"+File.separator+"VLGt13"+File.separator+"src"+File.separator+"main"+File.separator+"archivos","fich02.bak");
            try {
                Files.copy(f.toPath(), f2.toPath());
            } catch (IOException ex) {
                System.err.printf("Error:%s",ex.getMessage());
            }
        }

        try (
                FileOutputStream fos =new FileOutputStream(f, true);
                OutputStreamWriter osw =new OutputStreamWriter(fos,"ISO-8859-1");
                BufferedWriter bfw = new BufferedWriter(osw)) {
            String s = "";

            do{
                System.out.println("Introduce una cadena de texto (\"fin\" para terminar):");
                s = teclado.nextLine();
                if(!Objects.equals(s, "fin")){
                    bfw.write(s);
                    bfw.newLine();
                }
            }while(!Objects.equals(s, "fin"));
        } catch (IOException ex) {
            System.err.printf("Error:%s",ex.getMessage());
        }
    }
}
