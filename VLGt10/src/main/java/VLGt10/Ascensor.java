package VLGt10;

public class Ascensor implements Dispositivo{

    private int piso;
    private final int min = 0;
    private final int max = 8;

    public Ascensor() {
        this.piso = 0;
    }

    @Override
    public boolean subir() {
        if(piso < max){
            piso++;
            return true;
        }
        return false;
    }

    @Override
    public boolean bajar() {
        if(piso > min){
            piso--;
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        piso = 0;
    }

    @Override
    public String verEstado() {
        return "Ascensor:\n" +
                "Piso: " + piso;
    }
}
