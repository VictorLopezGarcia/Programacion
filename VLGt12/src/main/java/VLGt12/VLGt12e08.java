package VLGt12;

import java.util.Scanner;

public class VLGt12e08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu correo: ");
        String correo = teclado.nextLine();
        try {
            validarCorreo(correo);
        } catch (ExcepcionCorreo e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validarCorreo(String correo) throws ExcepcionCorreo{
        if (correo.length()<5 | !(correo.contains("@") | (correo.contains("@") && !correo.substring(correo.indexOf('@')).contains(".")))) throw new ExcepcionCorreo();
    }

    public static class ExcepcionCorreo extends Exception{
        @Override
        public String getMessage(){
            return "Formato email inválido";
        }
    }

}


