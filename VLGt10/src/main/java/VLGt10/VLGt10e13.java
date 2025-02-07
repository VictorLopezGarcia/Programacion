package VLGt10;

import java.util.ArrayList;
import java.util.Scanner;

public class VLGt10e13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Termostato termostato = new Termostato();
        Ascensor ascensor = new Ascensor();
        Radio radio = new Radio();
        int opcion = 0, dispositivo = 0;

        ArrayList<Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(termostato);
        dispositivos.add(ascensor);
        dispositivos.add(radio);

        do {
            System.out.println("0. Salir");
            System.out.println("1. Subir un dispositivo");
            System.out.println("2. Bajar un dispositivo");
            System.out.println("3. Resetear un dispositivo");
            System.out.println("4. Revisar termostato");
            opcion = Integer.parseInt(teclado.nextLine());

            if (opcion == 4) termostato.revisar();
            else {
                do {
                    System.out.println("0. Termostato");
                    System.out.println("1. Ascensor");
                    System.out.println("2. Radio");
                    dispositivo = Integer.parseInt(teclado.nextLine());
                    switch (opcion) {
                        case 1:
                            if (dispositivos.get(dispositivo).subir()) {
                                System.out.println(dispositivos.get(dispositivo).verEstado());
                            } else {
                                System.out.println("No se puede subir");
                            }
                            break;
                        case 2:
                            if (dispositivos.get(dispositivo).bajar()) {
                                System.out.println(dispositivos.get(dispositivo).verEstado());
                            } else {
                                System.out.println("No se puede bajar");
                            }
                            break;
                        case 3:
                            dispositivos.get(dispositivo).reset();
                            System.out.println(dispositivos.get(dispositivo).verEstado());
                            break;
                    }
                }while (dispositivo < 0 || dispositivo > 3);
            }

        }while (opcion != 0);

    }
}
