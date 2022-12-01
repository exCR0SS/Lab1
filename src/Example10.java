import java.util.Scanner;
import java.util.Date;

public class Example10 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Определение текущего года, лучше реализации не нашёл.
        Date dt = new Date();
        int year = dt.getYear();
        int currentYear = year + 1900;

        int result;

        System.out.println("Введите год рождения: ");
        int birthYear = in.nextInt();
        result = currentYear - birthYear;

        System.out.println("Возраст: " + result);

    }
}
