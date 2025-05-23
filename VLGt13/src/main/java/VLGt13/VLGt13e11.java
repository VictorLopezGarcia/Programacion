package VLGt13;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VLGt13e11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try (RandomAccessFile raf = new RandomAccessFile("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\fich11.dat", "rw")) {
            raf.seek(raf.length());
            double temp;
            do {
                System.out.println("Introduce una temperatura ('.' para separar decimales, -999 para salir) :");
                temp = Double.parseDouble(teclado.nextLine());
                if (temp == -999) break;
                raf.writeDouble(temp);
                raf.seek(raf.length());
                raf.writeUTF(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss")));
            }while (true);
        } catch (IOException ex) {
            System.err.printf("%nError:%s",ex.getMessage());
        }

    }
}
