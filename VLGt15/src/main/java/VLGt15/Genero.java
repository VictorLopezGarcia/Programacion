package VLGt15;

public enum Genero {
    MASCULINO, FEMININO;

    @Override
    public String toString() {
        if (this == MASCULINO)
            return "Masculino";
        else return "Femenino";
    }

    public static Genero fromString(String genero) {
        return switch (genero.toUpperCase()) {
            case "MASCULINO" -> MASCULINO;
            case "FEMENINO" -> FEMININO;
            default -> throw new IllegalArgumentException("Genero no válido: " + genero);
        };

    }
}
