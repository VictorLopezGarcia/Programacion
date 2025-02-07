package VLGt10;

import static java.lang.Math.random;

public class TriAtleta_v2b implements Nadador_v2, Ciclista_v2, Saltador_v2 {
    private String nombre;
    private int edad;
    private String sexo;

    public TriAtleta_v2b(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public TriAtleta_v2b(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public TriAtleta_v2b(int edad) {
        this.edad = edad;
    }

    public TriAtleta_v2b() {
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

    @Override
    public boolean saltaPertiga(double altura) {
        if(altura < 500){
            return true;
        }else if(altura > 500 && altura < 600){
            return random() < 0.5;
        }else return false;
    }
}
