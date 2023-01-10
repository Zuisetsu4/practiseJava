package practiseJava;

import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        getArrayRandom();
    }

    public static void getArrayRandom(){
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(100);
            System.out.print((i > 0 ?  "," : "") + arr[i]);
        }
        System.out.println();
    }
}
