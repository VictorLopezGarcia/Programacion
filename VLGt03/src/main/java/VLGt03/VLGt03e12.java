package VLGt03;

import java.util.Scanner;

public class VLGt03e12 {
    public static void main(String[] args) {
        double nota, sum=0, total=0, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, media;
        boolean exact = false;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduce una nota: ");
            nota = teclado.nextInt();
            total++;
            sum += nota;
            if(min > nota) min = nota;
            if(max < nota) max = nota;
            if(nota == 5.0) exact = true;
        }while (nota != -1);
        media = sum / total;
        System.out.println("Hay un total de "+ total +" notas introducidas");
        System.out.println("La nota mas baja es: "+ min);
        System.out.println("La nota mas alta es: "+ max);
        System.out.println("La media es: "+ media);
        if(exact) System.out.println("Hay un 5 exacto");
        else System.out.println("No hay un 5 exacto");
    }
}
