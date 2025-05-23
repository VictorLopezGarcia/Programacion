package VLGt14;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class VLGt14e19 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();


        LocalDateTime dt = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            hashSet.add(new Random().nextInt(1000000));
        }
        LocalDateTime dt2 = LocalDateTime.now();

        System.out.println("Milisegundos hashet: "+ChronoUnit.MILLIS.between(dt, dt2));

        dt = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            treeSet.add(new Random().nextInt(1000000));
        }
        dt2 = LocalDateTime.now();
        System.out.println("Milisegundos treeSet: "+ChronoUnit.MILLIS.between(dt, dt2));
        //El treeset tarda mas siempre porque ademas de añadir los datos, los ordena
    }
}
