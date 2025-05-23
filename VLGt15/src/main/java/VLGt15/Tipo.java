package VLGt15;

public enum Tipo {
    ROBLE, SAPELLY, NOGAL, CEREZO,BAMBU;

    @Override
    public String toString() {
        return switch (this) {
            case ROBLE -> "Roble";
            case SAPELLY -> "Sapelí";
            case NOGAL -> "Nogal";
            case CEREZO -> "Cerezo";
            case BAMBU -> "Bambú";
        };
    }

    public static Tipo fromString(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "ROBLE" -> ROBLE;
            case "SAPELLY" -> SAPELLY;
            case "NOGAL" -> NOGAL;
            case "CEREZO" -> CEREZO;
            case "BAMBU" -> BAMBU;
            default -> throw new IllegalArgumentException("Tipo no válido: " + tipo);
        };
    }

    public int getPrecio(){
        return switch (this) {
            case ROBLE -> 40;
            case SAPELLY -> 50;
            case NOGAL -> 60;
            case CEREZO -> 70;
            case BAMBU -> 100;
        };
    }
}
