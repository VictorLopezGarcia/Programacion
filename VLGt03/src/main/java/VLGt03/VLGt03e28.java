package VLGt03;

import java.util.Scanner;

public class VLGt03e28 {
    public static void main(String[] args) {
        int n1, n2, mayor, menor, suma = 0, cont = 0, producto=1;
        double media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        n1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        n2 = teclado.nextInt();
        if(n1 > n2){
            mayor = n1;
            menor = n2;
        }else {
            mayor = n2;
            menor = n1;
        }
        for (int i = menor+1; i < mayor; i++) {
            if(i%2==0){
                suma += i;
                producto = i*i;
                cont++;
            }
        }
        media = (double)suma/cont;

        System.out.println("La suma de los numeros pares es: "+ suma);
        System.out.println("El producto de los numeros pares es: "+ producto);
        System.out.println("La media de los numeros pares es: "+ media);
    }
}
