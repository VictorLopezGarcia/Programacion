package VLGexamen;

public class Instrumento {

    private final String id;
    private final String desc;
    private final double pvp;
    private final Tipo tipo;

    public Instrumento(String id, String desc, double pvp, Tipo tipo){
        this.id = id;
        this.desc = desc;
        this.pvp = pvp;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", pvp=" + pvp +
                ", tipo=" + tipo.toString() +
                '}';
    }
}
