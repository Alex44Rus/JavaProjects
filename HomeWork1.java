import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        //Вычислить n-ое треугольного число (сумма чисел от 1 до n),
        //n! (произведение чисел от 1 до n)
        Scanner tScan = new Scanner(System.in);
        System.out.println("Введите число n = ");
        Integer n = tScan.nextInt();
        int resSum = 0;
        int resMult = 1;
        while (n > 0){
            resSum = resSum + n;
            resMult = resMult * n;
            n--;
        }
        System.out.printf("Треугольное число =  %d , Факториал = %d ",  resSum, resMult);
        tScan.close();




    }
}
