// Напишите программу, в которой Пользователь последовательно вводит название текущего дня недели, название месяца и дату (номер дня в месяце). Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц)

import java.util.Scanner;

    public class Example8 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Введите день недели: ");
            String WeekDay = in.nextLine();

            System.out.println("Введите дату: ");
            String Date = in.nextLine();

            System.out.println("Введите месяц: ");
            String Month = in.nextLine();

            System.out.println("День недели: " + WeekDay + " Дата: " + Date + " Месяц: " + Month);
            in.close();
        }
}
