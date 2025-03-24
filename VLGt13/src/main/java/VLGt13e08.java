import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class VLGt13e08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try (PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\alumnos.txt", true))) {
            System.out.println("Escribiendo en el fichero alumnos.txt");
            String nombre, fecha;
            double nota1, nota2, nota3;

            while (true){
                System.out.println("Introce el nombre del alumno (Z para terminar):");
                nombre = teclado.nextLine();
                if (nombre.equals("Z")){
                    break;
                }
                System.out.println("Introce la fecha de nacimiento del alumno (AAAAMMDD):");
                fecha = teclado.nextLine();
                System.out.print("Ingrese la nota de la primera evaluación: ");
                nota1 = Integer.parseInt(teclado.nextLine());
                System.out.print("Ingrese la nota de la segunda evaluación: ");
                nota2 = Integer.parseInt(teclado.nextLine());
                System.out.print("Ingrese la nota de la tercera evaluación: ");
                nota3 = Integer.parseInt(teclado.nextLine());

                pw.printf("%-100s%s %06.2f  %06.2f  %06.2f%n", nombre, fecha, nota1, nota2, nota3);

            }

        } catch (IOException ex) {
            System.err.printf("%nError:%s",ex.getMessage());
        }
    }
}
