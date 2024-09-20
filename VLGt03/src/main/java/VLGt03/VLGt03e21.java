package VLGt03;

public class VLGt03e21 {
    public static void main(String[] args) {
        int ant=1, ant2=0, num=0;
        for (int i=0; i<12; i++){
            System.out.println(num);
            ant2 = ant;
            ant = num;
            num = ant + ant2;
        }
    }
}
