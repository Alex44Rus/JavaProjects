package OOPSeminar4.HomeWork.task2;

public class task2 {

    public static <T> void printArray(T[] items){
        for (T item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       Integer[] iarr = {2, 3, 5, 7, 9};
       String[] sarr = {"two", "three", "five", "seven", "nine"};

       printArray(iarr);
        printArray(sarr);



    }
}
