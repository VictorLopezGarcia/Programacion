package VLGt10;


public class MovilPlus_v2 extends MovilPrepago_v2 {
    public MovilPlus_v2(long nM, float cEL, float cML, float cMB, float s) {
        super(nM, cEL, cML, cMB, s);
    }

    public void videollamada(int segundos){
        super.navegar(segundos*2);
    }
}
