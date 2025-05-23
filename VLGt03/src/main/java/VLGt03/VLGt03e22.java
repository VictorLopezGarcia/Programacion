package VLGt03;

public class VLGt03e22 {
    public static void main(String[] args) {
        int sueldo, horasExtra, ventas, ventasT=0, ventaMax=Integer.MIN_VALUE, sueldoF=0, cont=1;
        String respuesta;
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        do{
            System.out.println("Introduce el sueldo base del empleado "+cont+": ");
            sueldo = teclado.nextInt();
            System.out.println("Introduce el nº de horas extra del empleado "+cont+": ");
            horasExtra = teclado.nextInt();
            System.out.println("Introduce el nº de ventas del empleado "+cont+": ");
            ventas = teclado.nextInt();
            System.out.println("¿Quieres introducir los datos de otro empleado? (s/n): ");
            respuesta = teclado.next();

            ventasT += ventas;

            if(ventas > ventaMax) {
                ventaMax = ventas;
                sueldoF = sueldo + horasExtra*100;
                if (ventas >= 10 && ventas <= 20) {
                    sueldoF += 500;
                } else if (ventas >= 21 && ventas <= 30) {
                    sueldoF += 1000;
                } else if (ventas > 30) {
                    sueldoF += 1300;
                }
            }

            cont++;

        }while (respuesta.equals("s"));

        System.out.println("El total de ventas de la empresa es de "+ventasT);
        System.out.println("El empleado con más ventas ha ganado "+sueldoF);

    }
}
