package Lab1;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int one = in.nextInt();
        System.out.printf("%d %d %d %d", one-1,one,one+1,(one*3)*(one*3));
        in.close();
    }
}