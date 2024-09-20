package VLGt03;

public class VLGt03e27 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int sum = 0, x = i;
            while (x>=10) {
                sum += x % 10;
                x /= 10;
            }
            sum += x;
            if (sum%3==0){
                System.out.println(i);
            }
        }
    }
}
