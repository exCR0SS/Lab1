// Напишите программу для вычисления суммы двух чисел. Оба числа вводятся пользователем. Для вычисления суммы используйте оператор +.

import java.util.Scanner;

public class Example13
{
       public static void main (String[] args)
       {
           Scanner in = new Scanner(System.in);

           System.out.println("Введите первое число: ");
           int firstNumber = in.nextInt();

           System.out.println("Введите второе число: ");
           int secondNumber = in.nextInt();

           int result = firstNumber + secondNumber;

           System.out.println("Результат: " + result);

       }
}
