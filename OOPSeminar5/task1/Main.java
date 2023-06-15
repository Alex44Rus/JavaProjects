package OOPSeminar5.task1;

public class Main {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorPresenter presenter = new CalculatorPresenter(view, model);

        presenter.performCalculation();
    }
}