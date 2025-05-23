package VLGt15;

import java.util.ArrayList;

public class ListaPequena<E> {
    private ArrayList<E> valores;
    private final int tamanhoMax;

    public ListaPequena(int tamanhoMax) {
        this.tamanhoMax = tamanhoMax;
        this.valores = new ArrayList<>();
    }

    public void anhadir(E valor) {
        if (valores.size() < tamanhoMax) {
            valores.add(valor);
        } else {
            valores.set(valores.size() - 1, valor);
        }
    }

    public void clear() {
        valores.clear();
    }

    public ArrayList<E> getValores() {
        return valores;
    }
}
