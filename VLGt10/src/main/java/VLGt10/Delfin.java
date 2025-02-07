package VLGt10;

public class Delfin implements Nadador{

    private String nombre;
    private int edad;
    private String sexo;

    public Delfin() {
    }

    public Delfin(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int nadar(int metros) {
        int kmHora = (int) (Math.random() * 30)+40;
        return metros / kmHora * 60 * 1000;
    }
}
