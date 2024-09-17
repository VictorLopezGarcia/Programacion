
package vlgt02;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt02e01 {

    private static final Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        String a;
        System.out.print("Introduce el apartado: ");
        String option = teclado.next();
        selectOption(option);
    }

    public static void selectOption(String option) {
        switch (option) {
            case "a" -> a();
            case "b" -> b();
            case "c" -> c();
            case "d" -> d();
            case "e" -> e();
            case "f" -> f();
            case "g" -> g();
            case "h" -> h();
            case "i" -> i();
            case "j" -> j();
            case "k" -> k();
            case "l" -> l();
            case "m" -> m();
            default -> System.out.println("Introduce un apartado valido");
        }
    }
    
    public static void a(){
        int a;
        System.out.println("Introduce el valor: ");
        a = teclado.nextInt();
        if (a > 10)
            System.out.println(a + " es mayor que 10.");
        else
            System.out.println(a + " es menor o igual que 10.");
    }
    
    public static void b() {
        int a, b;
        System.out.println("Introduce el valor 1: ");
        a = teclado.nextInt();
        System.out.println("Introduce el valor 2: ");
        b = teclado.nextInt();
        if (a > b) {
            System.out.println(a + " es mayor que "+ b);
        } else {
            System.out.println(a + " es menor o igual que "+ b);
        }
    }
    
    public static void c() {
        int a;
        System.out.println("Introduce el valor: ");
        a = teclado.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " es par.");
        } else {
            System.out.println(a + " es impar.");
        }
    }
    
    public static void d() {
        int a, b;
        System.out.println("Introduce el valor 1: ");
        a = teclado.nextInt();
        System.out.println("Introduce el valor 2: ");
        b = teclado.nextInt();
        if (a > 10 && b > 10) {
            System.out.println(a + " y " + b + " son mayores que 10.");
        } else {
            System.out.println(" o " + a + " o " + b + " es menor o igual que 10.");
        }
    }
    
    public static void e() {
        int a, b;
        System.out.println("Introduce el valor 1: ");
        a = teclado.nextInt();
        System.out.println("Introduce el valor 2: ");
        b = teclado.nextInt();
        if (a > 10 || b > 10) {
            System.out.println(" o " + a + " o " + b + " es mayor que 10.");
        } else {
            System.out.println(" ni " + a + " ni " + b + " son mayores que 10.");
        }
    }
    
    public static void f() {
        int a;
        System.out.println("Introduce el valor: ");
        a = teclado.nextInt();
        if (a >= 10 && a <= 20) {
            System.out.println(a + " esta comprendido entre 10 y 20.");
        } else {
            System.out.println(a + " no esta comprendido entre 10 y 20.");
        }
    }
    
    public static void g() {
        int a, b;
        System.out.println("Introduce el valor 1: ");
        a = teclado.nextInt();
        System.out.println("Introduce el valor 2: ");
        b = teclado.nextInt();
        if (a > 10 && b <= 10 || b > 10 && a <= 10) {
            System.out.println("uno y solo uno es mayor que 10.");
        } else {
            System.out.println("ninguno o los 2 son menores o iguales que 10.");
        }
    }
    
    public static void h() {
        int a, b;
        System.out.println("Introduce el valor 1: ");
        a = teclado.nextInt();
        System.out.println("Introduce el valor 2: ");
        b = teclado.nextInt();
        if (a > b) {
            System.out.println("el primero es mayor que el segundo.");
        } 
        else if(a == b) {
            System.out.println("los numeros son iguales.");
        }else{
            System.out.println("el segundo es mayor que el primero.");
        }
    }
    
    public static void i() {
        int a, b;
        System.out.println("Introduce el valor 1: ");
        a = teclado.nextInt();
        System.out.println("Introduce el valor 2: ");
        b = teclado.nextInt();
        if (b != 0 && a % b == 0) {
            System.out.println(a + " es divisible por " + b);
        } else {
            System.out.println(a + " no es divisible por " + b);
        }
    }
    
    public static void j() {
        int a, b;
        System.out.println("Introduce el valor 1: ");
        a = teclado.nextInt();
        System.out.println("Introduce el valor 2: ");
        b = teclado.nextInt();
        if(a > b){
            if (b != 0 && a % b == 0) {
                System.out.println(a + " es divisible por " + b);
            } else {
                System.out.println(a + " no es divisible por " + b);
            }
        }
        else{
            if (a != 0 && b % a == 0) {
                System.out.println(a + " es divisible por " + b);
            } else {
                System.out.println(a + " no es divisible por " + b);
            }
        }
    }
    
    public static void k() {
        int a;
        System.out.println("Introduce el valor: ");
        a = teclado.nextInt();
        if (a % 2 != 0) {
            if(a % 3 == 0){
                System.out.println(a + " es multiplo de 2, 3 y/o 10.");
            }
            else {
                System.out.println(a + " no es multiplo ni de 2, ni de 3 ni de 10.");
            }
        } else {
            System.out.println(a + " es multiplo de 2, 3 y/o 10.");
        }
    }
    
    public static void l() {
        int a, b, c;
        System.out.println("Introduce el valor 1: ");
        a = teclado.nextInt();
        System.out.println("Introduce el valor 2: ");
        b = teclado.nextInt();
        System.out.println("Introduce el valor 3: ");
        c = teclado.nextInt();
        if (a > 0 || b > 0 || c > 0){
            System.out.println("Alguno es mayor que 0");
        }else{
            System.out.println(a + "Ninguno es mayor que 0.");
        }
    }
    
    public static void m() {
        int a, b, c;
        System.out.println("Introduce el valor 1: ");
        a = teclado.nextInt();
        System.out.println("Introduce el valor 2: ");
        b = teclado.nextInt();
        System.out.println("Introduce el valor 3: ");
        c = teclado.nextInt();
        if (a <= 0 || b <= 0 || c <= 0) {
            if(a > 0 || b > 0 || c > 0){
            System.out.println("Alguno es mayor que 0, pero no todos");
            }
        } else {
            System.out.println(a + "Ninguno o todos es mayor que 0.");
        }
    }
}
