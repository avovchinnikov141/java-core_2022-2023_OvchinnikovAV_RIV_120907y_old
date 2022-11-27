package Lab1;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите Ваш возраст(в годах): ");
        int date = in.nextInt();
        System.out.printf("Привет, %s. Вам %d лет. Вы родились в %d г.", name, date, (date-2022)*-1);
        in.close();
    }
}