package Toys_Lotto;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        /*
         * Создаем игрушки для розыгрыша, для справедливого розыгрыша принимаем
         * количество
         * игрушем по 1 шт, т.е. в одном розыгрыше 2 одинаковых приза выпасть не может
         */

        Toy toy1 = new Toy(0, "Игрушка1", 25);
        Toy toy2 = new Toy(1, "Игрушка2", 33);
        Toy toy3 = new Toy(2, "Игрушка3", 50);
        Toy toy4 = new Toy(3, "Iphone14ProMax", 10);
        Toy toy5 = new Toy(3, "MB GLE 5.5 AMG", 1);

        /*
         * Создаем массив игрушек и добавляем игрушки в массив, для наглядности
         * случайного выбора приза
         * игрушки добавляем в определенной последовательности
         */

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        /*
         * Запускаем розыгры, для демонстрации удаления игрушки из списка разыгрываемых
         * запускается несколько раз.
         */

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        

    }
}
