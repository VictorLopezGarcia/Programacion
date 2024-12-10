import java.util.Scanner;

public class VLGe01 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String informe;
        System.out.println("Introduce el informe: ");
        informe = teclado.nextLine();

        if (esSeguro(informe)) {
            System.out.println("El informe es seguro");
        }else{
            System.out.println("El informe no es seguro");
        }
    }


    private static boolean esSeguro(String informe){
        boolean ascendente = false, descendente = false;

        for (int i = 1; i < informe.length(); i++) {
            int primero = (Character.getNumericValue(informe.charAt(i-1)));
            int segundo = (Character.getNumericValue(informe.charAt(i)));
            if(Math.abs(primero - segundo) < 1 || Math.abs(primero - segundo) > 3){
                return false;
            }
            else if (primero > segundo) {
                descendente = true;
                if(ascendente) {
                    return false;
                }
            }
            else {
                ascendente = true;
                if(descendente) {
                    return false;
                }
            }
        }
        return true;
    }
}
