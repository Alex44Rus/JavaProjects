package Toys_Lotto;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;

    public ToyStore(List<Toy> toys) {
        this.toys = toys;
    }
// метод розыгрыша игрушки

    public Toy getToyForPrice() {
        RandomToy random = new RandomToy();
        Toy toy = random.chooseOnWeight(toys);
        return toy;
    }

//метод для записи выпавшей игрушки в файл и удаления ее из массива

    public void saveToyForLottery() {
        Toy toy = getToyForPrice();
        String text = toy.toString();
        try (FileWriter writer = new FileWriter("Toys_Lotto/Toys.txt", true)) {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}

