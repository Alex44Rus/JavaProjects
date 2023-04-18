import java.util.Scanner;
public class HomeWork3 {
    public static void main(String[] args) {
        //калькулятор
        double res = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число:  ");
        Integer n1 = input.nextInt();
        //System.out.println();
        System.out.print("Введите знак операции: ");
        String sign = input.next();
        //System.out.println();
        System.out.print("Введите второе число:  ");
        Integer n2 = input.nextInt();
        //System.out.println();
        
        if (sign.equals("+")) res =  (n1 + n2);
        if (sign.equals("*")) res =  (n1 * n2);
        if (sign.equals("-")) res =  (n1 - n2);
        if (sign.equals("/")) res = ((double) n1 /(double) n2);
        
        System.out.println(res);

        

        input.close();
    }
}
