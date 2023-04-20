import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число n = ");
        Integer n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j < i + 1; j++)
                if (i % j == 0)
                    count++;
                    if (count == 2)
                    System.out.print(i + " ");
            input.close();

        }
    }
}
