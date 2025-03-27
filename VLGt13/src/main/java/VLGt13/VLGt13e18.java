package VLGt13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class VLGt13e18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String CosteConsumoDatos, CosteMinutoLlamada;
        System.out.println("Introduce el coste del consumo de datos: ");
        CosteConsumoDatos = teclado.nextLine();
        System.out.println("Introduce el coste del minuto de llamada: ");
        CosteMinutoLlamada = teclado.nextLine();
        Properties config = new Properties();
        config.setProperty("CosteConsumoDatos", CosteConsumoDatos);
        config.setProperty("CosteMinutoLlamada", CosteMinutoLlamada);
        try {config.store(new FileOutputStream("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\moviles.props"),"Fichero de Configuración.");}
        catch (IOException ioe) {ioe.printStackTrace();}
    }
}
