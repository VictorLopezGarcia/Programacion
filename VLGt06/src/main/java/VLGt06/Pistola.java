package VLGt06;

public class Pistola {
    private int disparo = 1;
    private boolean cargada;
    private int balaCargada;

    public Pistola() {
        cargada = false;
    }

    public void cargar() {
        if (cargada) {
            System.out.println("La pistola ya está cargada");
        } else {
            balaCargada = (int) (Math.random() * 6 + 1);
            cargada = true;
            System.out.println("Pistola cargada");
        }
    }

    public boolean jugar(){
        if (!cargada) {
            System.out.println("La pistola no está cargada");
            return false;
        } else {
            if (disparo == balaCargada) {
                System.out.println("PUM!!!");
                System.out.println("Has muerto");
                cargada = false;
                return false;
            }else{
                System.out.println("Click");
                System.out.println("Estás vivo");
                disparo++;
                return true;
            }
        }
    }

    public int getDisparoRestante() {
        return 7-disparo;
    }
}
