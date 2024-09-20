package VLGt03;

public class VLGt03e17 {
    public static void main(String[] args) {
        int contador = 1;
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        do{
            System.out.println("Introduce la nota del modulo "+ contador + ": ");
            double nota = teclado.nextDouble();
            if(nota < 5){
                System.out.println("No te puedes presentar al FCT.");
                break;
            }
        }while (contador++ < 9);
        System.out.println("Enhorabuena, te puedes presentar al FCT.");
    }
}
