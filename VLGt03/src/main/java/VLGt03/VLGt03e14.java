package VLGt03;

public class VLGt03e14 {
    public static void main(String[] args) {
        int sum;
        for (int i = 2; i < 1000; i++) {
            sum = 0;
            for (int j = i-1; j >= 1; j--) {
                if(i % j == 0) sum+=j;
            }
            if(i == sum) System.out.println(i+ " es un numero perfecto.");
        }
    }
}
