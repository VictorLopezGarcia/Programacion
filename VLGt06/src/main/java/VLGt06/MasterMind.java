package VLGt06;

public class MasterMind {
    private final int maxIntentos = 10;
    private final int maxDigit = 4;
    private final int[] combinacion;
    private int[] intento;
    private int numIntentos;
    private int numColocados;
    private int numDescolocados;

    public MasterMind() {
        combinacion = new int[maxDigit];
        intento = new int[maxDigit];
        numIntentos = 0;
        numColocados = 0;
        numDescolocados = 0;
        generarCombinacion();
    }

    private void generarCombinacion() {
        for (int i = 0; i < maxDigit; i++) {
            combinacion[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (combinacion[i] == combinacion[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    public void jugar(int[] intento) {
        if (numIntentos >= maxIntentos) {
            System.out.println("Has superado el número máximo de intentos");
            return;
        }
        numIntentos++;
        this.intento = intento;
        numColocados = 0;
        numDescolocados = 0;
        for (int i = 0; i < maxDigit; i++) {
            if (intento[i] == combinacion[i]) {
                numColocados++;
            } else {
                for (int j = 0; j < maxDigit; j++) {
                    if (intento[i] == combinacion[j]) {
                        numDescolocados++;
                    }
                }
            }
        }
    }

    public boolean haGanado() {
        return numColocados == maxDigit;
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public int getNumColocados() {
        return numColocados;
    }

    public int getNumDescolocados() {
        return numDescolocados;
    }

    public int[] getCombinacion() {
        return combinacion;
    }

    public int[] getIntento() {
        return intento;
    }

    public int getMaxIntentos() {
        return maxIntentos;
    }
}
