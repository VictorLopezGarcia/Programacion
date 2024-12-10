package ExamenF1;

import java.util.Scanner;

public class VLGe01e02 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String entrada, invertida;
        System.out.println("Introduce la frase a invertir:");
        entrada = teclado.nextLine();

        invertida = invertirFrase(entrada);
        System.out.println("Tu frase invertida es: "+invertida);
    }

    public static String invertirFrase(String entrada) {
        StringBuilder invertida = new StringBuilder();

        for (int i = entrada.length()-1; i >= 0; i--) {
            invertida.append(entrada.charAt(i));
        }
        return invertida.toString();
    }


}
