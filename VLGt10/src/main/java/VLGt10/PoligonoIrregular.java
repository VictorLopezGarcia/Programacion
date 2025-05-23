package VLGt10;

import java.util.ArrayList;

public class PoligonoIrregular implements Perimetrable{
    ArrayList <Integer> lados = new ArrayList <>();

    public PoligonoIrregular(ArrayList<Integer> lados){
        this.lados = lados;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        for (Integer lado : lados) {
            perimetro += lado;
        }
        return perimetro;
    }
}
