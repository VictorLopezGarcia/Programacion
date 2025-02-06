package VLGexamen;


public class Timbre {
    private boolean activo;

    public Timbre(){
        this.activo = false;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean estado){
        this.activo = estado;
    }
}
