package VLGt03;

public class VLGt03e19 {
    public static void main(String[] args) {
        int num, num2;
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();
        do {
            System.out.println("Introduce un numero: ");
            num2 = teclado.nextInt();
            if (num2 >= num) {
                num = num2;
                System.out.println("Estan ordenados.");
        } else if(num2 != 0) {
                System.out.println("No estan ordenados.");
                break;
            }
        } while (num2 != 0);
    }
}
