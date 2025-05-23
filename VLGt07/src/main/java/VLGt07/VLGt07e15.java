package VLGt07;

import java.util.ArrayList;
import java.util.Scanner;

public class VLGt07e15 {
    public static ArrayList<Double> alturaAlumnos = new ArrayList<>();
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        char entrada;

        do{
            System.out.println("--------------------");
            System.out.println("Selecciona una opción: ");
            System.out.println("a) Añadir altura. ");
            System.out.println("b) Mostrar lista actual con el número de posición.");
            System.out.println("c) Eliminar por posición.");
            System.out.println("d) Eliminar por valor. ");
            System.out.println("e) Ordenar la lista.");
            System.out.println("f) Vaciar la lista.");
            System.out.println("g) salir.");
            System.out.println("--------------------");

            entrada = teclado.nextLine().charAt(0);

            switch (entrada){
                case 'a' -> anadirAltura();
                case 'b' -> mostrar();
                case 'c' -> eliminarPos();
                case 'd' -> eliminarVal();
                case 'e' -> ordenar();
                case 'f' -> vaciar();
                case 'g' -> System.out.println("Adios");
            }
            System.out.println();
        }while (entrada != 'g');
    }

    public static void anadirAltura(){
        System.out.println("Introduce la altura: ");
        double altura = Double.parseDouble(teclado.nextLine());
        alturaAlumnos.add(altura);
    }

    public static void mostrar(){
        for (int i = 0; i < alturaAlumnos.size(); i++) {
            System.out.println("Posicion: " + i + " Altura: " + alturaAlumnos.get(i));
        }
    }

    public static void eliminarPos(){
        System.out.println("Introduce la posición a eliminar: ");
        int pos = Integer.parseInt(teclado.nextLine());
        alturaAlumnos.remove(pos);
    }

    public static void eliminarVal(){
        System.out.println("Introduce la altura a eliminar: ");
        double val = Double.parseDouble(teclado.nextLine());
        alturaAlumnos.remove(val);
    }

    public static void ordenar(){
        alturaAlumnos.sort(null);
    }

    public static void vaciar(){
        alturaAlumnos.clear();
    }

}
