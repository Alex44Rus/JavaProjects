import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class HomeWork21 {
    public static void main(String[] args) {
        // Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
        // результат после каждой итерации запишите в лог-файл.
        int[] numArray = new int[] { 5, 4, 3, 2, 1 };
        PrintWriter writer;
        String startArray = Arrays.toString(numArray);
        try {
            writer = new PrintWriter("hw21.txt", "UTF-8");
            writer.write(startArray);
            writer.write("\n");
            for (int i = 0; i < numArray.length - 1; i++) {

                for (int j = 0; j < numArray.length - i - 1; j++) {

                    if (numArray[j + 1] < numArray[j]) {
                        int swap = numArray[j];
                        numArray[j] = numArray[j + 1];
                        numArray[j + 1] = swap;
                    }
                }
                String nArray = Arrays.toString(numArray);
                writer.write(nArray);
                writer.write("\n");

            }
            // writer.write(numArray.toString());
            writer.flush();
            writer.close();

        } catch (IOException e) {
            System.err.println("Problem");

        }
    }
}
