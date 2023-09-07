package Algorithmes.HomeWork.hw1;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Program {
    public static void main(String[] args) {
        int[] array = new int[]{
                950, 650, 4560, 25, 1, 1, 333
        };

        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println();
        System.out.println(Arrays.toString(array));


    }
}
