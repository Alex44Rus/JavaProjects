package OOPSeminar5.task1;

public class CalculatorModel {
    private double result;

    public void add(double number) {
        result += number;
    }

    public void subtract(double number) {
        result -= number;
    }

    public void multiply(double number) {
        result *= number;
    }

    public void divide(double number) {
        CalculatorView tempNumber = new CalculatorView();
        while (number == 0) {
            System.out.println("Cannot divide by zero enter another number ");
            number = tempNumber.getInputNumber();
        }
            result /= number;

    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}