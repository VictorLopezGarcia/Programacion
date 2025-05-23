package VLGt07;

public class hipotenusa {
    public static void main(String[] args) {
        double cateto1 = Double.parseDouble(args[0]);
        double cateto2 = Double.parseDouble(args[1]);
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
