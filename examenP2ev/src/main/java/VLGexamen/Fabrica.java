package VLGexamen;

import java.util.ArrayList;

public class Fabrica {
    private final ArrayList<Sucursal> sucursales = new ArrayList<>();

    public Fabrica() {
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void anhadirSucursal(Sucursal sucursal){
        sucursales.add(sucursal);
    }

    public void borrarSucursal(String sucursal){
        sucursales.removeIf(objeto -> objeto.getNombre().equals(sucursal));
    }

    public void borrarInstrumento(String id){
        for (Sucursal sucursale : sucursales) {
            sucursale.getInstrumentos().removeIf(instrumento -> instrumento.getId().equals(id));
        }
    }

    @Override
    public String toString() {
        return "Fabrica{" +
                "sucursales=" + sucursales +
                '}';
    }
}
