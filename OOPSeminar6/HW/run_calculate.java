package OOPSeminar6.HW;
/*
Единственная ответственность: Класс Calculate разделен по функциональной ответственности, каждая часть отвечает строго за свою функцию:
Обработка списка операций;
Проверка правильности ввода;
Выполнение арифметической задачи.
Открытость/закрытость: добавление/измение списка доступных операций достигается Созданием новой версией класса имплементирующего интерфейс I_Operation и передачей в конструктор CalculateOperation (9 строчка файла Controller) при этом никакие другие модификации кода не нужны и не допустимы.
Принцип подстановки Барбары Лисков: Ввиду малого размера решаемой задачи, классы не наследуют лишнего функционала естественным образом.
Классы имплементируют интерфейсы только с нужным функционалом: I_CatlogOperation, I_Operation.
Реализации классов никак не влияют на более высокие уровни абстракции.
 */
class run_calculate {

    public static void main(String[] args) {
        Controller app = new Controller();
        app.AppStart();
    }
}
