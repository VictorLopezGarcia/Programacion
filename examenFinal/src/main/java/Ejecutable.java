import java.util.Objects;
import java.util.Scanner;

public class Ejecutable {

    static Scanner teclado = new Scanner(System.in);
    private static Usuario usuario;
    private static Password password;

    public static void main(String[] args) {
        boolean salir = false;
        int opcion;
        do {
            opcion=pintarMenu ();
            switch (opcion) {
                case 1: crearUsuario(); break;
                case 2: eliminarUsuario(); break;
                case 3: mostrarUsuario(); break;
                case 0: salir=true; break;
                default: System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu (){
        System.out.println("\n");
        System.out.println("Elija una opción:");
        System.out.println("1 crear usuario");
        System.out.println("2 eliminar usuario");
        System.out.println("3 mostrar usuario");
        System.out.println("0 Salir del programa");
        try {
            return Integer.parseInt (teclado.nextLine());
        } catch (Exception e ) {return 999;}
    }

    private static void crearUsuario () {
        if (usuario!=null && usuario.getUsuarioCreado()) {
            System.out.println("No se pueden ingresar mas de 1 usuario");
        }
        else{
            int num;
            System.out.println("\n");
            System.out.println("Ingrese el nombre: ");
            String nombre = teclado.nextLine();
            do{
                System.out.println("Ingrese 1 para generar contraseña de manera automática o 0 para ingresarla usted:");
                num = Integer.parseInt(teclado.nextLine());
                if (num==1){
                    int longitud;
                    do{
                        System.out.println("Introduce la longitud de la contraseña (minimo 10):");
                        longitud = Integer.parseInt(teclado.nextLine());

                    }while(longitud<10);
                    password = new Password(longitud);
                    System.out.println(password.toString());
                    usuario = new Usuario(nombre, password);
                } else if (num==0){
                    System.out.println("Introduce la contraseña:");
                    String contra = teclado.nextLine();
                    password = new Password(contra);
                    while (!password.esFuerte()){
                        System.out.println("Contraseña debil\nVuelve a introducirla:");
                        contra = teclado.nextLine();
                        password = new Password(contra);
                    }
                    usuario = new Usuario(nombre, password);
                }
            }while (num!=1 && num!=0);
        }
    }

    private static void eliminarUsuario () {
        if (usuario!=null && usuario.getUsuarioCreado()) {
            System.out.println("\n");
            System.out.println("Ingrese el nombre del usuario: ");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese la contraeña del usuario: ");
            String contra = teclado.nextLine();
            if (Objects.equals(usuario.getNombre(), nombre) && Objects.equals(usuario.getPassword().getContrasena(), contra)) {
                usuario.setUsuarioEliminado();
                System.out.println("Usuario eliminado");
            }else{
                System.out.println("No se puede eliminar el usuario");
            }
        }else{
            System.out.println("No se puede eliminar el usuario");
        }

    }

    private static void mostrarUsuario () {
        System.out.println("\n");
        if (usuario != null && usuario.getUsuarioCreado()) {
            System.out.println(usuario.toString());
        } else {
            System.out.println("No se puede mostrar el usuario");
        }
    }

}
