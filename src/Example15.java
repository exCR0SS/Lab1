import java.util.Scanner;

public class Example15 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int userFirstNumber = in.nextInt();

        System.out.println("Введите второе число: ");
        int userSecondNumber = in.nextInt();

        int resultSum = userFirstNumber + userSecondNumber;
        int resultDif = userFirstNumber - userSecondNumber;

        System.out.println("Сумма: " + resultSum + ", разность: " + resultDif);
    }
}