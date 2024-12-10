
public class Password {
    private int longitud;
    private String contrasena;

    Password(){

    }

    Password(int longitud){

        this.longitud = longitud;
        generarPassword();
    }

    Password(String contrasena){
        this.contrasena = contrasena;
    }

    public int getLongitud(){
        return longitud;
    }

    public String getContrasena(){
        return contrasena;
    }

    @Override
    public String toString() {
        return contrasena;
    }

    public boolean esFuerte(){
        int mayus=0, minus=0, num=0;
        for (int i = 0; i < contrasena.length(); i++) {
            if(Character.isDigit(contrasena.charAt(i)))num++;
            if(Character.isLowerCase(contrasena.charAt(i)))minus++;
            if(Character.isUpperCase(contrasena.charAt(i)))mayus++;
        }
        return minus > 2 && mayus > 2 && num > 3;
    }

    public void generarPassword() {
        contrasena = "";
        for (int i = 0; i < longitud; i++) {
            int numeroAleatorio = (int) (Math.random() * 26);
            if (i < 3) {
                contrasena = contrasena + (char) ('A' + numeroAleatorio);
            } else if (i < 6) {
                contrasena = contrasena + (char) ('a' + numeroAleatorio);
            } else if (i < 10) {
                contrasena = contrasena + (char) ('0' + (int) (Math.random() * 10));
            } else if (Math.random() < 0.5) {
                contrasena = contrasena + (char) ('A' + numeroAleatorio);
            } else {
                contrasena = contrasena + (char) ('A' + numeroAleatorio);
            }
        }
    }
}
