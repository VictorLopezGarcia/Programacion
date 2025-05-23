package VLGt06;

import java.util.Date;

public class EjemplarLibro {

    private String titulo;
    private Date fecha;
    private int numeroEjemplar;
    private Boolean prestado=false;

    public EjemplarLibro(String titulo) {
        this.titulo = titulo;
        this.fecha = Date.from(new Date().toInstant());
        this.numeroEjemplar = 1;
    }

    public EjemplarLibro(EjemplarLibro ejemplar) {
        this.titulo = ejemplar.titulo;
        this.fecha = ejemplar.fecha;
        this.numeroEjemplar = ejemplar.numeroEjemplar + 1;
    }

    public boolean prestar() {
        if (this.prestado) {
            return false;
        }else {
            this.prestado = true;
            return true;
        }
    }

    public boolean devolver() {
        if (this.prestado) {
            this.prestado = false;
            return true;
        }else {
            return false;
        }
    }

    public String toString() {
        return "EjemplarLibro{" + "titulo=" + titulo + ", fecha=" + fecha + ", numeroEjemplar=" + numeroEjemplar + '}';
    }
}
