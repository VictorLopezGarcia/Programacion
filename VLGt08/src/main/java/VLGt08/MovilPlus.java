package VLGt08;

public class MovilPlus extends MovilPrepago{
    public MovilPlus(long nM, float cEL, float cML, float cMB, float s) {
        super(nM, cEL, cML, cMB, s);
    }

    public void videollamada(int segundos){
        super.navegar(segundos*2);
    }
}
