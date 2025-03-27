package VLGt13;

import java.io.IOException;
import java.io.RandomAccessFile;


public class VLGt13e14 {
    public static void main(String[] args) {
        if(comprobarTipoArchivo("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\blackbuck.bmp")){
            System.out.println("El archivo es una imagen");
        } else {
            System.out.println("El archivo no es una imagen");
        }
        if(comprobarTipoArchivo("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\Juan-meme-4.jpg")){
            System.out.println("El archivo es una imagen");
        } else {
            System.out.println("El archivo no es una imagen");
        }
        if(comprobarTipoArchivo("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\fich01.txt")){
            System.out.println("El archivo es una imagen");
        } else {
            System.out.println("El archivo no es una imagen");
        }
    }

    public static boolean comprobarTipoArchivo(String path){
        try (RandomAccessFile raf = new RandomAccessFile(path, "r")) {
            raf.seek(0);
            byte[] cabecera = new byte[2];
            raf.read(cabecera);
            if(cabecera[0] == (byte)0x42 && cabecera[1] == (byte)0x4D) {
                return true;
            } else return cabecera[0] == (byte)0xFF && cabecera[1] == (byte)0xD8;
        } catch (IOException ex) {
            System.err.printf("%nError:%s",ex.getMessage());
        }
        return false;
    }

}
