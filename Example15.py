# Напишите программу, в которой Пользователь вводит два числа, а программой вычисляется и отображается сумма и разность этих чисел


class Main:

    userNum1 = int(input("Введите 1 число: "))
    userNum2 = int(input("Введите 2 число: "))

    print(userNum1 + userNum2, userNum1 - userNum2 if userNum1 > userNum2 else userNum2 - userNum1)