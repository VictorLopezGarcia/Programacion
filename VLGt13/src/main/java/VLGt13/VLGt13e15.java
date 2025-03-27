package VLGt13;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class VLGt13e15 {

    private static final int anyo = 2024;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try (RandomAccessFile raf = new RandomAccessFile("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\fich15.dat", "rw")) {
            raf.setLength(0);
            raf.seek(0);
            double temp;
            LocalDate fecha = LocalDate.of(anyo, Month.JANUARY, 1);
            do {
                raf.seek(raf.length());
                temp = Math.round(new Random().nextDouble() * 40 * 100.0) / 100.0;
                raf.writeDouble(temp);
                fecha = fecha.plusDays(1);
                raf.seek(raf.length());
                raf.writeUTF(fecha.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
            }while (fecha.isBefore(LocalDate.of(anyo+1, Month.JANUARY, 1)));
            System.out.println("Introduce un dia: ");
            int dia = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce un mes: ");
            int mes = Integer.parseInt(teclado.nextLine());
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                double tempL = raf.readDouble();
                String fechaL = raf.readUTF();
                if (fechaL.equals(LocalDate.of(anyo, mes, dia).format(DateTimeFormatter.ofPattern("yyyyMMdd")))){
                    System.out.println("Temperatura: " + tempL + ", fecha: " + LocalDate.of(anyo, mes, dia).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                }
            }
        } catch (IOException ex) {
            System.err.printf("%nError:%s",ex.getMessage());
        }
    }
}
