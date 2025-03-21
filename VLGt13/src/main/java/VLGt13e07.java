import java.io.*;
import java.util.Scanner;

public class VLGt13e07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try(FileOutputStream fis = new FileOutputStream("C:"+File.separator+"Users"+File.separator+"victor.lopezgarcia"+File.separator+"IdeaProjects"+File.separator+"DAM"+File.separator+"VLGt13"+File.separator+"src"+File.separator+"main"+File.separator+"archivos"+File.separator+"alumnos.csv");
            BufferedOutputStream bfos = new BufferedOutputStream(fis);
            DataOutputStream dos = new DataOutputStream(fis)) {
            PrintWriter pw = new PrintWriter(dos);
            System.out.println("Escribiendo en el fichero alumnos.csv");
            String entrada = "";
            do{
                pw.println("Nombre;fecha de nacimiento;notas de las tres evaluaciones");
                entrada = teclado.nextLine();
                if (!entrada.matches("Z;*") ){
                    pw.println(entrada);
                }
            }while (!entrada.matches("Z;*") );

        } catch (IOException ex) {
            System.err.printf("%nError:%s",ex.getMessage());
        }
    }
}
