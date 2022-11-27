package Lab1;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите год рождения: ");
        int date = 2022-in.nextInt();
        System.out.printf("Привет, %s. Вам %d лет.", name, date);
        in.close();
    }
}