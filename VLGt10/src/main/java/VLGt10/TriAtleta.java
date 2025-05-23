package VLGt10;

public class TriAtleta implements Nadador , Ciclista, Saltador{
    private String nombre;
    private int edad;
    private String sexo;

    public TriAtleta(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public TriAtleta(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public TriAtleta(int edad) {
        this.edad = edad;
    }

    public TriAtleta() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int nadar(int metros) {
        int kmHora;
        if(this.edad < 18){
            kmHora = 10;
        }else{
            kmHora = 13;
        }
        return metros / kmHora * 60 * 1000;
    }

    @Override
    public int recorrer(int km, String terreno) {
        int velocidad;
        if(terreno.equals("plano")){
            velocidad = 30;
        }else{
            velocidad = 20;
        }
        return km / velocidad * 60 * 1000;
    }

    @Override
    public int saltarAltura() {
        int altura;
        if(this.edad > 18){
            altura = 2;
        }else{
            altura = 1;
        }
        return altura;
    }
}
