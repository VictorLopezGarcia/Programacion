package VLGt03;

public class VLGt03e25 {
    public static void main(String[] args) {
        int num;
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Introduce un numero de lineas: ");
        num = teclado.nextInt();
        for (int i = 0; i < num; i++) {
            if(i%2==0)System.out.println("hola");
            else System.out.println("adios");
        }
    }
}
