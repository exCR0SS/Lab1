# Напишите программу, в которой Пользователь вводит имя и год рождения, в программа отображает сообщение содержащее имя пользователя и его возраст.
# Тоже в одну строку по приколу


import datetime

class Main:

    print("Возраст: ", int(datetime.datetime.today().year - (int(input("Введите год рождения или возраст: ")))), "\nИмя: ", str(input("Введите имя: ")))