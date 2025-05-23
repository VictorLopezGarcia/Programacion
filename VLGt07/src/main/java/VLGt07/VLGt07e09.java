package VLGt07;

public class VLGt07e09 {
    public static void main(String[] args) {
        int[] edades = {15, 17, 18, 19, 17, 15, 16, 18, 19, 20, 21, 22, 23, 24, 25};
        double med = media(edades);
        int[] mayores = mayores(edades);
    }

    public static double media(int[] edades){
        int suma = 0;
        for (int edad : edades) {
            suma += edad;
        }
        return (double) suma/edades.length;
    }

    public static int[] mayores(int[] edades){
        int [] mayores = new int[edades.length];
        int contador = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                mayores[contador] = edad;
                contador++;
            }
        }
        return mayores;
    }
}
