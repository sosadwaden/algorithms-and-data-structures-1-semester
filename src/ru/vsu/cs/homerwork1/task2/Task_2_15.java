package ru.vsu.cs.homerwork1.task2;

import java.util.Scanner;

public class Task_2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        printString(number);
    }

    public static void printString(int number) {
        if (number < 0 && number > (-10) && number % 2 != 0) {
            System.out.println("Отрицательное нечетное однозначное число");
        } else if (number > 99 && number < 1000 && number % 2 == 0) {
            System.out.println("Положительное четное трехзначное число");
        } else if (number == 0) {
            System.out.println("Нулевое число");
        }
    }
}
