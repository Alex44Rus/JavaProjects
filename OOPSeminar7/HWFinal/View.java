package OOPSeminar7.task2.HWFinal;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    public double inputValue(String title){
        System.out.printf("%s", title);
        return in.nextDouble();
    }
    public char inputOperationSign(String title){
        System.out.printf("%s", title);
        return in.next(".").charAt(0);
    }
}