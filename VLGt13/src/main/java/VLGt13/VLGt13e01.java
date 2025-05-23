package VLGt13;

import java.io.*;

public class VLGt13e01 {
    public static void main(String[] args) {
        File f = new File("C:"+File.separator+"Users"+File.separator+"victor.lopezgarcia"+File.separator+"IdeaProjects"+File.separator+"DAM"+File.separator+"VLGt13"+File.separator+"src"+File.separator+"main"+File.separator+"archivos","fich01ISO.txt");
        try (
                FileOutputStream fos =new FileOutputStream(f, false);
                OutputStreamWriter osw =new OutputStreamWriter(fos,"ISO-8859-1");
                BufferedWriter bfw = new BufferedWriter(osw)) {
            bfw.write("Esto es un texto"); bfw.newLine();
            bfw.write("Esto es otro texto con eñe");
        } catch (IOException ex) {
            System.err.printf("Error:%s",ex.getMessage());
        }
    }
}
