package ru.vsu.cs.homerwork1.task1;

import java.util.Scanner;

public class Task_1_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.print("Введите радиус третье число: ");
        int number3 = scanner.nextInt();

        findAverage(number1, number2, number3);
    }

    private static void findAverage(double number1, double number2, double number3) {
        double max = Math.max(number1, Math.max(number2, number3));
        double min = Math.min(number1, Math.min(number2, number3));

        double sum = number1 + number2 + number3;
        double average = sum - max - min;

        System.out.printf("Среднее число из чисел %.3f %.3f %.3f это: %f", number1, number2, number3, average);
    }
}
