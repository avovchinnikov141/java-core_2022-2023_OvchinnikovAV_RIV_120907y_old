package Lab1;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int one = in.nextInt();
        System.out.println("Введите второе число: ");
        int two = in.nextInt();
        System.out.printf("\nСумма двух чисел = %d\nРазность двух числел = %d", one+two,one-two);
        in.close();
    }
}