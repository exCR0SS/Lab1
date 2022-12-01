// Напишите программу, в которой по возрасту определяется год рождения.

import java.util.Date;
import java.util.Scanner;

public class Example12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Date dt = new Date();
        int year = dt.getYear();
        int currentYear = year + 1900;

        System.out.println("Введите возраст: ");
        int age = in.nextInt();

        int result = currentYear - age;

        System.out.println("Год рождения: " + result);
        in.close();
    }
}
