package OOPSeminar4.HomeWork.task3;

public class task3 {
    public static void main(String[] args) {
        System.out.println(getMax(-156, 155));
        System.out.println(getMax(0.5, 0.25));
        System.out.println(getMax("Opel", "Chevrolet"));
    }

    public static <T extends Comparable<T>> T getMax(T t1, T t2) {
        return t1.compareTo(t2) >= 0 ? t1 : t2;
    }
}
