package VLGt09;

import java.util.Scanner;

public class VLGt09e10 {

    static Scanner teclado = new Scanner(System.in);
    static Parking parking = new Parking();

    public static void main(String[] args) {
        int opcion;

        System.out.println("Bienvenido al Parking");
        do {
            System.out.println("1. Ingresar Vehiculo");
            System.out.println("2. Sacar Vehiculo");
            System.out.println("3. Consultar Vehiculos");
            System.out.println("4. Salir");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion){
                case 1:
                    ingresarPaciente();
                    break;
                case 2:
                    System.out.println("Ingrese la matricula del vehiculo a sacar: ");
                    String matricula = teclado.nextLine();
                    parking.sacarVehiculo(matricula);
                    break;
                case 3:
                    System.out.println("Vehiculos en el parking: ");
                    parking.mostrarVehiculos();
                    break;
                case 4:
                    System.out.println("Gracias por usar el Parking");
                    break;
            }
        }while (opcion != 4);
    }


    public static void ingresarPaciente(){
        int opcionVehiculo;
        String matricula;
        do{
            System.out.println("Ingrese el tipo de vehiculo: ");
            System.out.println("1. Vehiculo");
            System.out.println("2. Furgoneta");
            System.out.println("3. Autobus");
            opcionVehiculo = Integer.parseInt(teclado.nextLine());

            switch (opcionVehiculo){
                case 1:
                    System.out.println("Ingrese la matricula: ");
                    matricula = teclado.nextLine();
                    Vehiculo vehiculo = new Vehiculo(matricula);
                    parking.addVehiculo(vehiculo);
                    break;
                case 2:
                    System.out.println("Ingrese la matricula: ");
                    matricula = teclado.nextLine();
                    System.out.println("Ingrese los metros de la furgoneta: ");
                    int metros = Integer.parseInt(teclado.nextLine());
                    Furgoneta furgoneta = new Furgoneta(matricula, metros);
                    parking.addVehiculo(furgoneta);
                    break;
                case 3:
                    System.out.println("Ingrese la matricula: ");
                    matricula = teclado.nextLine();
                    System.out.println("Ingrese las plazas del autobus: ");
                    int plazas = Integer.parseInt(teclado.nextLine());
                    Autobus autobus = new Autobus(matricula, plazas);
                    parking.addVehiculo(autobus);
                    break;
            }
        }while (opcionVehiculo < 1 || opcionVehiculo > 3);
    }
}
