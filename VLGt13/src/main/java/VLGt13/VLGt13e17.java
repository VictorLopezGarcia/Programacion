package VLGt13;

import java.io.*;
import java.util.ArrayList;

public class VLGt13e17 {
    public static void main(String[] args) {
        ArrayList<Trabajador_v2> trabajadores = new ArrayList<>();
        boolean eof = false;
        File fichero = new File("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\fich16.dat");
        try (FileInputStream fis = new FileInputStream(fichero);
             BufferedInputStream bufis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bufis)) {
            int cont = 0;
            while (!eof) {
                trabajadores.add((Trabajador_v2) ois.readObject());
                System.out.println(trabajadores.get(cont));
                if (++cont > trabajadores.size()) eof = true;
            }
        } catch (EOFException e) {
            eof = true;
        } catch (IOException ex) {
            System.err.println("Error:" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println("Err:" + ex.getMessage());
        }
    }
}
