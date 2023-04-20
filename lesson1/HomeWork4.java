import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        // Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
        // могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
        // Требуется восстановить выражение до верного равенства.
        // Предложить хотя бы одно решение или сообщить, что его нет.
        // Под знаками вопросов - одна и та же цифра Ввод: 2? + ?5 = 69
        // Вывод: 24 + 45 = 69
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите уравнение вида q + w = e, ? - цифра для поиска");
        String str = input.nextLine();
        for (int i = 0; i < 10; i++) {
            String newstr = str.replace("?", "" + i).replace("?", "" + i);
            String numbers[] = newstr.split(" ");
            int e = Integer.parseInt(numbers[4].trim());
            int q = Integer.parseInt(numbers[0].trim());
            int w = Integer.parseInt(numbers[2].trim());
            if (e == q + w) {
                count++;
                System.out.println(newstr);
            }

        }
        if (count == 0) {
            System.out.println("Решений нет");
        }

        input.close();

    }
}        