package VLGt07;

public class VLGt07e22 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("· El mayor número del array es: " + mayor(array));
    }

    public static int mayor(int[] array) {
        int mayor = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }
}
