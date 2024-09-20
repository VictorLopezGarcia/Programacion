package VLGt03;

public class VLGt03e24 {
    public static void main(String[] args) {
        int edad, edadT=0, edadMin = Integer.MAX_VALUE, cont=0;
        double edadMed;
        char sexo, sexoMin = ' ';
        boolean mayor = false;
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        for (int i = 1; i <= 30; i++) {
            System.out.println("Introduce los datos del trabajador "+ i+":");
            System.out.println("Introduce el sexo (H/M): ");
            sexo = teclado.next().charAt(0);
            System.out.println("Introduce la edad: ");
            edad = teclado.nextInt();
            if(edad==0){
                break;
            }
            while (edad < 16 || edad > 65) {
                System.out.println("No puede trabajar. Introduce una edad válida: ");
                edad = teclado.nextInt();
            }

            if(edad < edadMin) {
                edadMin = edad;
                sexoMin = sexo;
            }

            if (sexo == 'M') {
                edadT += edad;
                cont++;
            }

            if(edad >= 60) {
                mayor = true;
            }
        }

        edadMed = (double) edadT/cont;

        System.out.println("La edad media de las mujeres es de "+edadMed);
        System.out.println("La edad mínima de los trabajadores es de "+edadMin+" y es de sexo "+ sexoMin);
        if(mayor) {
            System.out.println("Hay trabajadores mayores de 60 años.");
        } else {
            System.out.println("No hay trabajadores mayores de 60 años.");
        }

    }
}
