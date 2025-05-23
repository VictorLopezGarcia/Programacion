package VLGt07;

public class VLGt07e13 {
    public static void main(String[] args) {
        boolean encontrado = false;
        String[][] agenda = {
                {"Marta", "666111222"},
                {"Miguel", "981981981"},
                {"Ana", "900900900"},
                {"Daniel", "34881000001"},
        };
        for (String[] strings : agenda) {
            if (strings[0].equals(args[0])) {
                encontrado = true;
                System.out.println("El teléfono de " + args[0] + " es: " + strings[1]);
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }
    }
}
