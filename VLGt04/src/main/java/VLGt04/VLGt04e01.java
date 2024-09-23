package VLGt04;

import java.util.Scanner;


public class VLGt04e01 {
    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String option, var;
        System.out.print("Introduce la cadena: ");
        var = teclado.nextLine();
        System.out.print("Introduce el apartado: ");
        option = teclado.next();
        selectOption(option, var);
    }

    public static void selectOption(String option, String var) {
        switch (option) {
            case "a" -> a(var);
            case "b" -> b(var);
            case "c" -> c(var);
            case "d" -> d(var);
            case "e" -> e(var);
            case "f" -> f(var);
            case "g" -> g(var);
            case "h" -> h(var);
            case "i" -> i(var);
            case "j" -> j(var);
            case "k" -> k(var);
            case "l" -> l(var);
            case "m" -> m(var);
            case "n" -> n(var);
            default -> System.out.println("Introduce un apartado valido");
        }
    }

    public static void a(String var) {
        System.out.println(var.toLowerCase());
        System.out.println(var.toUpperCase());
    }

    public static void b(String var) {
        for (int i = 0; i < var.length(); i++) {
            if (var.charAt(i) == 'x') {
                System.out.println("Aparece la letra x");
                break;
            }
        }
    }

    public static void c(String var) {
        if(var.length() > 10){
            System.out.println("La cadena tiene más de 10 caracteres");
        } else {
            System.out.println("La cadena tiene menos de 10 caracteres");
        }
    }

    public static void d(String var) {
        for (int i = 3; i < var.length(); i++) {
            if (var.charAt(i) == 'x') {
                System.out.println("Aparece la letra x a partir de la cuarta posición");
                break;
            }
        }
    }

    public static void e(String var) {
        System.out.println(var.substring(0, 4));
    }

    public static void f(String var) {
        System.out.println(var.substring(var.length()-4));
    }

    public static void g(String var) {
        if (var.equals("hola")) {
            System.out.println("La cadena es igual a hola");
        } else {
            System.out.println("La cadena no es igual a hola");
        }
    }

    public static void h(String var) {
        int x = Integer.parseInt(var);
        System.out.println(x);
    }

    public static void i(String var) {
        int number = Integer.parseInt(var, 16);
        System.out.println(number);
    }

    public static void j(String var) {
        if(var.contains("prueva")){
            var = var.replace("prueva", "prueba");
        }
        System.out.println(var);
    }

    public static void k(String var) {
       if(var.charAt(0) == var.charAt(var.length()-1)){
           System.out.println("El primer y último caracter son iguales");
       } else {
           System.out.println("El primer y último caracter no son iguales");
       }
    }

    public static void l(String var) {
        int cont=0;
        for (int i = 0; i < var.length(); i++) {
            if (var.charAt(i)>='0' && var.charAt(i)<='9') {
                cont++;
            }
        }
        System.out.println("La cadena tiene " + cont + " números");
    }

    public static void m(String var) {
        String reverse = "";
        for (int i = var.length()-1; i >= 0; i--) {
            reverse = var.charAt(i) + reverse;
        }
        if(reverse.equals(var)){
            System.out.println("La cadena es un palíndromo");
        } else {
            System.out.println("La cadena no es un palíndromo");
        }
    }

    public static void n(String var) {
        char first = var.charAt(0);
        char last = var.charAt(var.length() - 1);
        var = last + var.substring(1, var.length() - 1) + first;
        System.out.println(var);
    }

}
