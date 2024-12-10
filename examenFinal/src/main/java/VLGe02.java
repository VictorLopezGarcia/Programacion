public class VLGe02 {

    public static void main(String[] args) {
        String cadena1 = "531";
        String cadena2 = "894";
        int distanciaT = 0;
        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);
        System.out.println("-------------------------------");

        do{
            char menor1 = menor(cadena1);
            char menor2 = menor(cadena2);
            int distancia = Math.abs((Character.getNumericValue(menor1))- Character.getNumericValue(menor2));

            System.out.println("Menor en cadena 1: "+ menor1);
            System.out.println("Menor en cadena 2: "+ menor2);
            System.out.println("Distancia: " + distancia);
            System.out.println("-------------------------------");

            distanciaT += distancia;
            cadena1 = eliminarCaracter(cadena1, menor1);
            cadena2 = eliminarCaracter(cadena2, menor2);

        }while(!cadena1.isEmpty() && !cadena2.isEmpty());

        System.out.println("Diustancia total: "+ distanciaT);
    }


    private static char menor(String cadena) {
        char menor = cadena.charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) < menor) {
                menor = cadena.charAt(i);
            }
        }
        return menor;
    }

    private static String eliminarCaracter(String cadena, char caracter) {
        int indice = cadena.indexOf(caracter);
        if (indice == -1) {
            return cadena;
        }
        return cadena.substring(0, indice) + cadena.substring(indice + 1);
    }

}
