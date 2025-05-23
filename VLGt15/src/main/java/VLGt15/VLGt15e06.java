package VLGt15;

import java.util.Scanner;

public class VLGt15e06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada;
        System.out.println("Ingrese su correo electronico:");
        entrada = teclado.nextLine();

        if (!entrada.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z]{2,}$")) {
            System.out.println("El correo electronico no es valido.");
            return;
        }
        System.out.println("Nombre de usuario: "+entrada.substring(0, entrada.indexOf("@")));
        System.out.println("TLD: "+entrada.substring(entrada.indexOf(".")+1));
    }
}
