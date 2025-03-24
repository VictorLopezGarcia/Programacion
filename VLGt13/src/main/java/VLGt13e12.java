import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class VLGt13e12 {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\fich11.dat"))) {
            while (dis.available() > 0) {
                double temp = dis.readDouble();
                String fecha = dis.readUTF();
                System.out.println("Temperatura: " + temp + ", fecha: " + fecha);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}