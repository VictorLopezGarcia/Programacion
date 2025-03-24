import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class VLGt13e13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        int count = 0;
        System.out.println("Introduce la fecha inicial (dd/MM/yyyy):");
        String fechaInicial = teclado.nextLine();
        System.out.println("Introduce la fecha final (dd/MM/yyyy):");
        String fechaFinal = teclado.nextLine();
        try (DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\fich11.dat"))) {
            while (dis.available() > 0) {
                String fecha = dis.readUTF();
                if(fecha.compareTo(fechaInicial) < 0 || fecha.compareTo(fechaFinal) > 0){
                    double temp = dis.readDouble();
                    media += temp;
                    System.out.println("Temperatura: " + temp + ", fecha: " + fecha);
                    count++;
                }
            }
            System.out.println("Media de temperaturas: " + media/count);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}