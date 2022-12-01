// Напишите программу, в которой Пользователь вводит имя и год рождения, в программа отображает сообщение содержащее имя пользователя и его возраст.

import java.util.Date;
import java.util.Scanner;

public class Example11 {    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Date dt = new Date();
    int year = dt.getYear();
    int currentYear = year + 1900;

    System.out.println("Введите имя: ");
    String name = in.nextLine();

    System.out.println("Введите дату рождения: ");
    int birthYear = in.nextInt();
    int result = currentYear - birthYear;

    System.out.println("Имя: " + name + ", возраст: " + result);
    in.close();
}

}
