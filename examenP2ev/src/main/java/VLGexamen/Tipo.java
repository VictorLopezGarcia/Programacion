package VLGexamen;

public enum Tipo {
    Percusion,viento,cuerda;

    @Override
    public String toString() {
        if (this.equals(Percusion)) return "Percusion";
        else if (this.equals(viento)) return "Viento";
        else return "Cuerda";
    }
}
