package ru.vsu.cs.homerwork2.task3;

/**
 * Для вычисления функции arcsin(x) с использованием ряда Тейлора и для выполнения задач с использованием
 * только одного цикла нам надо выразить An (n-ый член ряда) через An-1, x и n.
 * В общем виде: An = ((2n - 1)!!) / (2^n * n!) * (x^2n+1) / (2n + 1)
 * An = An-1 * ((2n-1) * x^2) / (2n * (2n + 1))
 */
public class Task_6_11 {

    public static void main(String[] args) {
        double x = 0.5;  // Значение x в интервале (-1, 1)
        int n = 10;      // Количество слагаемых
        double e = 0.1;  // Порог для абсолютной величины

        // Переменные для хранения результатов
        double sumN = 0.0;
        double sumE = 0.0;
        double sumE10 = 0.0;

        // Начальные значения для a_n
        double aPrev = x; // Это a_0

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                aPrev = aPrev * (2 * i - 1) * x * x / (2 * i * (2 * i + 1));
            }
            double aN = aPrev;

            // Вычисляем сумму n слагаемых
            sumN += aN;

            // Вычисляем сумму тех слагаемых, которые больше e
            if (Math.abs(aN) > e) {
                sumE += aN;
            }

            // Вычисляем сумму тех слагаемых, которые больше e/10
            if (Math.abs(aN) > e / 10) {
                sumE10 += aN;
            }
        }

        double arcsinMath = Math.asin(x);

        System.out.println("Сумма первых " + n + " слагаемых: " + sumN);
        System.out.println("Сумма слагаемых, абсолютная величина которых больше " + e + ": " + sumE);
        System.out.println("Сумма слагаемых, абсолютная величина которых больше " + (e / 10) + ": " + sumE10);
        System.out.println("Значение функции arcsin(x) с помощью Math: " + arcsinMath);
    }
}
