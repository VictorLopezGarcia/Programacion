package VLGt10;

public interface Saltador_v2 {
    public int saltarAltura();
    public default boolean saltaPertiga(double altura){
        return false;
    }
}
