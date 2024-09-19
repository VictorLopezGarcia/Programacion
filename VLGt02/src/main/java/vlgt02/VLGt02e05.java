package src.main.java.vlgt02;

import java.util.Scanner;

/**
 *
 * @author victor.lopezgarcia
 */
public class VLGt02e05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h, m, s;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las horas: ");
        h = teclado.nextInt();
        System.out.println("Introduce los minutos: ");
        m = teclado.nextInt();
        System.out.println("Introduce los segundos: ");
        s = teclado.nextInt();    
    
        if(h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60){
            System.out.println("Es una hora correcta");
        }else{
            System.out.println("Es una hora incorrecta");
        }
        
        System.out.println("Suma un total de " + (h*3600 + m*60 + s) +" segundos");

    }
    
}
