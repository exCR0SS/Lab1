import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String MonthName = in.nextLine();

        System.out.println("Введите количество дней: ");
        String Days = in.nextLine();

        System.out.println("Месяц: " + MonthName + ", количество дней: " + Days);
        in.close();
    }
}
