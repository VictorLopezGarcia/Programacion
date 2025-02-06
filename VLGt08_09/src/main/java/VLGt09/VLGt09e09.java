package VLGt09;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class VLGt09e09 {
    private static Scanner teclado = new Scanner(System.in);
    private static Paciente paciente;
    private static Clinica clinica = new Clinica();

    public static void main(String[] args) {

        int opcion;

        System.out.println("Bienvenido a la Clinica");
        do {
            System.out.println("1. Ingresar Paciente");
            System.out.println("2. Llamar a consulta");
            System.out.println("3. Consultar total facturado");
            System.out.println("4. Salir");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion){
                case 1:
                    ingresarPaciente();
                    break;
                case 2:
                    clinica.llamarConsulta();
                    break;
                case 3:
                    System.out.println("Total facturado: " + clinica.getTotalFacturado());
                    break;
                case 4:
                    System.out.println("Gracias por usar la Clinica");
                    break;
            }
        }while (opcion != 4);
    }


    public static void ingresarPaciente(){
        int opcionPaciente;
        do{
            System.out.println("Ingrese el tipo de paciente: ");
            System.out.println("1. Consulta");
            System.out.println("2. Receta");
            System.out.println("3. Revision");
            opcionPaciente = Integer.parseInt(teclado.nextLine());

            switch (opcionPaciente){
                case 1:
                    System.out.println("Ingrese el nombre del paciente: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese la fecha de nacimiento del paciente: ");
                    String fecha = teclado.nextLine();
                    Date fechaNacimiento = new Date(fecha);
                    System.out.println("Ingrese el motivo de la consulta: ");
                    String motivoConsulta = teclado.nextLine();
                    paciente = new Consulta(nombre, fechaNacimiento, motivoConsulta);
                    clinica.addPaciente(paciente);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del paciente: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese la fecha de nacimiento del paciente: ");
                    fecha = teclado.nextLine();
                    fechaNacimiento = new Date(fecha);
                    System.out.println("Ingrese el numero de medicamentos: ");
                    int numMedicamentos = Integer.parseInt(teclado.nextLine());
                    ArrayList<String> medicamentos = new ArrayList<String>();
                    for (int i = 0; i < numMedicamentos; i++){
                        System.out.println("Ingrese el medicamento: ");
                        String medicamento = teclado.nextLine();
                        medicamentos.add(medicamento);
                    }
                    paciente = new Recetas(nombre, fechaNacimiento, medicamentos);
                    clinica.addPaciente(paciente);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del paciente: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese la fecha de nacimiento del paciente: ");
                    fecha = teclado.nextLine();
                    fechaNacimiento = new Date(fecha);
                    System.out.println("Ingrese la fecha de la ultima revision: ");
                    String fechaRevision = teclado.nextLine();
                    Date ultimaRevision = new Date(fechaRevision);
                    paciente = new Revision(nombre, fechaNacimiento, ultimaRevision);
                    clinica.addPaciente(paciente);
                    break;
            }
        }while (opcionPaciente < 1 || opcionPaciente > 3);
    }
}
