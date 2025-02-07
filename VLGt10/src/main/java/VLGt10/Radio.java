package VLGt10;

public class Radio implements Dispositivo{

    private double dial;
    private final double min = 88.0;
    private final double max = 104.0;

    public Radio() {
        this.dial = 88.0;
    }


    @Override
    public boolean subir() {
        if(dial < max){
            this.dial+=0.1;
            return true;
        }
        return false;
    }

    @Override
    public boolean bajar() {
        if (dial > min) {
            this.dial-=0.1;
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        this.dial = 88.0;
    }

    @Override
    public String verEstado() {
        return "Radio:\n" +
                "Dial: " + this.dial;
    }
}
