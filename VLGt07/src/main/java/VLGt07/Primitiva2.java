package VLGt07;

import java.util.ArrayList;

public class Primitiva2 {
    ArrayList<Integer> numeros = new ArrayList<>();

    public Primitiva2(){
        iniciarBoleto();
    }

    public int aciertos( ArrayList<Integer> boleto){
        int aciertos = 0;
        for (int i = 0; i < boleto.size(); i++) {
            if(busquedaDicotomica(boleto.get(i))) aciertos++;
        }
        return aciertos;
    }

    public boolean busquedaDicotomica(int num){
        int centro,inf=0,sup=numeros.size()-1;
        while(inf<=sup){
            centro=((sup-inf)/2)+inf;
            if(numeros.get(centro)==num) return true;
            else if(num < numeros.get(centro)) sup=centro-1;
            else inf=centro+1;
        }
        return false;
    }

    public void iniciarBoleto(){
        for (int i = 0; i < 6; i++) {
            int numero = (int) (Math.random() * 49 + 1);
            if (!numeros.contains(numero)) {
                numeros.add(numero);
            }else{
                i--;
            }
        }
        numeros.sort(Integer::compare);
    }

    public ArrayList<Integer> crearBoleto(){
        ArrayList<Integer> boleto = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int numero = (int) (Math.random() * 49 + 1);
            if (!boleto.contains(numero)) {
                boleto.add(numero);
            }else{
                i--;
            }
        }
        return boleto;
    }

}
