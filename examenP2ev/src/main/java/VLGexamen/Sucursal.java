package VLGexamen;

import java.util.ArrayList;

public class Sucursal {
    private final String nombre;
    private final ArrayList<Instrumento> instrumentos;

    public Sucursal(String nombre, ArrayList<Instrumento> instrumentos){
        this.nombre = nombre;
        this.instrumentos = instrumentos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public ArrayList<Instrumento> instrumentoPorTipo(Tipo tipo){
        ArrayList<Instrumento> InstrumentosTipo = new ArrayList<>();
        for(Instrumento instrumento : instrumentos){
            if(instrumento.getTipo().equals(tipo)) InstrumentosTipo.add(instrumento);
        }
        return InstrumentosTipo;
    }

    public void listarInstrumentos(){
        for(Instrumento instrumento : instrumentos){
            System.out.println(instrumento.toString());
        }
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", instrumentos=" + instrumentos +
                '}';
    }
}
