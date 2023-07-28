package Toys_Lotto;

import java.util.List;

public class RandomToy {

    public Toy chooseOnWeight(List<Toy> toys) {
        double completeWeight = 0.0;
        for (Toy toy : toys)
            completeWeight += toy.getWeight();
        double r = Math.random() * completeWeight; //Рандомно меняем вес игрушки
        double countWeight = 0.0;
        for (Toy toy : toys) {
            countWeight += toy.getWeight();
            if (countWeight >= r)
                return toy; //Возвращаем игрушку с наибольшим весом
        }
        throw new RuntimeException("Ops..игрушки закончились.");
    }

}
