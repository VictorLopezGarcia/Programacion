package VLGt03;

public class VLGt03e32 {

        public static void main(String[] args) {
            int x, cont=1;
            long bin=0;
            java.util.Scanner teclado = new java.util.Scanner(System.in);
            System.out.print("Introduce un número: ");
            x = teclado.nextInt();
            do{
                if(x%2!=0) {
                    bin += cont;
                }
                x = x/2;
                cont *= 10;
            }while(x!=0);
            System.out.println("El número en binario es: "+bin);
        }
}
