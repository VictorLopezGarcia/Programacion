package VLGt07;

import java.util.Calendar;

public class Parking2 {
    private final int plazasTotales = 20;
    private final int maxPvp = 10;
    private final String[][] plazas = new String[plazasTotales][2];
    private final String vacia = "";
    private int plaza;
    private double recaudacion=0;

    public Parking2(){
        plaza=0;
    }

    public void mostrar(){
        for (int i = 0; i < plaza; i++) {
            System.out.print(plazas[i][0]);
            System.out.println("/"+calcularHora(plazas[i][1]));
        }
    }

    public int aparcar(String matricula){
        if (plaza<plazasTotales){
            plazas[plaza][0] = matricula;
            plazas[plaza][1] = String.valueOf(System.currentTimeMillis());
            plaza++;
            return plaza;
        }
        return 0;
    }

    private String calcularHora(String tiempo){
        long tiempoInicio = Long.parseLong(tiempo);
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(System.currentTimeMillis()-tiempoInicio-3600000);
        return c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND);
    }

    private double calcularImporte(String tiempo){
        long tiempoInicio = Long.parseLong(tiempo);
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(tiempoInicio);
        return (double) (System.currentTimeMillis() - tiempoInicio)/1000/60*0.02;
    }

    public String desaparcar(){
        if (plaza>0){
            plaza--;
            String matricula = plazas[plaza][0];
            double importe = calcularImporte(plazas[plaza][1]);
            recaudacion += importe;
            matricula += "/"+ String.format("%.2f", importe);
            plazas[plaza][0] = vacia;
            plazas[plaza][1] = vacia;
            return matricula;
        }
        return vacia;
    }

    public double getRecaudacion(){
        return recaudacion;
    }
}
