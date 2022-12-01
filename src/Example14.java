// Напишите программу, в которой пользователь вводит число, а программой отображается последовательность из четырех чисел: число, на единицу меньше введённого, введенное число и число, на единицу больше введенного.
// Четвертое число должно быть квадратом суммы первых трех чисел.

import java.util.Scanner;

public class Example14 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int userNumber = in.nextInt();

        int resultSum = userNumber + 1;
        int resultDif = userNumber - 1;
        double resultSquare = Math.pow(userNumber + resultDif + resultSum, 2);

        System.out.printf("%d %d %d %.0f", resultDif, userNumber, resultSum, resultSquare);
    }
}
