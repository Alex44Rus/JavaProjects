package OOPSeminar5.task1;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        this.scanner = new Scanner(System.in);
    }

    public double getInputNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    public char getInputOperator() {
        System.out.print("Enter an operator (+, -, *, /): ");
        String sc = scanner.next();
        Integer c = sc.length();    // Игнорирование всех операторов, кроме последнего введенного
        return sc.charAt(c - 1);
        }



    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}
