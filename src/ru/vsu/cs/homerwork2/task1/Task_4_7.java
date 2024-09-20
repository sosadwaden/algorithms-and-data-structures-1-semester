package ru.vsu.cs.homerwork2.task1;

import java.util.Scanner;

public class Task_4_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x для первой функции: ");
        double x1 = scanner.nextDouble();
        double result1 = calculateFirstFunction(x1);

        System.out.println("Значение первой функции при x = " + x1 + ": " + result1);

        System.out.print("Введите значение x и a для второй функции: ");
        double x2 = scanner.nextDouble();
        double a = scanner.nextDouble();
        double result2 = calculateSecondFunction(x2, a);

        System.out.println("Значение второй функции при x = " + x2 + " и a = " + a + ": " + result2);
    }

    public static double calculateFirstFunction(double x) {
        double numerator = 1; // числитель
        double denominator = 1; // знаменатель

        for (int i = 2; i <= 64; i += 2) {
            numerator *= (x - i); // умножаем числитель на (x - 2), (x - 4), ..., (x - 64)
        }

        for (int i = 1; i <= 63; i += 2) {
            denominator *= (x - i); // умножаем знаменатель на (x - 1), (x - 3), ..., (x - 63)
        }

        return numerator / denominator;
    }

    public static double calculateSecondFunction(double x, double a) {
        double result = x;

        for (int i = 0; i < 6; i++) {
            result = (result - a) * x;
        }

        return result;
    }


}
