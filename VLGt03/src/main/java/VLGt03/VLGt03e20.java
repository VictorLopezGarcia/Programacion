package VLGt03;

public class VLGt03e20 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000 ; i++) {
            if(i % 2 != 0 || i == 2) {
                boolean isPrime = true;
                for (int j = 2; j <= i/2; j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) System.out.println(i+" es primo.");
            }
        }
    }
}
