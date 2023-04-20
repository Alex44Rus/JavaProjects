import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        PrintWriter writer;
        try {
        writer = new PrintWriter("task3.txt", "UTF-8");    
        double res = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число:  ");
        Integer n1 = input.nextInt();
        writer.write(Integer.toString(n1));
        writer.write("\n");
        System.out.print("Введите знак операции: ");
        String sign = input.next();
        writer.write(sign);
        writer.write("\n");
        System.out.print("Введите второе число:  ");
        Integer n2 = input.nextInt();
        writer.write(Integer.toString(n2));
        writer.write("\n");
        writer.write("=");
        if (sign.equals("+")) res =  (n1 + n2);
        if (sign.equals("*")) res =  (n1 * n2);
        if (sign.equals("-")) res =  (n1 - n2);
        if (sign.equals("/")) res = ((double) n1 /(double) n2);
        writer.write(Double.toString(res));
        System.out.println(res);
        writer.write("\n");
        writer.flush();
        writer.close();
        input.close();
        }
        catch (IOException e) {
            System.err.println("Problem");
            }
    
    }
}
