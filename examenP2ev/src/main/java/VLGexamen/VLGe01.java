package VLGexamen;

import java.util.Scanner;

public class VLGe01 {
    public static void main(String[] args) {
        int tamano;
        int [] medidas;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Introduce el numero de medidas emitidas por el sonar: ");
            tamano = Integer.parseInt(teclado.nextLine());
        }while (tamano<0);

        System.out.println("Introduce las medidas");
        medidas = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.println("Medida: "+ (i+1));
            medidas[i]= Integer.parseInt(teclado.nextLine());
        }

        System.out.println("La profundidad del fodo marino ha aumentado "+ aumento(medidas) +" veces en las últimas "+ tamano +" medidas.");
    }

    public static int aumento(int [] medidas){
        int cont =0;
        for (int i = 1; i < medidas.length; i++) {
            if(medidas[i-1]<medidas[i]) cont++;
        }
        return cont;
    }

}
