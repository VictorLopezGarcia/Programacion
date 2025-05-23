package VLGt07;

import java.util.ArrayList;

public class CarritoCompra2 {
    private ArrayList<ArrayList<String>> carrito = new ArrayList<>();
    private double total=0;
    public CarritoCompra2() {

    }

    public void anadir(String codigo, String descripcion, String pvp, String ud) {
        double pTot = (Double.parseDouble(pvp)*Double.parseDouble(ud));
        ArrayList<String> producto = new ArrayList<>();
        producto.add(codigo);
        producto.add(descripcion);
        producto.add(pvp);
        producto.add(ud);
        producto.add(String.valueOf(pTot));
        carrito.add(producto);
        total+=pTot;
    }

    public void eliminar(String codigo) {
        for (int i = 0; i < carrito.size(); i++) {
            if (carrito.get(i).contains(codigo)) {
                carrito.remove(i);
            }
        }
    }

    public void vaciar() {
        carrito.clear();
    }

    public void imprimir() {
        for (int i = 0; i < carrito.size(); i++) {
            System.out.println("Producto: " + i+1);
            System.out.printf(
                    """
                              Codigo: %s\s
                              Descripción: %s\s
                              Pvp: %s\s
                              Ud: %.3s\s
                              Total: %.3s\s
                              """, carrito.get(i).get(0), carrito.get(i).get(1),  carrito.get(i).get(2),  carrito.get(i).get(3),  carrito.get(i).get(4));
        }
        System.out.printf("\nPvp total: %.2f", total);
    }
}
