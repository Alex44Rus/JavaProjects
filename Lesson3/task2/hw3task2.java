package Lesson3.task2;

import java.util.ArrayList;
import java.util.Random;

public class hw3task2 {
    public static void main(String[] args) {
        // Пусть дан произвольный список целых чисел, удалить из него чётные числа

        final int n = 10; //кол-во элементов в первоначальном списке
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(rnd.nextInt(0, 35));
        }
        System.out.println(arr);
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}