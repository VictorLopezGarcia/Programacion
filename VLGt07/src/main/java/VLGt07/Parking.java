package VLGt07;


public class Parking {
    private final int plazasTotales = 20;
    private final String[] plazas = new String[plazasTotales];
    private final String vacia = "";
    private int plaza;

    public Parking(){
        plaza=0;
    }

    public void mostrar(){
        for (int i = 0; i < plaza; i++) {
            System.out.println(plazas[i]);
        }
    }

    public int aparcar(String matricula){
        if (plaza<plazasTotales){
            plazas[plaza] = matricula;
            plaza++;
            return plaza;
        }
        return 0;
    }

    public String desaparcar(){
        if (plaza>0){
            plaza--;
            String matricula = plazas[plaza];
            plazas[plaza] = vacia;
            return matricula;
        }
        return vacia;
    }

    public int libre(){
        return plazasTotales-plaza;
    }
}
