package VLGt03;

public class VLGt03e23 {
    public static void main(String[] args) {
        int num, cont = 0, suma = 0;
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        do{
            System.out.println("Introduce un numero: ");
            num = teclado.nextInt();
            if(num<=1000)suma += num;
            System.out.println("La suma es: "+ suma);
            cont++;
        }while (num <= 1000 && cont < 15);
    }
}
