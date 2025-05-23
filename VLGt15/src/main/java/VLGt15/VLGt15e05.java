package VLGt15;

import java.util.Scanner;

public class VLGt15e05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada;
        System.out.println("Inserte la cadena de texto:");
        entrada = teclado.nextLine();

        if (entrada.matches("^[0-9]{4}[A-Z]{3}$")){
            System.out.println("Se trata de una matricula de coche.");
        }else if (entrada.matches("^[0-1]+$")){
            System.out.println("Se trata de un numero binario.");
        }else if (entrada.matches("^[0-9A-F]{5,8}$")){
            System.out.println("Se trata de un numero hexadecimal entre 5 y 8 digitos.");
        }else if (entrada.matches("^[0-9]{4}-[0-9]{2}-[0-9]{2}$")){
            System.out.println("Se trata de una fecha en formato YYYY-MM-DD.");
        }else if (entrada.matches("^[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}$")){
            System.out.println("Se trata de una fecha en formato YYYY-MM-DD con mes y dia de uno o dos digitos.");
        }else if (entrada.matches("^@[A-Za-z0-9-_]{2,15}")){
            System.out.println("Se trata de un nombre de usuario de Twitter.");
        }else {
            System.out.println("No se trata de ninguna de las opciones anteriores.");
        }

    }
}
