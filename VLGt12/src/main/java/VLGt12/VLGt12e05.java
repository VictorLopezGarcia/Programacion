package VLGt12;

import java.time.LocalDate;
import java.util.Scanner;

public class VLGt12e05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, ano;

        try{
            System.out.println("Introduce un día: ");
            dia = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce un mes: ");
            mes = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce un año: ");
            ano = Integer.parseInt(teclado.nextLine());
        }catch (NumberFormatException e){
            System.out.println("No has introducido un número");
            return;
        }

        if (validarFecha(dia, mes, ano)){
            System.out.println("La fecha es correcta");
        }else {
            System.out.println("La fecha no es correcta");
        }
    }

    public static boolean validarFecha(int dia, int mes, int ano) {
        try{
            LocalDate fecha = LocalDate.of(ano, mes, dia);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
