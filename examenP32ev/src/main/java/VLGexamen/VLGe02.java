package VLGexamen;

import java.util.Arrays;

public class VLGe02 {
    public static void main(String[] args) {
        int[] array = {3,3,10,3,8,6,3,8,7,2,8,2};
        int cont = 0, temp;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            for (int j = 0; j < array.length; j++) {
                if(temp==array[j] && temp!=-1){
                    cont++;
                    array[j]=-1;
                }
            }
            if(cont>1) System.out.println("El "+ temp+" se repite: "+ cont +" veces");
            cont = 0;
        }
    }
}