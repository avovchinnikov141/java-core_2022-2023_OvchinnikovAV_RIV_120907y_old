package Lab1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name =  in.nextLine();
        System.out.println("Введите возраст: ");
        Integer age  = in.nextInt();;
        System.out.printf("Привет, Вас зовут %s и Вам %d лет\n", name, age);
        in.close();

    }
}