package VLGt06;

public class Examen {
    private final char[] solucion;
    private int correctas;
    private int incorrectas;

    public Examen(char[] solucion){
        this.solucion = solucion;
    }

    public double corregir(char[] alumno){
        for (int i = 0; i < 20; i++) {
            if (alumno[i] == solucion[i]) {
                correctas++;
            } else if (alumno[i] != 'z') {
                incorrectas++;
            }
        }
        if(correctas*0.5 - (incorrectas * 0.2)>0){
             return correctas*0.5 - (incorrectas * 0.2);
        }else return 0;
    }

    public void mostrar(){
        for (int i = 0; i < 20; i++) {
            System.out.println("Pregunta " + (i+1) + ": " + solucion[i]);
        }
    }
}
