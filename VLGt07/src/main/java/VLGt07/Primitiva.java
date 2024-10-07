package VLGt07;

public class Primitiva {
    int [] numeros = new int[6];

    public Primitiva(){
        numeros=crearBoleto();
    }

    public int aciertos(int[] boleto){
        int aciertos = 0;
        for (int i : boleto) {
            for (int numero : numeros) {
                if (i == numero) {
                    aciertos++;
                    break;
                }
            }
        }
        return aciertos;
    }

    public int[] crearBoleto(){
        int[] boleto = new int[6];
        for (int i = 0; i < boleto.length; i++) {
            boleto[i] = (int) (Math.random() * 49 + 1);
            for (int j = 0; j < i; j++) {
                if(boleto[i] == boleto[j]){
                    i--;
                    break;
                }
            }
        }
        return boleto;
    }
}
