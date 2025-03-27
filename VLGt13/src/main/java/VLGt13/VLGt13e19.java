package VLGt13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class VLGt13e19 {
    public static void main(String[] args) {
        String CosteConsumoDatos, CosteMinutoLlamada;

        Properties config = new Properties();
        try {
            ArrayList<MovilPrepago> moviles = new ArrayList<>();
            config.load(new FileInputStream("C:\\Users\\victor.lopezgarcia\\IdeaProjects\\DAM\\VLGt13\\src\\main\\archivos\\moviles.props"));
            CosteConsumoDatos = config.getProperty("CosteConsumoDatos");
            CosteMinutoLlamada = config.getProperty("CosteMinutoLlamada");
            moviles.add(new MovilPrepago(604568210,0.6f, Float.parseFloat(CosteConsumoDatos), Float.parseFloat(CosteMinutoLlamada), 100.0f));
            moviles.add(new MovilPrepago(604568210,0.6f, Float.parseFloat(CosteConsumoDatos), Float.parseFloat(CosteMinutoLlamada), 100.0f));
            moviles.add(new MovilPrepago(604568210,0.6f, Float.parseFloat(CosteConsumoDatos), Float.parseFloat(CosteMinutoLlamada), 100.0f));
            moviles.add(new MovilPrepago(604568210,0.6f, Float.parseFloat(CosteConsumoDatos), Float.parseFloat(CosteMinutoLlamada), 100.0f));
            for (MovilPrepago movil : moviles) {
                System.out.println(movil);
            }
            System.out.println("Coste de la llamada: " + CosteMinutoLlamada);
            System.out.println("Coste de datos: " + CosteConsumoDatos);

        } catch (IOException ioe) {ioe.printStackTrace();}




    }
}
