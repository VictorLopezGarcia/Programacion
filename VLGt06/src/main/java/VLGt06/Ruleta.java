package VLGt06;

public class Ruleta {

    public Ruleta(){}

    public int jugar(int apuesta, boolean par){
        int numero = (int) (Math.random() * 37);
        System.out.println("Ha salido el número: " + numero);
        boolean par1 = numero % 2 == 0;
        boolean impar = numero % 2 != 0;
        if (numero ==0){
            return apuesta*-1;
        } else if (par && par1 || !par && impar){
            return apuesta;
        } else {
            return apuesta*-1;
        }
    }
}
